//package dsa.implementation.practice.Array;
//
//import java.io.*;
//import java.util.*;
//
//
//public class Main {
//
//    private static class Racer {
//        String name;
//        long totalTime = 0;          // cumulative time until last processed event
//        long lapStartTime = 0;       // cumulative time at start of current lap
//        int expectedCheckpoint = 1;  // next checkpoint index expected (1..checkpointCount, then checkpointCount+1)
//        boolean lapInvalid = false;  // whether current lap is already invalid
//        int validLapCount = 0;       // number of valid laps completed
//        long fastestLapTime = Long.MAX_VALUE;
//        boolean finished = false;    // has seen 'F'
//
//        Racer(String name) {
//            this.name = name;
//        }
//
//        void newLap(long now) {
//            lapStartTime = now;
//            expectedCheckpoint = 1;
//            lapInvalid = false;
//        }
//    }
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String first = null;
//        while ((first = br.readLine()) != null) {
//            first = first.trim();
//            if (!first.isEmpty()) break;
//        }
//        if (first == null) return; // no input
//
//        String[] top = first.split("\\s*,\\s*");
//        int checkpointCount = Integer.parseInt(top[0]);
//        int lapCount = Integer.parseInt(top[1]);
//
//        Map<String, Racer> racers = new HashMap<>();
//
//        String line;
//        while ((line = br.readLine()) != null) {
//            line = line.trim();
//            if (line.isEmpty()) continue;
//
//            String[] parts = line.split("\\s*,\\s*");
//            if (parts.length != 3) continue; // ignore malformed lines
//
//            String name = parts[0];
//            String checkpointStr = parts[1];
//            int time = Integer.parseInt(parts[2]);
//
//            Racer r = racers.get(name);
//            if (r == null) {
//                r = new Racer(name);
//                racers.put(name, r);
//            }
//
//            // After finishing we ignore any extra events (safety).
//            if (r.finished) continue;
//
//            // advance racer's local time
//            r.totalTime += time;
//
//            if (checkpointStr.equals("L") || checkpointStr.equals("F")) {
//                // Close current lap
//                boolean isValidLap =
//                        !r.lapInvalid && r.expectedCheckpoint == checkpointCount + 1;
//                if (isValidLap) {
//                    long lapTime = r.totalTime - r.lapStartTime;
//                    r.validLapCount++;
//                    if (lapTime < r.fastestLapTime) {
//                        r.fastestLapTime = lapTime;
//                    }
//                }
//                if (checkpointStr.equals("F")) {
//                    r.finished = true;
//                } else {
//                    // Start next lap only if race not already logically finished
//                    r.newLap(r.totalTime);
//                }
//            } else {
//                // Must be of form "C-x"
//                if (checkpointStr.startsWith("C-")) {
//                    int dash = checkpointStr.indexOf('-');
//                    int idx = Integer.parseInt(checkpointStr.substring(dash + 1));
//
//                    // If already invalid for this lap, we just keep going.
//                    if (!r.lapInvalid) {
//                        // Valid checkpoint indices: 1..checkpointCount
//                        if (idx == r.expectedCheckpoint && idx >= 1 && idx <= checkpointCount) {
//                            r.expectedCheckpoint++;
//                        } else {
//                            // wrong / out-of-order checkpoint => lap invalid
//                            r.lapInvalid = true;
//                        }
//                    }
//                } else {
//                    // Unknown token – treat as making lap invalid
//                    r.lapInvalid = true;
//                }
//            }
//        }
//
//        // Determine winner
//        String winnerName = null;
//        long winnerTotalTime = Long.MAX_VALUE;
//        long winnerFastestLap = 0;
//
//        for (Racer r : racers.values()) {
//            // Must have finished and enough valid laps
//            if (!r.finished) continue;
//            if (r.validLapCount < lapCount) continue;
//            if (r.fastestLapTime == Long.MAX_VALUE) continue; // no valid lap at all
//
//            if (r.totalTime < winnerTotalTime ||
//                    (r.totalTime == winnerTotalTime && (winnerName == null || r.name.compareTo(winnerName) < 0))) {
//                winnerName = r.name;
//                winnerTotalTime = r.totalTime;
//                winnerFastestLap = r.fastestLapTime;
//            }
//        }
//
//        if (winnerName != null) {
//            System.out.println(winnerName + "," + winnerFastestLap);
//        } else {
//            // If problem guarantees a winner, this branch won't be used.
//            // Just print nothing or a fallback if needed.
//            System.out.println("NoWinner,0");
//        }
//    }
//}
//

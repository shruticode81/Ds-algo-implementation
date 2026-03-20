package dsa.implementation.practice.Companywise.NetaApp;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/*class RateLimiter {

int limit = 100;
boolean allowRequest(String userId, long timestamp){

}
}
Allow max 100 requests per minute per user. */
public class RateLimiter {
    HashMap<String, Queue<Long>> map = new HashMap<String, Queue<Long>>();
    boolean allowRequest(String userId, long timestamp){
        map.putIfAbsent(userId, new LinkedList<>());
        Queue<Long> queue = map.get(userId);
        while(!queue.isEmpty() && timestamp-queue.peek()>=60){
            queue.poll();
        }
        if(queue.size()>=100){return false;}
        queue.offer(timestamp);
        return true;

    }
    public static void main(String[] args) {

    }
}
import java.time.Duration;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ConcurrentHashMap;

public class SlidingWindowRateLimiter {

    private final int requestLimit;
    private final Duration timeWindow;
    private final ConcurrentHashMap<String, Deque<Long>> customerRequests = new ConcurrentHashMap<>();

    public SlidingWindowRateLimiter(int requestLimit, Duration timeWindow) {
        this.requestLimit = requestLimit;
        this.timeWindow = timeWindow;
    }

//    public boolean isAllowed(String customerId) {
//        long now = System.currentTimeMillis();
//        long windowStart = now - timeWindow.toMillis();
//
//        // Each customer gets a deque (list of timestamps)
//        Deque<Long> requestTimes = customerRequests.computeIfAbsent(customerId, id -> new ArrayDeque<>());
//
//        synchronized (requestTimes) {  // synchronize on per-customer queue
//            // Remove timestamps older than the sliding window
//            while (!requestTimes.isEmpty() && requestTimes.peekFirst() < windowStart) {
//                requestTimes.pollFirst();
//            }
//
//            if (requestTimes.size() < requestLimit) {
//                // Allow request and log timestamp
//                requestTimes.addLast(now);
//                return true;
//            } else {
//                // Deny request
//                return false;
//            }
//        }
//    }
}

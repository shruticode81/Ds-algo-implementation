package dsa.implementation.practice.Backtracking;

public class LargestKSwap {
    public static String findMaximumNum(String s, int k) {
        // code here.
        StringBuilder str = new StringBuilder(s);
        StringBuilder res = new StringBuilder(s);

        solverFindMaxNum(str, 0, k, res);
        return res.toString();
    }

    static void solverFindMaxNum(StringBuilder str, int start, int k, StringBuilder res){
        // base cond
        if(k==0 || start == str.length()-1){
            return;
        }

        //find max in string
        int maxDigit = str.charAt(start) -'0';
        for(int i=start+1; i<str.length(); i++){
            maxDigit = Math.max(str.charAt(i)-'0', maxDigit);
        }
        if(maxDigit == str.charAt(start)){
            solverFindMaxNum(str, start+1, k, res);
            return;
        }

        for(int i = start+1; i<str.length(); i++){
            if(str.charAt(start)<str.charAt(i) && str.charAt(i) -'0' == maxDigit){
                //swap start with i
                char temp = str.charAt(start);
                str.setCharAt(start, str.charAt(i));
                str.setCharAt(i, temp);
                //check if it's the largest digit
                matchDigit(str.toString(), res);

                // call recursive for next swap
                solverFindMaxNum(str, start+1, k-1, res);

                //backtrack (swap again)
                // temp = str.charAt(start);
                str.setCharAt(i, str.charAt(start));
                str.setCharAt(start,temp);

            }
        }
        // solverFindMaxNum(str, start+1, k, res);


    }

    static void matchDigit(String curr, StringBuilder res){
        if(curr.compareTo(res.toString())>0){
            res.replace(0, res.length(), curr);
        }
    }

    public static void main(String[] args) {
        String s = "129814999";
        int k = 4;
        String res = findMaximumNum(s,k);
        System.out.println(res);
    }
}

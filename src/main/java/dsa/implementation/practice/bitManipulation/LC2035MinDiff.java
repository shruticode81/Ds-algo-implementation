package dsa.implementation.practice.bitManipulation;

public class LC2035MinDiff {
//    public static generateSubSetLeftAndRightSum()
//    public static void main(String[] args) {
//
//    }
}


//class Solution {
//    private:
//    long long min(long long a, int b){
//        if(a>b)return b;
//        return a;
//    }
//    long long minl(long long a, long long b){
//        if(a>b)return b;
//        return a;
//    }
//    public:
//    int minimumDifference(vector<int>& arr) {
//        long long n = arr.size();
//        long long mini=INT_MAX; long long totSum=0;
//        for (long long i = 0; i < n; i++) {
//            mini=min(mini, arr[i]);
//        }
//        for (long long i = 0; i < n; i++) {
//            arr[i]-=mini;
//        }
//        for (long long i = 0; i < n; i++) {
//            totSum += arr[i];
//        }
//
//        vector < bool > prev(totSum + 1, false);
//
//        prev[0] = true;
//
//        if (arr[0] <= totSum)
//            prev[arr[0]] = true;
//
//        for (long long ind = 1; ind < n; ind++) {
//            vector < bool > cur(totSum + 1, false);
//            cur[0] = true;
//            for (long long target = 1; target <= totSum; target++) {
//                bool notTaken = prev[target];
//
//                bool taken = false;
//                if (arr[ind] <= target)
//                    taken = prev[target - arr[ind]];
//
//                cur[target] = notTaken || taken;
//            }
//            prev = cur;
//        }
//
//        mini = 1e9;
//        for (long long i = 0; i <= totSum; i++) {
//            if (prev[i] == true) {
//                long long diff = abs(i - (totSum - i));
//                mini = minl(mini, diff);
//            }
//        }
//        return (int)mini;
//    }
//
//};
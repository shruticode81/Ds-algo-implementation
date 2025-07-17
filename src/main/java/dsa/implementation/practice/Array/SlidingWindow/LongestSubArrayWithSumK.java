package dsa.implementation.practice.Array.SlidingWindow;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int arr[] = {4,1,1,1,2,3,5};
//        {4,1,1,1,-2,3,5}
        int i=0,j=0;
        int k = 5;
        int max=0;
        int sum=0;
        int size=arr.length;
        while(j<size) {
            sum=sum+arr[j];
            if(sum<k){
                j++;
            } else if (sum == k) {
                max = Math.max(max, j-i+1);
                j++;
            } else if (sum>k) {
                while(sum>k) {
                    sum=sum-arr[i];
                    i++;
                }
                j++;
            }
        }
        System.out.println(max);
    }
}
//j=5
//// sum=8
//max= 4
//i=1
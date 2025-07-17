package dsa.implementation.practice.hashing;

/**
 * Subarray with zero sum
 *  input arr = [1,4,13,-3,-10,5]
 *  output : yes -> subarray exist {13,-3,-10}
 * */
public class SubarrayZeroSum {
    public static void main(String args[]) {

        int arr[] = {1,4,13,-3,-10,5};

        CalSubArraySumZero c = new CalSubArraySumZero();
        c.findSubarraySum(arr);
        System.out.println();

    }

}

 class CalSubArraySumZero{
    boolean findSubarraySum(int[] arr) {

        return true;
    }

}

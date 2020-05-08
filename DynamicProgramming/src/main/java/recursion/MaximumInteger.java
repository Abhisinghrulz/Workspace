package recursion;

/**
 * Given an array of Integers, write a function which reuses recursion to find the maximum
 */

public class MaximumInteger {
    public static void main(String[] args) {
        int [] arr = {4,3,6,7,0,9,2};
        int max = findMax(arr, arr.length-1, 0);
        System.out.println(max);
    }

    private static int findMax(int[] arr, int count, int max) {
        if(count==-1)
        {
            return max;
        }
        if(arr[count]>max)
        {
            max = arr[count];
        }
        return findMax(arr, count-1, max);
    }
}

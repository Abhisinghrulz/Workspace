package recursion;

/**
 * Given an array, write a recursive function to check if the elements of array are in sequence
 */
public class Sequence {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7};
        System.out.println(findSequence(arr, arr.length-1));
    }

    private static boolean findSequence(int[] arr, int count) {
        if(count==0)
        {
            return true;
        }
        if(arr[count]-1!=arr[count-1])
        {
            return false;
        }
        count = count-1;
        return findSequence(arr, count);
    }
}

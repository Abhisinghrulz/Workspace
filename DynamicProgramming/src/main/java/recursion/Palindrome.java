package recursion;

/**
 * Given a String, write a function which uses recursion to check if its palindrome.
 * A palindrome is a String which is same when read from either direction.
 */
public class Palindrome {

    public static void main(String[] args) {
        String org = "MADAMA";
        String rev = "";
        System.out.println(findPalindrome(org, org.length()-1, rev));
    }

    private static boolean findPalindrome(String org, int count, String rev) {
        if(count==-1)
        {
            return org.equalsIgnoreCase(rev);
        }
        rev = rev + org.charAt(count);
        return findPalindrome(org, count-1, rev);
    }


}


package solutions;

public class PalindromePartitioning {
    public static void main(String[] args) {
        palindromePartition("nitin", "");
    }
    public static void palindromePartition(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i=1; i<=str.length(); i++) {
            String chopped = str.substring(0, i);
            String remaining = str.substring(i);
            if (isPalindrome(chopped)) {
                palindromePartition(remaining, ans + "," + chopped);
            }
        }
    }
    public static boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}

package solutions;

public class StrictlyIncreasingNumbers {
    public static void main(String[] args) {
        printStrictlyIncreasing("", -1, 3);
    }
    public static void printStrictlyIncreasing(String curr, int last_digit, int n) {
        if(n==0) {
            System.out.println(curr);
            return;
        }

        for(int i=last_digit+1;i<=9;i++) {
            printStrictlyIncreasing(curr+i, i, n-1);
        }
    }
}

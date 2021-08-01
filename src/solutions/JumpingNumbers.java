package solutions;

//jumping numbers have the consecutive digits difference = 1;
//sorting by most significant digit
public class JumpingNumbers {
    public static void main(String[] args) {
        for(int i=0; i<=9;i++) {
            printJumpingNumbers(1000, i);
        }
    }
    public static void printJumpingNumbers(int n, int current){
        if(current > n){
            return;
        }
        System.out.println(current);
        int digit=current%10;
        if(digit!=0) {
            printJumpingNumbers(n, current * 10 + digit - 1);
        }
        if(digit!=9) {
            printJumpingNumbers(n, current * 10 + digit + 1);
        }
    }
}

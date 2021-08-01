package solutions;

//jumping numbers have the consecutive digits difference = 1;
//sorting by most significant digit
public class JumpingNumbers {
    public static void main(String[] args) {
       printJumpingNumbers(105,0);
    }
    public static void printJumpingNumbers(int n, int current){
        if(current > n){
            return;
        }
        System.out.println(current);
        if(current==0){
            for (int i = 1; i <= 9; i++) {
                printJumpingNumbers(n,i);
            }
            return;
        }
        int digit=current%10;
        if(digit!=0) {
            printJumpingNumbers(n, current * 10 + digit - 1);
        }
        if(digit!=9) {
            printJumpingNumbers(n, current * 10 + digit + 1);
        }
    }
}

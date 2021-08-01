package solutions;

public class CountingLexicographically {
    public static void main(String[] args) {
        printCountingLexicographically(1000, 0);
    }
    public static void printCountingLexicographically(int n, int current){
        if(current>n){
            return;
        }

        System.out.println(current);
        int i=0;
        if(current==0){
            i=1;
        }
        for(;i<=9; i++){
            printCountingLexicographically(n,current*10+i);
        }
    }
}

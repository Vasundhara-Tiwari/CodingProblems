package solutions;

public class NoConsecutiveHeads {

    public static void main(String[] args) {
        noConsecutiveHeads(5,"",false);
    }
    public static void noConsecutiveHeads(int n, String ans, boolean check){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(!check) {
            noConsecutiveHeads(n - 1, ans + "H", true);
        }
        noConsecutiveHeads(n-1,ans+"T",false);
    }
}

package solutions;

public class GenerateValidParenthesisPair {
    public static void generateParenthesis(int n, int opening, int closing, String ans){
        if(opening == n && closing == n){
            System.out.println(ans);
            return;
        }
        if(opening > n || closing > n || closing > opening){
            return;
        }
        generateParenthesis(n, opening+1, closing, ans+"(");
        generateParenthesis(n, opening, closing+1, ans+")");
    }
}

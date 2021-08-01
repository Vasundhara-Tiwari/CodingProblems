package solutions;

public class Permutations {
    public static void main(String[] args) {
        possiblePermutations("abcd", "");
    }
    public static void possiblePermutations(String str, String ans){


        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String sp = str.substring(0,i) + str.substring(i+1);
            possiblePermutations(sp, ans+ch);
        }

    }
}

package solutions;

import java.util.Scanner;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int len=0;
        s=s.strip();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) !=' ')
                len++;
            else
                break;
        }
        return len;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
    }
}

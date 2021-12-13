package solutions;

public class ConsecutiveCharacters {
    public static void main(String[] args) {

    }
    public int maxPower(String s){
        int max = 1, count = 1;
        for(int i=0;i<s.length()-1;i++) {
            if(s.charAt(i)==s.charAt(i+1)) {
                count++;
            }
            else{
                max = Math.max(max, count);
                count = 1;
            }
        }
        return max;
    }
}

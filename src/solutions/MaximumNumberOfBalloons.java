package solutions;

import java.util.Scanner;

public class MaximumNumberOfBalloons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
    public int maxNumberOfBalloons(String text) {
        char[] arr = {'b', 'a', 'l','o', 'n'};
        int[] frequency = new int[arr.length];
        for(int j=0; j<arr.length; j++){
            int count = 0;
            for(int i=0; i<text.length(); i++){
                if(text.charAt(i) == arr[j]){
                    count++;
                }
            }
            frequency[j]=count;
        }
        frequency[2] /= 2;
        frequency[3] /= 2;

        return Math.min(frequency[0], Math.min(frequency[1], Math.min(frequency[2], Math.min(frequency[3], frequency[4]))));
    }
}

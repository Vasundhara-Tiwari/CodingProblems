package solutions;

import java.util.Arrays;

/**
 * Created by Vasundhara Tiwari
 * On 20-06-2022 at 19:28
 */

public class DataMigration {
    public static void main(String[] args) {
        String[] sourceArray = {"1234", "2325", "122363", "32435" };
        String[] destinationArray = {"1234", "2345", "122363", "32435" };
        int[] output = new int[2];
        int corruptedIndex = 0;
        for(int i = 0; i < sourceArray.length; i++){
            if(!sourceArray[i].equals(destinationArray[i])){
                output[1] = i+1;
                corruptedIndex = i;
            }
        }
        int result = Math.abs(1 - corruptedIndex) > (sourceArray.length-corruptedIndex) ? Math.abs(0 - corruptedIndex) : (sourceArray.length-corruptedIndex);
        output[0] = result-1;
        System.out.println(Arrays.toString(output));
    }
}

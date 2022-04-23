package solutions;

import java.util.List;

/**
 * Created by Vasundhara Tiwari
 * On 23-04-2022 at 22:09
 */

public class MaxTrailing {
    public static int maxTrailing(List<Integer> arr){
        int difference = 0;
        Integer max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i  = 0; i < arr.size(); i++) {
            if (max < arr.get(i)) {
                maxIndex = i;
                max = arr.get(i);
            }
        }
        for(int i=0; i < maxIndex; i++){
            if(arr.get(max) - arr.get(i) < difference){
                difference = arr.get(max) - arr.get(i);
            }
        }
        return difference;
    }
}
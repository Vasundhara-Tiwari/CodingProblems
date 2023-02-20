package solutions;

import java.util.Arrays;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        while(n>1){
            Arrays.sort(stones);
            int x=stones[n-1]-stones[n-2];
            n--;
            stones[n-1]=x;
        }
        return stones[0];
    }
}

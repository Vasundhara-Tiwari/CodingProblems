public class MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts{
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int maxh = horizontalCuts[0];
        for(int i=1;i<horizontalCuts.length;i++)
            maxh = Math.max(horizontalCuts[i]-horizontalCuts[i-1],maxh);
        maxh = Math.max(h-horizontalCuts[horizontalCuts.length-1],maxh);
    }
}

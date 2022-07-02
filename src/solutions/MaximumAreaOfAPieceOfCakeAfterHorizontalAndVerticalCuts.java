public class MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts{
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
    }
}

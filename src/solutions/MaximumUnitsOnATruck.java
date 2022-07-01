public class MaximumUnitsOnATruck{
  public int maximumUnits(int[][] boxTypes, int truckSize) {
    Arrays.sort(boxTypes, (x, y) -> y[1] - x[1]);
    int maxUnits = 0;
    for(int[] b : boxTypes) {
      int count = Math.min(b[0], truckSize);
      maxUnits += count * b[1];
      truckSize -= count;
      if(truckSize == 0) return maxUnits;
    }
    return maxUnits;
  }
}

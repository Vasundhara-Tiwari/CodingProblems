public class QueueReconstructionByHeight{
  public int[][] reconstructQueue(int[][] people) {
    Arrays.sort(people, (a,b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
  }
}

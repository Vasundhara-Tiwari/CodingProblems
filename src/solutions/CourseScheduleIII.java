public class CourseScheduleIII{
  public int scheduleCourse(int[][] courses) {
        var maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());
        Arrays.sort(courses, Comparator.comparingInt(course -> course[1]));
        
        return maxHeap.size();
    }
}

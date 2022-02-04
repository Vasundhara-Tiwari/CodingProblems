package solutions;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListIntersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        LinkedList<Integer> list1 = new LinkedList<>();
        for(int index = 0; index < number; index++)
            list1.add(scanner.nextInt());
        int m = scanner.nextInt();
        LinkedList<Integer> list2 = new LinkedList<>();
        for(int index = 0; index < m; index++)
            list2.add(scanner.nextInt());
        for(int index1 = 0; index1 < number; index1++) {
            for(int index2 = 0; index2 < m; index2++) {
                if(list1.get(index1) == list2.get(index2)) {
                    System.out.println(list1.get(index1));
                    return;
                }
            }
        }
        System.out.println("-1");
    }
}

package solutions;

import java.util.*;

public class ProblemDifficulties {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();
        while (test-->0){
            int[] arr = new int[4];
            for(int i=0; i<arr.length; i++){
                arr[i] = scn.nextInt();
            }
            ArrayList<Integer> al = new ArrayList<>();
            for(int i=0; i<arr.length; i++){
                if(!al.contains(arr[i])){
                    al.add(arr[i]);
                }
            }
            System.out.println(al);
            if(al.size() > 2){
                System.out.println(2);
            } else if(al.size() == 2){
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }


        /*for(int i=1; i<=test;i++) {
            Set<Integer> al = new HashSet<>();
            for (int j = 0; j < 4; j++) {
                al.add(scanner.nextInt());
            }
            if(al.size() > 2){
                System.out.println("2");
            } else if(al.size() == 2){
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }*/
    }
}

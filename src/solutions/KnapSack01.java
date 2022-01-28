package solutions;

import java.util.Scanner;

public class KnapSack01 {
    static int maximum(int a, int b)
    {
        return (a > b) ? a : b;
    }
    static int knapSack(int capacity, int weight[],
                        int values[], int size)
    {
        int i, w;
        int K[][] = new int[size + 1][capacity + 1];
        for (i = 0; i <= size; i++) {
            for (w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (weight[i - 1] <= w)
                    K[i][w]
                            = maximum(values[i - 1]
                                    + K[i - 1][w - weight[i - 1]],
                            K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
        return K[size][capacity];
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int capacity = scanner.nextInt();
        int weight[] = new int[num];
        for(int i = 0; i< num; i++){
            weight[i] = scanner.nextInt();
        }
        int values[] = new int[num];
        for(int i = 0; i< num; i++){
            values[i] = scanner.nextInt();
        }
        System.out.println(knapSack(capacity, weight, values, num));
    }
}

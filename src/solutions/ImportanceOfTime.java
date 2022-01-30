package solutions;

import java.util.*;

public class ImportanceOfTime {
    static class Queue {
        protected int size;

        protected int front;
        protected int[] data;

        public Queue() {
            this.size = 0;
            this.front = 0;
            this.data = new int[5];
        }

        public Queue(int cap) {
            this.size = 0;
            this.front = 0;
            this.data = new int[cap];
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return (size == 0);
        }

        public void enqueue(int item) throws Exception {
            if (this.size() == this.data.length) {
                int[] oa = this.data;
                int[] na = new int[oa.length * 2];
                for (int i = 0; i < this.size(); i++) {
                    int idx = (i + front) % oa.length;
                    na[i] = oa[idx];
                }

                this.data = na;
                this.front = 0;
            }
            this.data[(front + size) % this.data.length] = item;
            size++;
        }

        public int dequeue() throws Exception {if (this.size == 0) {
                throw new Exception("queue is empty");

            }

            int rv = this.data[front];
            front = (front + 1) % this.data.length;
            size--;

            return rv;

        }

        public int getFront() throws Exception {
            if (this.size == 0) {
                throw new Exception("queue is empty");
            }

            int rv = this.data[front];

            return rv;
        }

        public void display() {
            System.out.println();
            for (int i = 0; i < size; i++) {
                int idx = (i + front) % this.data.length;
                System.out.print(this.data[idx] + " ");
            }
            System.out.print("END");
        }


        public static int ImpofTime(Queue q, int[] orig_order) throws Exception {
            int count = 0;
            for (int i = 0; i < orig_order.length; i++) {
                int a = q.dequeue();
                if (a == orig_order[i]) {
                    count++;
                } else {
                    q.enqueue(a);
                    count++;
                    int b = q.dequeue();
                    while (b != orig_order[i]) {
                        q.enqueue(b);
                        b = q.dequeue();
                        count++;
                    }
                    count++;
                }
            }
            return count;
        }
    }
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        Queue q = new Queue();

        int n = scanner.nextInt();
        int[] process = new int[n];
        for (int i = 0; i < n; i++) {
            q.enqueue(scanner.nextInt());
        }

        for(int i = 0;i < n;i++){

            process[i] = scanner.nextInt();
        }



        System.out.print(q.ImpofTime(q,process));

    }
}

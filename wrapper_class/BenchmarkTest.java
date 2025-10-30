package wrapper_class;

import java.util.ArrayList;

public class BenchmarkTest {
    public static void main(String[] args) {
        int n = 1_000_000;
        int[] arr = new int[n];
        long start1 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        long sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i];
        }
        long end1 = System.nanoTime();
        long timeArray = end1 - start1;
        ArrayList<Integer> list = new ArrayList<>(n);
        long start2 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        long sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += list.get(i);
        }
        long end2 = System.nanoTime();
        long timeList = end2 - start2;
        System.out.println("Sum using int[] = " + sum1);
        System.out.println("Time (int[])     = " + timeArray / 1_000_000.0 + " ms");
        System.out.println("Sum using ArrayList<Integer> = " + sum2);
        System.out.println("Time (ArrayList) = " + timeList / 1_000_000.0 + " ms");
    }
}

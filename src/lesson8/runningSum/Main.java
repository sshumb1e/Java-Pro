package lesson8.runningSum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] runnigSum = new int [] { 22, 75, 24, 129 };
        int[] sum = new int[runnigSum.length];
        for(var i = 1; i < runnigSum.length; i++) {
            sum[0] = runnigSum[0];
            sum[i] = sum[i - 1] + runnigSum[i];
        }
        System.out.println(Arrays.toString(sum));
    }
}

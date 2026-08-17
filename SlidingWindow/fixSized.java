package SlidingWindow;

import java.util.Scanner;

public class fixSized {

  public static void maximumSumWindow(int[] arr) {
    int st = 0, ei = 0;
  }

  public static int MaxSum(int[] arr, int k) {
    int sum = 0;
    int maxsum = 0;

    for (int i = 0; i < k; i++) {
      sum += arr[i];
    }
    maxsum = sum;

    for (int i = k; i < arr.length; i++) {
      // add the next element
      sum += arr[i];

      // subtract the (i-k)th element
      sum -= arr[i - k];

      maxsum = Math.max(sum, maxsum);

    }
    return maxsum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = { 2, 1, 5, 1, 3, 2 };
    int k = 2;

    System.out.println(MaxSum(arr, k));
  }
}

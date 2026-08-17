import java.util.*;

public class main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while (t-- > 0) {

      int n = sc.nextInt();
      long k = sc.nextLong();

      long[] a = new long[n];
      long[] h = new long[n];

      for (int i = 0; i < n; i++) {
        a[i] = sc.nextLong();
      }

      for (int i = 0; i < n; i++) {
        h[i] = sc.nextLong();
      }

      long sum = 0;
      int left = 0;
      int ans = 0;

      for (int right = 0; right < n; right++) {

        // divisibility break
        if (right > 0 && h[right - 1] % h[right] != 0) {
          left = right;
          sum = 0;
        }

        sum += a[right];

        // fruit limit
        while (sum > k && left <= right) {
          sum -= a[left];
          left++;
        }

        ans = Math.max(ans, right - left + 1);
      }

      System.out.println(ans);
    }
  }
}

// import java.util.*;
// //---> 1840 C
// public class main {

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);

// int t = sc.nextInt();

// while (t-- > 0) {

// int n = sc.nextInt();
// int k = sc.nextInt();
// int q = sc.nextInt();

// long ans = 0;
// long len = 0;

// for (int i = 0; i < n; i++) {

// int temp = sc.nextInt();

// if (temp <= q) {
// len++;
// } else {
// if (len >= k) {
// ans += (len - k + 1) * (len - k + 2) / 2;
// }

// len = 0;
// }
// }
// if (len >= k) {
// ans += (len - k + 1) * (len - k + 2) / 2;
// }

// System.out.println(ans);
// }
// }
// }
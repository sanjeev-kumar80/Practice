package Codeforces;

import java.util.*;

public class TheWayToHome {
  static int d;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    d = sc.nextInt();
    String s = sc.next();
    int[] dp = new int[s.length() + 1];
    Arrays.fill(dp, -1);

    int ans = solvedp(0, s, dp);
    if (ans == Integer.MAX_VALUE) {
      System.out.println(-1);
    } else {
      System.out.println(ans);
    }
    // int ans = solve(0, s);

    // if (ans == Integer.MAX_VALUE) {
    // System.out.println(-1);
    // } else {
    // System.out.println(ans);
    // }

  }

  public static int solvedp(int idx, String str, int[] dp) {
    if (idx == str.length() - 1) {
      return 0;
    }
    if (dp[idx] != -1) {
      return dp[idx];
    }
    int ans = Integer.MAX_VALUE;

    for (int i = idx + 1; i <= Math.min(idx + d, str.length() - 1); i++) {
      if (str.charAt(i) == '1') {
        int result = solvedp(i, str, dp);

        if (result != Integer.MAX_VALUE) {
          ans = Math.min(ans, 1 + result);
        }
      }
    }
    return dp[idx] = ans;
  }

  public static int solve(int idx, String str) {
    if (idx == str.length() - 1) {
      return 0;
    }
    int ans = Integer.MAX_VALUE;

    for (int i = idx + 1; i <= Math.min(idx + d, str.length() - 1); i++) {
      if (str.charAt(i) == '1') {
        int result = solve(i, str);
        if (result != Integer.MAX_VALUE) {
          ans = Math.min(ans, 1 + result);
        }

      }
    }
    return ans;
  }
}

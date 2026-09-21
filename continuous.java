import java.util.*;

public class continuous {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t > 0) {
      int n = sc.nextInt();
      int m = sc.nextInt();

      if (helper(n, m)) {
        System.out.println("YES");
      } else {
        System.out.println("No");
      }

      t--;

    }

  }

  public static boolean helper(int n, int m) {
    if (m == n) {
      return true;
    }

    if (n < m)
      return false;

    if (n % 3 != 0)
      return false;

    boolean a = helper(n / 3, m);

    boolean b = helper(2 * (n / 3), m);

    return a || b;

  }

}
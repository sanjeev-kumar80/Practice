import java.util.*;

public class codeforce {

  static long a, b;
  static ArrayList<Long> path = new ArrayList<>();

  static boolean dfs(long x) {

    path.add(x);

    if (x == b) {
      return true;
    }

    if (x > b) {
      path.remove(path.size() - 1);
      return false;
    }

    // x * 2
    if (dfs(x * 2)) {
      return true;
    }

    // x * 10 + 1
    if (dfs(x * 10 + 1)) {
      return true;
    }

    // Backtrack
    path.remove(path.size() - 1);

    return false;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    a = sc.nextLong();
    b = sc.nextLong();

    if (dfs(a)) {
      System.out.println("YES");
      System.out.println(path.size());

      for (long x : path) {
        System.out.print(x + " ");
      }
    } else {
      System.out.println("NO");
    }
  }
}
import java.util.*;

public class Main {
  /**
   * Pair
   */
  public class Pair {
    int r;
    int c;

    Pair(int r, int c) {
      this.r = r;
      this.c = c;
    }
    // q1.add(new Pair(i,j))
    // Queue<Pair> q=new ArrayDeque<>();

  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    Print(arr);
  }

  public static void Print(int[][] arr) {
    int n = arr.length;

    Queue<Integer> q1 = new LinkedList<>();

    Queue<Integer> q2 = new LinkedList<>();

    boolean[][] flag = new boolean[n][n];

    q1.add(0);
    q2.add(0);
    flag[0][0] = true;

    while (q1.size() > 0 && q2.size() > 0) {

      int i = q1.poll();
      int j = q2.poll();

      // print that element
      System.out.print(arr[i][j] + " ");

      if (i < n && j + 1 < n && flag[i][j + 1] == false) {
        flag[i][j + 1] = true;
        q1.add(i);
        q2.add(j + 1);
      }

      if (i + 1 < n && j < n && flag[i + 1][j] == false) {
        flag[i + 1][j] = true;
        q1.add(i + 1);
        q2.add(j);
      }

    }
  }
}

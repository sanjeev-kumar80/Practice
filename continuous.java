import java.util.Scanner;

public class continuous {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int k = sc.nextInt();
    int ans = 0;
    String format = "111";
    for (int i = 0; i < str.length() - k; i++) {
      String sub = str.substring(i, i + k);
      if (sub.equals(format)) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}

import java.util.*;

public class codeforce {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while (t > 0) {
      String s = sc.next();
      System.out.println(lengthOfLongestSubstring(s));

      t--;
    }
  }

  public static int lengthOfLongestSubstring(String s) {

    HashSet<Character> set = new HashSet<>();

    int left = 0;
    int ans = 0;

    for (int right = 0; right < s.length(); right++) {

      while (set.contains(s.charAt(right))) {
        set.remove(s.charAt(left));
        left++;
      }

      set.add(s.charAt(right));

      ans = Math.max(ans, right - left + 1);
    }

    return ans;
  }
}
package recursion_practic;

import java.util.*;

public class Subset {

  public static void subsetNoDuplicate(int idx, int[] arr, List<List<Integer>> ans, List<Integer> ll) {
    if (idx == arr.length) {
      ans.add(new ArrayList<>(ll));
      return;
    }

    ll.add(arr[idx]);
    subsetNoDuplicate(idx + 1, arr, ans, ll);
    ll.remove(ll.size() - 1);
    int index = idx + 1;

    while (index < arr.length && arr[idx] == arr[index]) {
      index++;
    }

    subsetNoDuplicate(index, arr, ans, ll);
  }

  public static void subset(int idx, int[] arr, List<List<Integer>> ans, List<Integer> ll) {
    if (idx == arr.length) {
      ans.add(new ArrayList<>(ll));
      return;
    }

    ll.add(arr[idx]);
    subset(idx + 1, arr, ans, ll);
    ll.remove(ll.size() - 1);

    subset(idx + 1, arr, ans, ll);
  }

  public static void fun(String str, String ans) {
    // subset on string
    if (str.length() == 0) {
      System.out.print(ans + " ");
      return;
    }
    char ch = str.charAt(0);

    fun(str.substring(1), ans + ch);
    fun(str.substring(1), ans);
  }

  public static void main(String[] args) {
    // String str = "abc";
    // fun(str, "");
    int[] arr = { 1, 2, 2, 3 };
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> ll = new ArrayList<>();

    // subset(0, arr, ans, ll);
    subsetNoDuplicate(0, arr, ans, ll);

    for (List<Integer> ele : ans) {
      for (int i = 0; i < ele.size(); i++) {
        System.out.print(ele.get(i) + " ");
      }
      System.out.println();
    }
  }
}

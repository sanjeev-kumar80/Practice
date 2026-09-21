package Graph;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TopologicalSort {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    List<Integer> ll=new ArrayList<>();

  }
  public static void topo(int idx,List<List<Integer>> adj,boolean [] vis,List<Integer> ans){
    vis[idx]=true;

    for(int ele:adj.get(idx)){
      if(vis[ele]==false){
        topo(ele,adj,vis,ans);
        
      }
    }
    ans.add(idx);
  }

}

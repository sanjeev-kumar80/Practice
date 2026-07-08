package recursion_practic;
import java.util.*;
public class array_permutation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        array_per(arr, 0, ll, ans);
        System.out.println(ans);

    }
    public static void array_per(int [] arr,int idx,List<Integer> ll,List<List<Integer>> ans){
        // if(idx==arr.length) return ;
        ans.add(new ArrayList<>(ll));
        for(int i=idx;i<arr.length;i++){
            ll.add(arr[idx]);
            array_per(arr, idx+1, ll,ans);
            ll.remove(ll.size()-1);

        }
    }

}

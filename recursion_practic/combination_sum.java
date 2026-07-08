package recursion_practic;

import java.util.ArrayList;
import java.util.Scanner;

public class combination_sum {

      static void combination_in1D(int [] coin,int amount,String ans,int idx,ArrayList<Integer> ll){
        if(amount==0){
            System.out.println(ll);
            return ;
        }
        for(int i=idx;i<coin.length;i++){
            if(amount>=coin[i]){
                ll.add(coin[i]);
                combination_in1D(coin, amount-coin[i], ans+coin[i],i,ll);
                ll.remove(ll.size()-1); // backtracking
            }
        }
    }
    static void combination(int [] coin,int amount,String ans,int idx){
        if(amount==0){
            System.out.println(ans);
            return ;
        }
        for(int i=idx;i<coin.length;i++){
            if(amount>=coin[i]){
                combination(coin, amount-coin[i], ans+coin[i],i);
            }
        }
    }
    //in 2D arraylist
       static void permutation(int [] coin,int amount,String ans){
        if(amount==0){
            System.out.println(ans);
            return ;
        }
        for(int i=0;i<coin.length;i++){
            if(amount>=coin[i]){
                permutation(coin, amount-coin[i], ans+coin[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> ll=new ArrayList<>();
        int n=sc.nextInt();
        int [] arr= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int amount=sc.nextInt();
        // permutation(arr, amount, "");
        // combination(arr, amount, "", 0);
        combination_in1D(arr, amount, "", 0,ll);
    }
    
}

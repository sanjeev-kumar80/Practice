package recursion;

import java.util.*;
public class array {

    static boolean is_sorted(int [] arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return  false;
        }
        return is_sorted(arr, idx+1);
    }
    static ArrayList<Integer> all_idx(int [] arr,int target,int idx){
        ArrayList<Integer> ans=new ArrayList<>();

        if(idx>=arr.length){
            return  ans;
        }
        if(arr[idx]==target){
            ans.add(idx);
        }
        ArrayList<Integer> smallAns=all_idx(arr, target, idx+1);
        ans.addAll(smallAns);
        return ans;
    }

    static void print_targrt_all_idx(int [] arr,int target,int idx){
        if(idx>=arr.length){
            return;
        }
        if(arr[idx]==target){
            System.out.print(idx +" ");
        }
        print_targrt_all_idx(arr, target, idx+1);
    }
    static int idx_tar_find(int [] arr,int target,int idx){

        //return the first idx of the target
        if(idx>=arr.length){//base case
            return -1;
        }
        if(arr[idx]==target){
            return idx;
        }

        return idx_tar_find(arr, target, idx+1);

    }
    static boolean target_find(int [] arr,int idx,int target){
        //base case
        if(idx>=arr.length){
            return  false;
        }
        //self work
        if(arr[idx]==target){
            return true;
        }

        //recursive work
        if(target_find(arr, idx+1, target)){
            return true;
        }else{
            return false;
        }

    }
    static int ArraySum(int[] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int smallAns=ArraySum(arr, idx+1);
        return  arr[idx]+smallAns;
    }
    
    static int maxArray(int [] arr,int idx){
        if(idx==arr.length-1){//base case
            return  arr[idx];
        }
        int smallAns=maxArray(arr, idx+1);

        return Math.max(arr[idx],smallAns);

    }
    static void print_Array(int [] arr , int idx){

        //base case
    if(idx==arr.length){
        return;
    }
    //self work
    System.out.println(arr[idx]);

    //recursive work
    print_Array(arr, idx+1);
}

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(is_sorted(arr, 0));
        // System.out.println("enter the value of the target");
        // int target=sc.nextInt();
        // print_Array(arr, 0);
        // System.out.println(maxArray(arr, 0));
        // System.out.println(ArraySum(arr, 0));

        // if(target_find(arr, target, 0)){
        //     System.out.println(true);
        // }
        // else{
        //     System.out.println(false);
        // }

        //find the target idx of thew element
        // int idx=idx_tar_find(arr, target, 0);
        // System.out.println(idx);

        //all the idx of the element
        // print_targrt_all_idx(arr, target, 0);

        // ArrayList<Integer> ans=all_idx(arr, target, 0);
        // for(int num:ans){
        //     System.out.println(num);
        // }

    }
    
}




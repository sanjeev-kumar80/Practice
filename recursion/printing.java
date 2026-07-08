package recursion;

import java.util.Scanner;

public class printing {

     public static void asending_order(int n){
        // print in asending_order
        if(n==1){//base case
            System.out.println(1);
            return;
        }

        //recursive work 
        asending_order(n-1);
        // self work
        System.out.println(n);
    }
    public static void natural_no_print(int n){
        // print in decending order
        if(n==1){//base case
            System.out.println(1);
            return;
        }

        System.out.println(n);
        natural_no_print(n-1);
    }
    public static void printing_using_recursion(int [] arr){


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        // natural_no_print(n);
        asending_order(n);
        // int [] arr=new int [n];

        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // printing_using_recursion(arr);

    }
}

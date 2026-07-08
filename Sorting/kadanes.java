package Sorting;

import java.util.Scanner;

public class kadanes {
      public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       kadanes_method(arr);
    }
    public static void kadanes_method(int [] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        if(sum<0){
            sum=0;
        }
    }
    
}

package Sorting;

import java.util.Scanner;

public class Inseration {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        print(arr);
    }
     public static void print(int [] arr){
        for(int nums:arr){
            System.out.print(nums+" ");
        }
    }
    public static void sort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
           int min= min_index(arr,i);
            if(min!=i){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;

            }
        }
    }
    public static int  min_index(int [] arr,int i){
        int min=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[min]>arr[j]){
                min=j;
            }
        }
        return  min;
    }

}

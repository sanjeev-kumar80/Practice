package Sorting;

import java.util.Scanner;

public class bubble {
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
    public  static void sort(int [] arr){
        int n=arr.length;
        for(int i=1;i<arr.length;i++){
            // outer loop n-1 times
            for(int j=0;j<arr.length-i-1;j++){
                // inner loop n-i times
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
}

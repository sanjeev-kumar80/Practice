package Assignment_two;

import java.util.Scanner;

public class max_sum {
    
    public static int maxArraySum(int [] arr,int k){
        int maxSum=0;
        int windowSum=0;
        int start=0;
        for(int end=0;end<arr.length;end++){
            windowSum=windowSum+arr[end];
            if(end>=k-1){
                maxSum=Math.max(maxSum,windowSum);
                windowSum=windowSum-arr[start];
                start--;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int []arr= new int [n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int k=sc.nextInt();
	    int ans=maxArraySum(arr,k);
	    System.out.println(ans);
	}
}

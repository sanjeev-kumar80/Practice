package recursion;

import java.util.Scanner;

public class fibonacci {
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int prev=fibo(n-1);
        int prev_prev=fibo(n-2);

        int ans= prev+prev_prev;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fibo(i) + " ");
        }
        
    }
    
}

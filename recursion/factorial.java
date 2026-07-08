package recursion;

import java.util.Scanner;

public class factorial {

    public static int find(int [] arr,int item,int idx){
        if(idx>=arr.length){
            return -1;
        }

        if(arr[idx]==item){
            return idx;
        }
        return find(arr,item,idx+1);
    }
    public static void print_inr(int n){
        if(n==0 ) return;
        print_inr(n-1);
        System.out.println(n);
    }
    public static void print_dec(int n){
        if(n==0) return;
        System.out.println(n);
         print_dec(n-1);
         
    }

    public static int sum_of_natural(int n){
        if(n==1){
            return 1;
        }
        return n+sum_of_natural(n-1);
    }

    public static int power(int p,int q){
        if(q==0){
            return 1;
        }
        int smallans=power(p,q/2);

        if(q%2==0){
            return smallans*smallans;
        } else{
            return p*smallans*smallans;
        }
    }

    public static int power2(int p,int q){
        if(q==0){
            return 1;
        }
        int smallans=power2(p,q-1);
        return p*smallans;

    }

    public static int  fact(int n){
        if(n==0){
            return 1;
        }
        // int small_ans=fact(n-1);
        
        // int fact=n*small_ans;
        // return fact;
        return n*fact(n-1);
    }

    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        int [] arr={3,4,2,4,2};
        int item=2;
        System.out.println(find(arr,item,0));
        // int n=sc.nextInt();
        // System.out.println(fact(n));
        // System.out.println(power2(3,4));
        // System.out.println(sum_of_natural(n));
        // System.out.println(print_dec(n));
        // print_dec(n);
        // print_inr(n);
    }
    
}

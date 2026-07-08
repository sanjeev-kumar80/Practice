package recursion;


public class digit_sum {
    public static int digitSum(int n){
        if(n>0 && n<9){//base case
            return n;
        }
        int ans= digitSum(n/10)+n%10;
        return  ans;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(digitSum(n));
    }
    
}

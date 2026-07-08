package Sliding_window;

public class count_of_the_pailndrome {
    public static void main(String[] args) {
     String s="abc";
    int count=0;
    for(int i=0;i<s.length();i++){
        for(int j=i+1;j<=s.length();j++){
            if(pailindrome_check(s.substring(i, j))==true){
                count++;
            }
        }
    }
    System.out.println(count);
    }
    public static boolean pailindrome_check(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(right)==s.charAt(left)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
   
    
}

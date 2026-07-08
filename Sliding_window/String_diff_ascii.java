package Sliding_window;

import java.util.Scanner;

public class String_diff_ascii {
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);
    String s= sc.nextLine();
    // System.out.print(diff(s));
    System.out.println(toggle_case(s));
    }
    public static  String diff(String s){
        StringBuilder ans= new StringBuilder();
        ans.append(s.charAt(0));

        for(int i=1;i<s.length();i++){
            int diff=(int)s.charAt(i)-(int)s.charAt(i-1);
            ans.append(diff);
            ans.append(s.charAt(i));
        }
        return  ans.toString();
    }

    public static String toggle_case(String s){
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch>='A' && ch<='Z'){
                int c=(int) ch+32;
                ans.append((char)c);
            }
            else if(ch>='a' &&ch<='z'){
                int c=(int)ch-32;
                ans.append((char)c);
            }
        }
        return  ans.toString();
    }
}

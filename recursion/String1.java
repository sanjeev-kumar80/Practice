package recursion;

import java.util.Scanner;

public class String1 {

     static String reverse_of_String2(String str){
        if( str.length()==0){
            return "";

        }
        String currr =reverse_of_String2(str.substring(1));
          return currr+str.charAt(0);

    }

    static String reverse_of_String(String str,int idx){
        if(idx>= str.length()){
            return "";

        }
        char currr =str.charAt(idx);
          return reverse_of_String(str, idx+1)+currr;

    }
    static String removeA2(String str){
        if(str.length()==0){
            return "";
        }
         

        //recursive work
        String smallAns=removeA2(str.substring(1));

        //self work
        char currentchar=str.charAt(0);

        if(currentchar!='a'){
            return currentchar+smallAns;
        }else{
            return  smallAns;
        }
    }
    public static String removeA(String str,int idx){

        //base case
        if(idx>=str.length()){
            return " ";
        }

        //recursive work
        String smallAns=removeA(str, idx+1);

        //self work
        char currentchar=str.charAt(idx);

        if(currentchar!='a'){
            return currentchar+smallAns;
        }else{
            return  smallAns;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String str=sc.nextLine();
        // System.out.println(removeA(str, 0));
        // System.out.println(removeA2(str));
        // System.out.println(reverse_of_String(str, 0));



    }
}

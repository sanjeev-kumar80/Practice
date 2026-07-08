package Sliding_window;

public class longest_string_none_repet {
    public static void main(String[] args) {
        String s="ABDEFGABEF";
        System.out.println(longest(s));
    }
    public static int longest(String s){
        int ans=0,ei=0,si=0;
        int [] freq=new int [256];
        while(ei<s.length()){
            char ch=s.charAt(ei);
            freq[ch]++;

            while(freq[ch]>1){
                freq[s.charAt(si)]--;
                si++;
            }
            ans=Math.max(ans, ei-si+1);
            ei++;
        }
        return  ans;
    }
}

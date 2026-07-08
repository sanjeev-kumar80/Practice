package Sliding_window;
import java.util.*;
public class maximum_freq_of_char {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println((char)max_freq(s));
    }

    public static int max_freq(String s){
        int [] freq= new int [256];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch]++;

        }
        int maximum=maximum_index(freq);
        return maximum;
    }
    public static int maximum_index(int [] arr){
        int mx_idx=0;
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                mx_idx=i;
            }
        }
        return mx_idx;
    }
}

package Stack;

import java.util.Stack;

public class copy_stack {
    public static void main(String[] args) {
        //original stack---->reverse of the stack---->again reverse 
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.err.println(st);

        Stack<Integer> gt=new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        System.err.println(gt);

        Stack<Integer> rt=new Stack<>();

        while (gt.size()>0) {
            rt.push(gt.pop());
            
        }
        System.out.println(rt);
    }
    
}

package recursion_practic;

import java.util.Scanner;

public class queen_siiting_arrangment {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        boolean board[]=new boolean[n];
        int tq=sc.nextInt();
        arrangnment(board, tq, "", 0);
    }
    public static void arrangnment(boolean  [] board,int tq,String ans,int qsqf){
        if(qsqf==tq){
            System.out.println(ans);
            return;
        }
        //permutation
        for(int i=0;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                arrangnment(board, tq, ans+"b"+i+"q"+qsqf, qsqf+1);
                board[i]=false;
            }
        }
        
    }
}

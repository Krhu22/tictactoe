package Tictactoe;
import java.util.Random;
import java.util.Scanner;
public class tic {
      public static void printBoard(char[][] board) {
        System.out.println("-----------");
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("---+---+---");
        }
        System.out.println("-----------");}
    public static void main(String[] args) {
        System.out.println("board skeleton =       " +" --------------\r\n" + //
                        "                         00  | 01 | 02  \r\n" + //
                        "                        -----+----+---\r\n" + //
                        "                         10  | 11 | 12  \r\n" + //
                        "                        -----+----+---\r\n" + //
                        "                         20  | 21 | 22\r\n" + //
                        "                        --------------");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        char[][] ttt = new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                ttt[i][j]=' ';
            }
        }
        System.out.println("current board ="); 
        printBoard(ttt);

        System.out.println("enter where you want your first move");
        int z = sc.nextInt();
        int x = sc.nextInt();
        ttt[z][x]='X';


        int l;
        int m;
        do {
             l = r.nextInt(3);
             m = r.nextInt(3);
        }while (
                ttt[l][m] !=' ')
        ;
        ttt[l][m]='O';
        System.out.println("computer chose "+l+" "+m);
        System.out.println("current board");
        printBoard(ttt);

        System.out.println("enter where you want your second move");
        int q = sc.nextInt();
        int w = sc.nextInt();
        ttt[q][w]='X';

        
        int e;
        int t;
        do {
             e = r.nextInt(3);
             t = r.nextInt(3);
        }while (
                ttt[e][t] !=' ')
        ;
        ttt[e][t]='O';
        System.out.println("computer chose "+e+" "+t);
        System.out.println("current board");
        printBoard(ttt);

        System.out.println("enter where you want your third move");
        int y = sc.nextInt();
        int u = sc.nextInt();
        ttt[y][u]='X';
        printBoard(ttt);
        if(ttt[0][0]=='X'&&ttt[0][1]=='X'&&ttt[0][2]=='X'||ttt[0][0]=='X'&&ttt[1][0]=='X'&&ttt[2][0]=='X'||ttt[0][0]=='X'&&ttt[1][1]=='X'&&ttt[2][2]=='X'||ttt[1][0]=='X'&&ttt[1][1]=='X'&&ttt[2][0]=='X'||ttt[2][0]=='X'&&ttt[2][1]=='X'&&ttt[2][2]=='X'||ttt[2][0]=='X'&&ttt[1][1]=='X'&&ttt[0][2]=='X'||ttt[0][1]=='X'&&ttt[1][1]=='X'&&ttt[2][1]=='X'||ttt[0][2]=='X'&&ttt[1][2]=='X'&&ttt[2][2]=='X'){
            System.out.println("you won");
        }
        else{
        int i;
        int O;
        do {
             i = r.nextInt(3);
             O = r.nextInt(3);
        }while (
                ttt[i][O] !=' ')
        ;
        ttt[i][O]='O';
        System.out.println("computer chose "+i+" "+O);
        System.out.println("current board");
        printBoard(ttt);
        if(ttt[0][0]=='O'&&ttt[0][1]=='O'&&ttt[0][2]=='O'||ttt[0][0]=='O'&&ttt[1][0]=='O'&&ttt[2][0]=='O'||ttt[0][0]=='O'&&ttt[1][1]=='O'&&ttt[2][2]=='O'||ttt[1][0]=='O'&&ttt[1][1]=='O'&&ttt[2][0]=='O'||ttt[2][0]=='O'&&ttt[2][1]=='O'&&ttt[2][2]=='O'||ttt[2][0]=='O'&&ttt[1][1]=='O'&&ttt[0][2]=='O'||ttt[0][1]=='O'&&ttt[1][1]=='O'&&ttt[2][1]=='O'||ttt[0][2]=='O'&&ttt[1][2]=='O'&&ttt[2][2]=='O'){
            System.out.println("compter won");
        }else{
        System.out.println("enter where you want your fourth move");
        int p= sc.nextInt();
        int a= sc.nextInt();
        ttt[p][a]='X';
        if(ttt[0][0]=='X'&&ttt[0][1]=='X'&&ttt[0][2]=='X'||ttt[0][0]=='X'&&ttt[1][0]=='X'&&ttt[2][0]=='X'||ttt[0][0]=='X'&&ttt[1][1]=='X'&&ttt[2][2]=='X'||ttt[1][0]=='X'&&ttt[1][1]=='X'&&ttt[2][0]=='X'||ttt[2][0]=='X'&&ttt[2][1]=='X'&&ttt[2][2]=='X'||ttt[2][0]=='X'&&ttt[1][1]=='X'&&ttt[0][2]=='X'||ttt[0][1]=='X'&&ttt[1][1]=='X'&&ttt[2][1]=='X'||ttt[0][2]=='X'&&ttt[1][2]=='X'&&ttt[2][2]=='X'){
            System.out.println("you won");
        }else{

        int d;
        int f;
        do {
             d = r.nextInt(3);
             f = r.nextInt(3);
        }while (
                ttt[d][f] !=' ')
        ;
        ttt[d][f]='O';
        System.out.println("computer chose "+d+" "+f);
        System.out.println("current board");
        printBoard(ttt);
         if(ttt[0][0]=='O'&&ttt[0][1]=='O'&&ttt[0][2]=='O'||ttt[0][0]=='O'&&ttt[1][0]=='O'&&ttt[2][0]=='O'||ttt[0][0]=='O'&&ttt[1][1]=='O'&&ttt[2][2]=='O'||ttt[1][0]=='O'&&ttt[1][1]=='O'&&ttt[2][0]=='O'||ttt[2][0]=='O'&&ttt[2][1]=='O'&&ttt[2][2]=='O'||ttt[2][0]=='O'&&ttt[1][1]=='O'&&ttt[0][2]=='O'||ttt[0][1]=='O'&&ttt[1][1]=='O'&&ttt[2][1]=='O'||ttt[0][2]=='O'&&ttt[1][2]=='O'&&ttt[2][2]=='O'){
            System.out.println("compter won");
        }else{
         System.out.println("enter where you want your fifth move");
        int g= sc.nextInt();
        int h= sc.nextInt();
        ttt[g][h]='X';
        printBoard(ttt);
        if(ttt[0][0]=='X'&&ttt[0][1]=='X'&&ttt[0][2]=='X'||ttt[0][0]=='X'&&ttt[1][0]=='X'&&ttt[2][0]=='X'||ttt[0][0]=='X'&&ttt[1][1]=='X'&&ttt[2][2]=='X'||ttt[1][0]=='X'&&ttt[1][1]=='X'&&ttt[2][0]=='X'||ttt[2][0]=='X'&&ttt[2][1]=='X'&&ttt[2][2]=='X'||ttt[2][0]=='X'&&ttt[1][1]=='X'&&ttt[0][2]=='X'||ttt[0][1]=='X'&&ttt[1][1]=='X'&&ttt[2][1]=='X'||ttt[0][2]=='X'&&ttt[1][2]=='X'&&ttt[2][2]=='X'){
            System.out.println("you won");
        }
        else{
            System.out.println("tied ");
        }
    }
} 
 }
 }
 }
}
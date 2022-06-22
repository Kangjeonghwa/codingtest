package ch10;

import java.util.Scanner;

public class checkerboard {
    public static char[][] arr;
    public static int min=64; 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        arr=new char[N][M];

        for(int i=0;i<N;i++){
            String s= sc.next();
            for(int j=0;j<M;j++){
                char c=s.charAt(j);
                arr[i][j]=c;
            }
        }
        int count=0;

        for(int i=0;i<N-7;i++){
            for(int j=0;j<M-7;j++){
               find(i,j);
            }
        }
        System.out.println(min);
        
    }
    public static void find(int x,int y){
        int count =0;
        char C=arr[x][y];

        for (int i=x;i<x+8;i++){
            for (int j=y;j<y+8;j++){
                if(arr[i][j]!=C){
                    count++;
                }
                if(C=='B'){
                    C='W';
                }
                else{
                    C='B';
                }
            }
            if(C=='B'){
                C='W';
            }
            else{
                C='B';
            }
        }
        count=Math.min(count, 64-count);
        min=Math.min(min, count);
    }
}

package ch10;

import java.util.Scanner;

public class Dungchi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt();

        int[][] arr = new int[N][2];

        for(int i=0;i<N;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        
        for(int j=0;j<N;j++){
            int rank=1;
            for(int k=0;k<N;k++){
                if(j==k) continue;
                if(arr[j][0]<arr[k][0]&&arr[j][1]<arr[k][1]){
                    rank++;
                }
            }
            System.out.print(rank+" ");
        }
        }
    
}

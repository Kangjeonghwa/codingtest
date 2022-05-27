package ch10;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int M=sc.nextInt();

        int arr[]=new int [N];
        int max=0;

        for(int a=0;a<N;a++){
            arr[a]=sc.nextInt();
        }

        for (int i=0;i<N-2;i++){
            for (int j=i+1;j<N-1;j++){
                for (int k=j+1;k<N;k++){
                    if ((arr[i]+arr[j]+arr[k])<=M && (arr[i]+arr[j]+arr[k])>max){
                        max=arr[i]+arr[j]+arr[k];
                    }
                }
            }
        }
        System.out.println(max);

        sc.close();
    }
    
}

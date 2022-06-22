package ch12;

import java.util.Scanner;

public class StringSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        String[] arr1=new String[N];
        String[] arr2=new String[M];
        int count=0;

        for(int i=0;i<N;i++){
            arr1[i]=sc.next();
        }
        for(int j=0;j<M;j++){
            arr2[j]=sc.next();
        }

        for(int j=0;j<M;j++){
            for(int i=0;i<N;i++){
                if(arr1[i].equals(arr2[j])){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

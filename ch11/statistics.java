package ch11;

import java.util.Arrays;
import java.util.Scanner;

public class statistics {
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        arr=new int[N];
        if(N%2==1){
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            
            System.out.println(ArithmeticMean(N));
            System.out.println(Midnum(N));
            //System.out.println();
            System.out.println(Boundary(N));
        }
    }
    public static int ArithmeticMean(int N){
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
        }
        return Math.round(sum/N);

    }
    public static int Midnum(int N){
        int mid=(N-1)/2;
        Arrays.sort(arr);
        return arr[mid];
    }
    public static int Mode(int N){
        return N;
    }
    public static int Boundary(int N){
        int min=0, max=0;
        Arrays.sort(arr);
        min=arr[0];
        max=arr[N-1];
        return max-min;
    }

}

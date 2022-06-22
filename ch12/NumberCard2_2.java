package ch12;

import java.util.HashMap;
import java.util.Scanner;

public class NumberCard2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>(N);
        for(int i=0;i<N;i++){
            int a=sc.nextInt();
            if(map.get(a)==null){
                map.put(a, 1);
            }
            else{
                map.put(a, map.get(a)+1);
            }
        }
        
        int M=sc.nextInt();

        for(int j=0;j<M;j++){
            int b=sc.nextInt();
            if(map.get(b)==null){
                System.out.print("0 ");
            }else{
                System.out.print(map.get(b)+" ");
            }
        }
    }
}

package ch12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PocketmonMaster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer, String> map1=new HashMap<>();
        HashMap<String, Integer> map2=new HashMap<>();
        int N=sc.nextInt();
        int M=sc.nextInt();
        String[] arr=new String [M];

        for(int i=0;i<N;i++){
            String s=sc.next();
            map1.put(i+1, s);
            map2.put(s, i+1);
        }
        for(int j=0;j<M;j++){
            arr[j]=sc.next();
        }
        for(int j=0;j<M;j++){
            if(Character.isDigit(arr[j].charAt(0))){
                int key=Integer.parseInt(arr[j]);
                System.out.println(map1.get(key));
            }
            else{
                System.out.println(map2.get(arr[j]));
            }
        }

    }
}

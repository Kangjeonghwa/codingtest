package ch11;

import java.util.Scanner;
import java.util.TreeSet;

public class alignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        TreeSet<Integer> set=new TreeSet<>();

        for(int i=0;i<N;i++){
            set.add(sc.nextInt());
        }
        for(Integer st: set){
            System.out.println(st);
        }
        
    }
}

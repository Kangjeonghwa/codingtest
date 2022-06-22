package ch12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SymmetricDifferentialSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();

        HashSet<Integer> set1=new HashSet<>(N);
        HashSet<Integer> set2=new HashSet<>(M);

        for(int i=0;i<N;i++){
            set1.add(sc.nextInt());
        }
        for(int j=0;j<M;j++){
            set2.add(sc.nextInt());
        }

        int ans = 0;
        for(int num : set1) {
            if(!set2.contains(num)) {
                ans += 1;
            }
        }
        for(int num : set2) {
            if(!set1.contains(num)) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}

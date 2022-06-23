package ch12;

import java.util.HashSet;
import java.util.Scanner;

public class NumOfDifferentString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        HashSet<String> set=new HashSet<>();

        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length()-i+1;j++){
                set.add(s.substring(j, j+i));
                //System.out.println(s.substring(j, j+i));
            }
        }
        System.out.println(set.size());
    }
}

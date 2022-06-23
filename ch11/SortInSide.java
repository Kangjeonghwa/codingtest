package ch11;

import java.util.Arrays;
import java.util.Scanner;

public class SortInSide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        int[] arr=new int[str.length()];

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            arr[i]=Character.getNumericValue(c);
        }
        Arrays.sort(arr);
        
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(arr[i]+"");
        }

    }    
}

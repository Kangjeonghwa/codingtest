package ch6;

import java.util.Arrays;
import java.util.Scanner;

public class Findalpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word=sc.nextLine();

        long[] arr=new long[26];
        Arrays.fill(arr, -1);

        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            int num=c-'a';

            if(arr[num]==-1){
                arr[num]=i;
            }
            
        }

        for(int j=0;j<26;j++){
            System.out.print(arr[j]+" ");
        }
        sc.close();
    }
}

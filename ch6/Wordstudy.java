package ch6;

import java.util.Scanner;

public class Wordstudy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String word=sc.nextLine();
        int[] arr=new int [26];

        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            int n=(int) c;
            if(n<91){
                n-=65;
            }
            else{
                n-=97;
            }
            arr[n]++;
        }
        int max=0;
        int maxnum=0;

        for(int j=0;j<26;j++){
            if(max<arr[j]){
                max=arr[j];
                maxnum=j;
            }
            else if(max==arr[j]){
                maxnum=-2;
            }
        }
        char a=(char)(maxnum+65);
        System.out.println(a);

        sc.close();

    }
}

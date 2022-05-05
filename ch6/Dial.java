package ch6;

import java.util.Scanner;

public class Dial {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);

            if(c=='A'||c=='B'||c=='C'){
                sum+=3;
            }
            else if(c=='D'||c=='E'||c=='F'){
                sum+=4;
            }
            else if(c=='G'||c=='H'||c=='I'){
                sum+=5;
            }
            else if(c=='J'||c=='K'||c=='L'){
                sum+=6;
            }
            else if(c=='M'||c=='N'||c=='O'){
                sum+=7;
            }
            else if(c=='P'||c=='Q'||c=='R'||c=='S'){
                sum+=8;
            }
            else if(c=='V'||c=='T'||c=='U'){
                sum+=9;
            }
            else if(c=='W'||c=='X'||c=='Y'||c=='Z'){
                sum+=10;
            }
        }
        System.out.println(sum);
    }
}

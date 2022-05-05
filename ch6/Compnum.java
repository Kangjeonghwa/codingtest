package ch6;

import java.util.Scanner;

public class Compnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num1=sc.next();
        String num2=sc.next();

        StringBuffer sb1=new StringBuffer(num1);
        int rev1=Integer.parseInt(sb1.reverse().toString());

        StringBuffer sb2=new StringBuffer(num2);
        int rev2=Integer.parseInt(sb2.reverse().toString());

        int result=(rev1>rev2?rev1:rev2);

        System.out.println(result);
        sc.close();
    }
}

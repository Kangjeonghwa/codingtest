package ch6;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String[] array=str.split(" ");

        System.out.println(array.length);
        sc.close();
    }
}

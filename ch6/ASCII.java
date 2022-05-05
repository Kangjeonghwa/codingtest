package ch6;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        char ch=sc.nextLine().charAt(0);

        int n=(int)ch;

        System.out.println(n);
        
        sc.close();
    }
    
}

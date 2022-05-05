package ch6;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class RepeatStr {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out)); 

        int t=sc.nextInt();
        
        for(int k=0;k<t;k++){
            int n=sc.nextInt();
            String str=sc.nextLine();

            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                for(int j=0;j<n;j++){
                    //System.out.print(c);
                    bw.write(c);
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        sc.close();
        
    }
}

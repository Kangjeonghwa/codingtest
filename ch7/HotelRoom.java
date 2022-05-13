package ch7;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0;i<T;i++){
            int H=sc.nextInt();
            int W=sc.nextInt();
            int N=sc.nextInt();

            int Roomnum= (N%H)*100+(N/H)+1;
            bw.write(Roomnum+"\n");
            
        }
        bw.flush();
        bw.close();
        sc.close();
    }
}

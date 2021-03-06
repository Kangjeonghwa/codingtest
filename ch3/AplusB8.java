package ch3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.StringTokenizer;
import java.io.IOException;

public class AplusB8 {
    /**
     *
     */
    private static final PrintStream OUT = System.out;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());

        for (int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write("Case #"+(i+1)+": "+a+"+"+b+"="+(a+b)+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

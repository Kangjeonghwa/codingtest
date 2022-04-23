package ch3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.StringTokenizer;
import java.io.IOException;

public class AplusB8 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        int sum=0;

        for (int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine()," ");
            sum = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
            //System.out.println("Case #"+(i+1)+": "+st.nextToken()+"+"+st.nextToken()+"="+sum);
        }
        br.close();
    }
}

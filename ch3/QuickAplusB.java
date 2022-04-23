package ch3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class QuickAplusB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String num, str;

        num=br.readLine();
        int N=Integer.parseInt(num);

        StringTokenizer st;
        var sb=new StringBuilder();

        for (int i=0;i<N; i++){
            str=br.readLine();
            st=new StringTokenizer(str," ");
            sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
            sb.append("\n");
        }
        //bw.write(sb);
        System.out.println(sb);

        bw.close();
        br.close();

    }
}

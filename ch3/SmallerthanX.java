package ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class SmallerthanX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st, str;
        
        st=new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        str = new StringTokenizer(br.readLine()," ");


        for(int i=0;i<N;i++){
            int a = Integer.parseInt(str.nextToken());
            if(a <X){
                System.out.printf("%d ",a);
            }
        }
        br.close();
    }
}

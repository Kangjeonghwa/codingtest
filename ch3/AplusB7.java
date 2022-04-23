package ch3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.StringTokenizer;
import java.io.IOException;

public class AplusB7 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        int arr[] = new int [N];

        for (int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine()," ");
            arr[i]=(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));

        }
        for (int j=0;j<N;j++){
            System.out.println("Case #"+(j+1)+": "+arr[j]);
        }
        br.close();


    }    
}

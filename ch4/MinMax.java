package ch4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinMax {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N=Integer.parseInt(br.readLine());
        int arr[] = new int [N];

        st=new StringTokenizer(br.readLine(), " ");
        
        for (int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int Min=arr[0];
        int Max=arr[0];

        for (int j=0; j<N;j++){
            if (Min>arr[j]){
                Min=arr[j];
            }
            if (Max<arr[j]){
                Max=arr[j];
            }
        }
        System.out.println(Min+" "+Max);
        br.close();
        
    }
}

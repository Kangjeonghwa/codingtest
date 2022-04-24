package ch4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Everage {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N=Integer.parseInt(br.readLine());
        double arr[] = new double [N];

        st=new StringTokenizer(br.readLine(), " ");
        
        for (int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        
        double Max=arr[0];

        for (int j=0; j<N;j++){
            if (Max<arr[j]){
                Max=arr[j];
            }
        }
        double sum=0;

        for (int k=0;k<N;k++){
            sum+=(arr[k]/Max)*100;
        }
        sum=sum/N;
        System.out.println(sum);
        br.close();
    }
}

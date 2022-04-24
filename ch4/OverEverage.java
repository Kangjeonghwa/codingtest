package ch4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class OverEverage {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int C=Integer.parseInt(br.readLine());
        

        for(int i=0;i<C;i++){
            st=new StringTokenizer(br.readLine()," ");
            int N=Integer.parseInt(st.nextToken());

            Double sum=(double) 0;
            int arr[]=new int [N];
            int count=0;

            for (int j=0;j<N;j++){
                arr[j]=Integer.parseInt(st.nextToken());
                sum+=arr[j];
            }
            sum=sum/N;
            for (int k=0;k<N;k++){
                if(arr[k]>sum){
                    count++;
                }
            }

            bw.write(((double)count/N)*100+"%\n");
        }
        bw.flush();
        br.close();
        bw.close();

    }
}

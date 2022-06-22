package ch12;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Scanner;

public class DutBoJob {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedWriter br=new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N=sc.nextInt();
        int M=sc.nextInt();
        HashMap<String,Integer> map=new HashMap<>(N);
        
        for(int i=0;i<N;i++){
            String a=sc.next();
            map.put(a, 1);
        }
        //String[] answer=new String[];
        int count=0;
        
        for(int j=0;j<M;j++){
            String s=sc.next();
            if(map.get(s) == 1){
                count++;
                br.write(s);
            }
        }
        System.out.println(count);
        br.flush();
        br.close();
    }
}

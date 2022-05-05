package ch5;

import java.io.IOException;
import java.util.Scanner;

class Test{
    long sum=0;

    long sum(int[] a){
        for (int element : a) {
            sum+=element;
        }
        return sum;
    }
}

public class SumofN {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int[] a=new int [n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        Test myTest=new Test();

        System.out.println(myTest.sum(a));
        
        sc.close();
        
    }
}

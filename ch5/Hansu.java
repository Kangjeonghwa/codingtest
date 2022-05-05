package ch5;

import java.util.Scanner;

class Test2{
    int count=0;
    int n;

    void counthansu(int num){
        //int[] array=new int[n];

        if(num<100){
            count = num;
        }
        else{
            count=99;
            for (int i=100;i<=num;i++){
                int a= i/100;
                int b= (i/10)%10;
                int c= i%10;

                if ((a-b)==(b-c)){
                    count++;
                }
            }
        }
    }

    int getCount(){
        return count;
    }
}

public class Hansu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        Test2 myTest2=new Test2();

        myTest2.counthansu(num);

        System.out.println(myTest2.getCount());
        
        sc.close();
    }
}

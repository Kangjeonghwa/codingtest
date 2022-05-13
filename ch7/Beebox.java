package ch7;

import java.util.Scanner;

public class Beebox {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int room=1;
        int cnt=1;

        while(true){
            if((room<num) && ((room+(6*cnt))>=num)){
                cnt+=1;
                System.out.println(cnt);
                break;
            }
            else{
                room=room+(6*cnt);
                cnt++;
            }

        }
        sc.close();
    }
}

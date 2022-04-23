import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A;
        int B;
        int C;
        int s1, s2, s3;

        A=sc.nextInt();
        B=sc.nextInt();
        
        C=B%10;
        s1=A*C;
        System.out.println(s1);
        C=(B/10)%10;
        s2=A*C;
        System.out.println(s2);
        C=B/100;
        s3=A*C;
        System.out.println(s3);
        System.out.println(A*B);
        sc.close();
    }
}

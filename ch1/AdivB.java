import java.util.Scanner;

public class AdivB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;

        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        System.out.println(num1/num2);

        sc.close();
    }
}

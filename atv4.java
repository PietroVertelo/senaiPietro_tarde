package atv_12;

import java.util.Scanner;

public class atv4 {
    static void main() {
        double s,r;
        int h,n;
        Scanner sc = new Scanner(System.in);
        System.out.printf("qual o seu numero trabalhador:");
        n = sc.nextInt();
        System.out.printf("qual o numero de horas trabalhadas:");
        h = sc.nextInt();
        System.out.printf("quanto voce ganha por hora:");
        s = sc.nextDouble();
        System.out.println("NUMBER= "+n);
        r = h*s;
        System.out.printf("SALARY= %.2f%n " ,r);
    }
}

package atv_12;

import java.util.Scanner;

public class atv6 {
    static void main() {
        double a , b ,c, d,e,f,g,h;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor de A:");
        a = sc.nextDouble();
        System.out.println();
        System.out.println("digite o valor de B:");
        b = sc.nextDouble();
        System.out.println();
        System.out.println("digite o valor de C:");
        c = sc.nextDouble();
        System.out.println();
        d =  (a*c)/2;
        e = (c*c)*3.14159;
        f =(a+b)*c/2;
        g = b*b;
        h = a*b;
        System.out.printf("TRIANGULO: %.3f%n ",d);
        System.out.printf("CIRCULO: %.3f%n " ,e);
        System.out.printf("TRAPEZIO: %.3f%n ",f);
        System.out.printf("QUADRADO: %.3f%n ",g);
        System.out.printf("RETANGULO: %.3f%n ",h);

    }
}

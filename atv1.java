package atv_12;

import java.util.Scanner;

public class atv1 {
    static void main() {
        int x, y;
        int z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um Número: ");
        x= sc.nextInt();
        System.out.println("Digite outro: ");
        y= sc.nextInt();
        z= x + y;
        System.out.printf("O Resultado da soma é: " + z );
    }
}

package atividade18;

import java.util.Scanner;

public class atv_6 {
    static String main() {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        int quantidade = 0;
        String resultado;
        String resp = null;
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite a nota" + i + ":");
            double nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota invalida, digite uma nota dentre 0 e 10");
                i--;
                continue;
            }
            soma += nota;
            resp = String.valueOf(nota / quantidade);


        }
        return resp;
    }public static void resultado(String resp){
        System.out.println("A media do aluno foi" + resp);
    }
}

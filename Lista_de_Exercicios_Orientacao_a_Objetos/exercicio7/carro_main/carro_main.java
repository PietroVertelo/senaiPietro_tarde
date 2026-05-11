package Lista_de_Exercicios_Orientacao_a_Objetos.exercicio7.carro_main;

import Lista_de_Exercicios_Orientacao_a_Objetos.exercicio7.program.carro_program;

import java.util.Scanner;

public class carro_main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        carro_program carro = new carro_program();

        System.out.println("digite o modelo do carro:");
        carro.modelo = sc.nextLine();

        System.out.println("digite a marca do carro:");
        carro.marca = sc.nextLine();

        System.out.println("digite a velocidade atual do seu carro:");
        carro.velocidadeAtual = sc.nextInt();

        System.out.println("voce deseja aumentar ou diminuir 10km da sua velocidade?" +
                "\n aumentar(1)" +
                "\n diminuir (2)");
        int opcao = sc.nextInt();
        if (opcao == 1) {
            carro.acelerar();
        } else if (opcao == 2) {
            carro.frear();
        } else {
            System.out.println("opçao invalida");
        }
        System.out.println("Dados finais do carro: " + carro.marca + " " + carro.modelo +
                " a " + carro.velocidadeAtual + "km/h.");

    }

}

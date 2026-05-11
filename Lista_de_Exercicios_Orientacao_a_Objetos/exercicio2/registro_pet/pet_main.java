package Lista_de_Exercicios_Orientacao_a_Objetos.exercicio2.registro_pet;
import Lista_de_Exercicios_Orientacao_a_Objetos.exercicio2.program.program;

import java.util.Scanner;

public class pet_main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        program dog1 = new program() ;
        System.out.println("insira o nome do primeiro cachorro:");
        dog1.nome= sc.nextLine();
        System.out.println("insira a raça do primeiro cachorro:");
        dog1.raca= sc.nextLine();
        System.out.println("adicione a idade do primeiro cachorro:");
        dog1.idade= sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        program dog2= new program();
        System.out.println("insira o nome do segundo cachorro:");
        dog2.nome=sc.nextLine();
        System.out.println("insira a raça do segundo cachorro:");
        dog2.raca= sc.nextLine();
        System.out.println("adicione a idade do segundo cachorro:");
        dog2.idade= sc.nextInt();

        dog1.latir();
        dog2.latir();



    }
}

package Lista_de_Exercicios_Orientacao_a_Objetos.exercicio3.calculadora_main;
import Lista_de_Exercicios_Orientacao_a_Objetos.exercicio3.program.program_area;

import java.util.Scanner;

public class calculadora_main {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        program_area calcular= new program_area();
        System.out.println("digite a base do retangulo:");
        calcular.base= sc.nextInt();
        System.out.println("digite a altura do retangulo:");
        calcular.altura= sc.nextInt();
      calcular.calcularArea();
    }


}

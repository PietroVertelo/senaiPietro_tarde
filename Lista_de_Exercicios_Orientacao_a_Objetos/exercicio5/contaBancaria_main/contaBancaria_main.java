package Lista_de_Exercicios_Orientacao_a_Objetos.exercicio5.contaBancaria_main;
import Lista_de_Exercicios_Orientacao_a_Objetos.exercicio5.program.program_Banco;

import java.util.Scanner;

public class contaBancaria_main {
    static void main (String[] args){
        Scanner sc= new Scanner(System.in);

        program_Banco dinheiro=new program_Banco();

        System.out.println("insira seu nome:");
        dinheiro.titular= sc.nextLine();

        System.out.println("insira seu saldo:");
        dinheiro.saldo= sc.nextDouble();

        System.out.println("voce deseja depositar(1) ou sacar(2):");
        int opcao= sc.nextInt();
        if (opcao==1){
            System.out.println("digite o valor do deposito:");
            double valorDep= sc.nextDouble();
            dinheiro.depositar(valorDep);

        } else if (opcao==2) {
            System.out.println("digite o valor do saque: ");
            double valorSaq= sc.nextDouble();
            dinheiro.sacar(valorSaq);

        }else {
            System.out.println("valor invalido!!");
        }
    }
}

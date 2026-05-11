package Lista_de_Exercicios_Orientacao_a_Objetos.exercicio4.estoque_main;
import Lista_de_Exercicios_Orientacao_a_Objetos.exercicio4.program.program_estoque;

import java.util.Scanner;

public class estoque_main {
    static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        program_estoque geral= new program_estoque();
        System.out.println("Digite o nome do produto:");
        geral.nome= sc.nextLine();
        System.out.println("Digite o preço do produto:");
        geral.preco= sc.nextInt();
        System.out.println("Adicione quantos produtos tem em estoque:");
        geral.quantidadeEstoque= sc.nextInt();
        geral.exibirResumo();

    }

}

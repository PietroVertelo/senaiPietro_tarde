package Exercicio_productData.main;
import Exercicio_productData.program.program_product;

import java.util.Scanner;

public class main_product {
    Scanner sc= new Scanner(System.in);

    public void main (String[] args){
        int quantity;
        program_product produto= new program_product();
        System.out.println("Digite o nome do produto:");
        produto.nome= sc.nextLine();

        System.out.println("Digite o preço do produto:");
        produto.preco= sc.nextDouble();

        System.out.println("Digite a quantidade em stock:");
        produto.stock= sc.nextInt();

        System.out.println(produto.TotalValuerStock());

        System.out.println("insira o numero de produtos a serem adicionados no estoque: ");
        quantity= sc.nextInt();
        produto.AddProducts(quantity);
        System.out.println(produto.TotalValuerStock());

        System.out.println("insira o numero de produtos a serem removidos no estoque: ");
        quantity= sc.nextInt();
        produto.RemoveProducts(quantity);
        System.out.println(produto.TotalValuerStock());




    }
}

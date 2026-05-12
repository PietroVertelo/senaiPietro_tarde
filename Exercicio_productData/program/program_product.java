package Exercicio_productData.program;

import java.util.Scanner;

public class program_product {
    public String nome;
    public double preco;
    public  int stock;
    Scanner sc= new Scanner(System.in);

    public String TotalValuerStock(){
        return ("nome do produto: ,"+nome+ ", $"+preco+", "+stock+" quantidade em stock ,total:$"+preco*stock);


    }
    public void AddProducts(int quantity){
        stock+=quantity;
    }
    public void RemoveProducts(int quantity){
       stock-=quantity;
    }
}

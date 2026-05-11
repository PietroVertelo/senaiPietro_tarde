package Lista_de_Exercicios_Orientacao_a_Objetos.exercicio4.program;

public class program_estoque {
    public String nome;
    public double preco;
    public int quantidadeEstoque;

    public void exibirResumo(){
        System.out.println("Nome do produto: "+ nome+
                "\nValor do produto: "+ preco +
                "\nQuantidade: "+ quantidadeEstoque+
                "\nPreço total: "+ preco*quantidadeEstoque);
    }
}

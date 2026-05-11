package Lista_de_Exercicios_Orientacao_a_Objetos.exercicio5.program;

public class program_Banco {
    public String titular;
    public double saldo;

    public void depositar(double valor){
        saldo += valor;
        System.out.println("O valor do seu saldo atual com o deposito é de: "+saldo);

    }
    public void sacar(double valor){
        if (valor<= saldo){
            saldo-= valor;
            System.out.println("saque realizado! Novo Saldo "+ saldo);
        } else {
            System.out.println("saldo insuficiente para sacar "+ valor);
        }
    }
}

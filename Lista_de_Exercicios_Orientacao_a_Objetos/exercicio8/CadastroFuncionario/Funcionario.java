package OOPList.CadastroFuncionario;

public class Funcionario {
    public String nome;
    public String sobrenome;
    public double salarioMensal;

    public double darAumento(){
        double salarioMensalporcentagem;
        salarioMensal = 2000.00;
        salarioMensalporcentagem = (salarioMensal*0.1);
        salarioMensal = (salarioMensal + salarioMensalporcentagem)*12;
        return salarioMensal;
    }
}

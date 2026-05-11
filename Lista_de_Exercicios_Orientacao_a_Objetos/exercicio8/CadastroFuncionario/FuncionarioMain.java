package OOPList.CadastroFuncionario;

import java.util.Scanner;

public class FuncionarioMain {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Funcionario func = new Funcionario();
        System.out.println("Qual o seu nome?");
        func.nome = sc.nextLine();
        System.out.println("Qual o seu sobrenome? ");
        func.sobrenome = sc.nextLine();
        System.out.println("Após o aumento, seu novo salário atual é: "+func.darAumento());
    }
}

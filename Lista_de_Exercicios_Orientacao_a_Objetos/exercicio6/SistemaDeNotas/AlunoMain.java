package OOPList.SistemaDeNotas;

import java.util.Locale;
import java.util.Scanner;

public class AlunoMain {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Aluno aluno = new Aluno();
        System.out.println("Digite o seu nome: ");
        aluno.nome = sc.nextLine();
        System.out.println("Digite sua matrícula: ");
        aluno.matricula = sc.nextInt();
        System.out.println("Digite sua nota do primeiro bimestre: ");
        aluno.num = sc.nextDouble();
        System.out.println("Digite sua nota do segundo bimestre: ");
        aluno.num = sc.nextDouble();
        System.out.println("Digite sua nota do terceiro bimestre: ");
        aluno.num = sc.nextDouble();
        aluno.calcularMedia();
        System.out.println();
        aluno.verificarSituacao();
    }
}

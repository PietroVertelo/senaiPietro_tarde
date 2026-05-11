package OOPList.SistemaDeNotas;



public class Aluno {
    public String nome;
    public int matricula;
    public int n = 3;
    public double num;
    public double sum=0.0;
    public double avg;
    public double[] notas = new double[n];

    public double calcularMedia() {
        for (int i = 0; i < n; i++) {
            notas[i] = num;
        }
        for (int i = 0;i<n;i++){
            sum+=notas[i];
        }
        return avg = sum/n;
    }
    public void verificarSituacao() {
        if (avg>=7) {
        System.out.println("Aprovado");
        } else if (avg<7) {
            System.out.println("Reprovado");
        }
    }
}

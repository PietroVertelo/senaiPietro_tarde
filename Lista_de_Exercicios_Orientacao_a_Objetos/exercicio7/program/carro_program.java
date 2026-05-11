package Lista_de_Exercicios_Orientacao_a_Objetos.exercicio7.program;

public class carro_program {
    public String modelo;
    public String marca;
    public int velocidadeAtual;

    public void acelerar(){
        velocidadeAtual+=10;
        System.out.println("sua velocidade atual é:"+velocidadeAtual);

    }
    public void frear(){
        if (velocidadeAtual >=10 ){
            velocidadeAtual -=10;
        }else {
            velocidadeAtual=0;
        }
        System.out.println("velocidade atual "+velocidadeAtual);

    }
}

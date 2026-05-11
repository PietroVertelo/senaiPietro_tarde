package Lista_de_Exercicios_Orientacao_a_Objetos.exercicio1.lampada;

public class lampada {
    public boolean ligada;

    public void ligar(){
        ligada= true;
    }
    public void desligar(){
        ligada= false;

    }

    public String observar() {
        if (ligada) {
            return " a lampada esta ligada";
        } else {
            return " a lampada esta desligadda";
        }

      }

    }


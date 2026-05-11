package Lista_de_Exercicios_Orientacao_a_Objetos.exercicio1.exemplos_lampada;

import Lista_de_Exercicios_Orientacao_a_Objetos.exercicio1.lampada.lampada;

public class estado_lampada {
    public static void main(String[] args) {

        lampada minhaLampada= new lampada();

        minhaLampada.ligar();
        System.out.println("Estado da lâmpada: " + minhaLampada.ligada);

        System.out.println(minhaLampada.observar());
    }
}

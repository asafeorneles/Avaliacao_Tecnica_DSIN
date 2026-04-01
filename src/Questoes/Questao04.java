package Questoes;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        int a = entrada.nextInt();

        System.out.println("Digite o valor de B");
        int b = entrada.nextInt();

        System.out.println("Digite o valor de C");
        int c = entrada.nextInt();

        boolean solucaoImpossivel = a == 0 && b == 0 && c != 1;

        if (solucaoImpossivel){
            System.out.println("Solução impossível");
        } else if (a + b == 0) {
            System.out.println("Solução impossível (divisão por zero)");
        }
        else {
            int valorDeX = (1 - c) / (a + b);
            System.out.println("Valor de x: " + valorDeX);
        }

    }
}

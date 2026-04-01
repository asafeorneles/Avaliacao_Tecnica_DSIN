package Questoes;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Valor de A");
        int a = entrada.nextInt();

        System.out.println("Valor de B");
        int b = entrada.nextInt();

        System.out.println("Valor de C");
        int c = entrada.nextInt();

        System.out.println("Valor de D");
        int d = entrada.nextInt();

        boolean condicao01 = b > c;
        boolean condicao02 = d > a;
        boolean condicao03 = (c + d) > (a + b);
        boolean condicao04 = c > 0 && d > 0;
        boolean condicao05 = a % 2 == 0;

        if (condicao01 && condicao02 && condicao03 && condicao04 && condicao05){
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores não aceitos");
        }
    }
}

package Questoes;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite as horas trabalhadas por dia");
        int horasPorDia = entrada.nextInt();

        System.out.println("Digite o preço da hora trabalhada");
        int precoHora = entrada.nextInt();

        System.out.println("Digite os dias trabalhados no mês");
        int diasTrabalhos = entrada.nextInt();

        double salarioBruto = horasPorDia * precoHora * diasTrabalhos;

        double desconto = salarioBruto * 0.03;

        double salarioLiquido = salarioBruto - desconto;

        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Desconto (3%): " + desconto);
        System.out.println("Salário Líquido: " + salarioLiquido);

        entrada.close();
    }
}

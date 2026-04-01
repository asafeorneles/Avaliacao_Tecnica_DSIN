package Questoes;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o titulo");
        String titulo = entrada.nextLine();

        System.out.println("Digite o subtítulo");
        String subtitulo = entrada.nextLine();

        printarFileiraCheia();
        printarFileiraVazia();
        printarFileiaTexto(titulo);
        printarFileiaTexto(subtitulo);
        printarFileiraVazia();
        printarFileiraCheia();
    }

    public static void printarFileiraCheia(){
        for (int i = 1; i <= 38; i++) {
            System.out.print("|");
        }
        System.out.println();
    }

    public static void printarFileiraVazia(){
        for (int i = 1; i <= 38; i++) {
            if (i == 1 || i == 2 || i == 37 || i == 38){
                System.out.print("|");
            }else {
                System.out.print(" ");
            }
        }
        System.out.println();

    }

    public static void printarFileiaTexto(String texto){
        int tamanhoTitulo = texto.length();
        int espacosTotais = 34 - tamanhoTitulo;
        int espacoEsquerda = espacosTotais / 2;
        int espacoDireita = espacosTotais - espacoEsquerda;

        System.out.print("||");
        for (int j = 0; j < espacoEsquerda; j++) {
            System.out.print(" ");
        }
        System.out.print(texto);
        for (int j = 0; j < espacoDireita; j++) {
            System.out.print(" ");
        }
        System.out.print("||");
        System.out.println();

    }

}

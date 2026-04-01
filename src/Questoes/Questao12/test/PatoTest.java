package Questoes.Questao12.test;

import Questoes.Questao12.domain.Pato;

public class PatoTest {
    public static void main(String[] args) {
        Pato frederico = new Pato("Frederico", "Branco", 13, 4.7);

        System.out.println(frederico);
        frederico.grasnar();
        frederico.andar();
        frederico.voar();
        frederico.nadar();
    }
}

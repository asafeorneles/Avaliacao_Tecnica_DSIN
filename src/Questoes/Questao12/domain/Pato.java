package Questoes.Questao12.domain;

public class Pato {
    private String nome;
    private String cor;
    private int peso;
    private double idade;

    public Pato(String nome, String cor, int peso, double idade) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
        this.idade = idade;
    }

    public void grasnar(){
        System.out.println("Quack! Quack!");
    }

    public void andar(){
        System.out.println(this.nome + " está andando...");
    }

    public void voar(){
        System.out.println(this.nome + " está voando... " + this.nome + " Caiu! Deve estar pesado: " + this.peso + "Kg");
    }

    public void nadar(){
        System.out.println("Splash! " + this.nome + " está nadando...");
    }

    @Override
    public String toString() {
        return "Pato{" +
               "nome='" + nome + '\'' +
               ", cor='" + cor + '\'' +
               ", peso=" + peso +
               ", idade=" + idade +
               '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }
}

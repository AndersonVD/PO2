package Aulas.tdd_class;

public class Pessoa {
    private int idade;

    public Pessoa(int idade) {
        this.idade = idade;
    }

    // public void setIdade(int idade) {
    // this.idade = idade;
    // }
    public String toString() {
        return Integer.toString(idade);
    };
}

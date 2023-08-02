package Atividades.atividade01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.Data;

public class main {
    public static void main(String[] args) {
        // Criar professores
        Professor professor1 = new Professor("Professor Alfredo");
        Professor professor2 = new Professor("Professor Caduco");
        Professor professor3 = new Professor("Professor Limonada");

        // Criar disciplinas
        Disciplina disciplina_mat = new Disciplina("Matemática", true);
        disciplina_mat.adicionarProfessor(professor1);
        disciplina_mat.adicionarProfessor(professor2);
        Disciplina disciplina_hist = new Disciplina("História", true);
        disciplina_hist.adicionarProfessor(professor2);
        Disciplina disciplina_prog = new Disciplina("Programação", true);
        disciplina_prog.adicionarProfessor(professor3);
        Disciplina disciplina_art = new Disciplina("Artes", false);

        // Criar fases
        Fase fase1 = new Fase(1);
        fase1.adicionarDisciplina(disciplina_mat);
        fase1.adicionarDisciplina(disciplina_hist);
        Fase fase2 = new Fase(2);
        fase2.adicionarDisciplina(disciplina_hist);
        Fase fase3 = new Fase(3);
        fase3.adicionarDisciplina(disciplina_prog);

        // Criar curso
        Curso curso = new Curso("Ciências da Computação");
        curso.adicionarFase(fase1);
        curso.adicionarFase(fase2);
        curso.adicionarFase(fase3);

        // Criar aluno e associá-lo ao curso
        Aluno aluno = new Aluno("Chico Xavier", curso);

        // Adicionar frequencia ao aluno
        Frequencia chamada = new Frequencia(disciplina_mat, LocalDate.now(), true, professor1);
        aluno.getFrequencia().add(chamada);

        // Verificar informações do aluno
        System.out.println("Nome do Aluno: " + aluno.getNome());
        System.out.println("Curso do Aluno: " + aluno.getCurso().getNome());
        System.out.println("Disciplinas Matriculas:");
        for (Fase Fases : aluno.getCurso().getFases()) {
            System.out.println("Fase " + Fases.getNumero() + ":");
            for (Disciplina disciplina : aluno.getCurso().getFases().get(Fases.getNumero() - 1).getDisciplinas()) {
                System.out.println("- " + disciplina.getNome());
            }
        }
        System.out.println("========================================");

    }
}

class Aluno {
    private String nome;
    private Curso curso;
    private List<Frequencia> frequencia;

    public Aluno(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public List<Frequencia> getFrequencia() {
        return frequencia;
    }

}

class Frequencia {
    private Disciplina disciplina;
    private LocalDate data;
    private Boolean isPresente;
    private Professor professor;

    public Frequencia(Disciplina disciplina, LocalDate data, Boolean isPresente, Professor professor) {
        this.disciplina = disciplina;
        this.data = data;
        this.isPresente = isPresente;
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public LocalDate getData() {
        return data;
    }

    public Boolean getisPresente() {
        return isPresente;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setisPresente(Boolean isPresente) {
        this.isPresente = isPresente;
    }

    public void setProfesso(Professor professor) {
        this.professor = professor;
    }
}

class Curso {
    private String nome;
    private List<Fase> fases;

    public Curso(String nome) {
        this.nome = nome;
        this.fases = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Fase> getFases() {
        return fases;
    }

    public void adicionarFase(Fase fase) {
        fases.add(fase);
    }
}

class Fase {
    private int numero;
    private List<Disciplina> disciplinas;

    public Fase(int numero) {
        this.numero = numero;
        this.disciplinas = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
}

class Disciplina {
    private String nome;
    private List<Professor> professores;
    private Boolean isOfertado;

    public Disciplina(String nome, Boolean isOfertado) {
        this.nome = nome;
        this.professores = new ArrayList<>();
        this.isOfertado = isOfertado;
    }

    public String getNome() {
        return nome;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }
}

class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

package Atividades.atividade01;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Criar alguns professores
        Professor professor1 = new Professor("Professor A");
        Professor professor2 = new Professor("Professor B");
        Professor professor3 = new Professor("Professor C");

        // Criar algumas disciplinas
        Disciplina disciplina1 = new Disciplina("Matemática");
        disciplina1.adicionarProfessor(professor1);
        Disciplina disciplina2 = new Disciplina("História");
        disciplina2.adicionarProfessor(professor2);
        Disciplina disciplina3 = new Disciplina("Programação");
        disciplina3.adicionarProfessor(professor3);

        // Criar algumas fases
        Fase fase1 = new Fase(1);
        fase1.adicionarDisciplina(disciplina1);
        Fase fase2 = new Fase(2);
        fase2.adicionarDisciplina(disciplina2);
        Fase fase3 = new Fase(3);
        fase3.adicionarDisciplina(disciplina3);

        // Criar um curso
        Curso curso = new Curso("Ciências da Computação");
        curso.adicionarFase(fase1);
        curso.adicionarFase(fase2);
        curso.adicionarFase(fase3);

        // Criar um aluno e associá-lo ao curso
        Aluno aluno = new Aluno("João", curso);

        // Verificar informações do aluno
        System.out.println("Nome do Aluno: " + aluno.getNome());
        System.out.println("Curso do Aluno: " + aluno.getCurso().getNome());
        System.out.println("Disciplinas da Fase 1:");
        for (Disciplina disciplina : aluno.getCurso().getFases().get(0).getDisciplinas()) {
            System.out.println("- " + disciplina.getNome());
        }
    }
}

class Aluno {
    private String nome;
    private Curso curso;

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

    public Disciplina(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
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

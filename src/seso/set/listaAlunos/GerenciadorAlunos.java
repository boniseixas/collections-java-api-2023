package seso.set.listaAlunos;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Desafio proposto por Cami
2. Lista de Alunos
Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de alunos.
Cada aluno terá atributos como nome, matrícula e nota. Implementaremos os seguintes métodos:

adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno ao conjunto.
removerAluno(long matricula): Remove um aluno ao conjunto a partir da matricula, se estiver presente.
exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente de nota.
exibirAlunos(): Exibe todos os alunos do conjunto.
 */

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public Set<Aluno> getAlunoSet() {
        return alunoSet;
    }

    public void adicionarAluno(String nome, Long matricula, double nota) {
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        Aluno removendoAluno = null;
        if(!alunoSet.isEmpty()) {
            for(Aluno a : alunoSet) {
                if(a.getMatricula() == matricula) {
                  removendoAluno = a;
                  break;
                }
            }
            alunoSet.remove(removendoAluno);
        } else {
            throw new RuntimeException("Aluno não está matriculado!!");
        }

        if(removendoAluno == null) {
            System.out.println("Aluno não está matriculado!!");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunos = new TreeSet<>(alunoSet);
        if(!alunoSet.isEmpty()) {
            System.out.println(alunos);
        } else {
            System.out.println("Não há alunos matriculados");
        }
    }

    public void exibirAlunosPorNota () {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if(!alunoSet.isEmpty()) {
            alunosPorNota.addAll(alunoSet);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("Não há alunos matriculados");
        }
    }
}

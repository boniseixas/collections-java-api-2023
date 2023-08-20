package seso.set.listaAlunos;

public class TeataGerenciadorAlunos {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Cami", 123456l, 6d);
        gerenciadorAlunos.adicionarAluno("Cavalcante", 456789l, 8d);
        gerenciadorAlunos.adicionarAluno("Maria Flor", 987654l, 3d);
        gerenciadorAlunos.adicionarAluno("Flor Maria", 123456789l, 9d);

        System.out.println(gerenciadorAlunos.getAlunoSet());

        gerenciadorAlunos.removerAluno(000l);
        gerenciadorAlunos.removerAluno(123456l);
        System.out.println(gerenciadorAlunos.getAlunoSet());

        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();

    }
}

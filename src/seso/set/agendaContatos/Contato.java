package seso.set.agendaContatos;


import java.util.Objects;

/*
Exercício resolvido por Cami
Pesquisa em Conjunto
1. Agenda de Contatos
Crie uma classe chamada "AgendaContatos" que possui um conjunto de objetos do tipo "Contato" como atributo.
Cada contato possui atributos como nome e número de telefone. Implemente os seguintes métodos:

adicionarContato(String nome, int numero): Adicione um contato à agenda.
exibirContatos(): Exibe todos os contatos da agenda.
pesquisarPorNome(String nome): Pesquisa contatos pelo nome e retorna um conjunto com os contatos encontrados.
atualizarNumeroContato(String nome, int novoNumero): Atualize o número de telefone de um contato específico.
 */
public class Contato {
    //atributo
    private String nome;
    private int numeroTelefone;

    public Contato(String nome, int numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return getNumeroTelefone() == contato.getNumeroTelefone() && Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNumeroTelefone());
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numeroTelefone=" + numeroTelefone +
                '}';
    }
}

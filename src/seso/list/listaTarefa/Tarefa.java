package seso.list.listaTarefa;

public class Tarefa {
    //atributo
    private String descricao;

    public  Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

//    @Override
//    public String toString() {
//        return "Tarefa{" +
//                "descricao='" + descricao + '\'' +
//                '}';
//    }

    //metodo toString() apenas com a descrição
    @Override
    public String toString() {
        return descricao;
    }
}

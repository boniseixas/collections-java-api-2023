package list.operacoesBasicas.pesquisaemlist;

public class TestaCatalogoLivro {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro: Programar em Java", "SeSo S", 2020);
        catalogoLivros.adicionarLivro("Livro: Ser Programador", "SeSo SS", 2021);
        catalogoLivros.adicionarLivro("Livro: Crescendo na carreira", "Helena de Troya", 2022);
        catalogoLivros.adicionarLivro("Livro: Ser Programador", "SeSo SS", 2023);
        catalogoLivros.adicionarLivro("Livro: Ter sucesso", "Helena Seso", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("SeSo SS"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro: Ter sucesso"));
    }
}

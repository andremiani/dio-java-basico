package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CatalogoLivros {
    private List<Livro> livroLista;

    public CatalogoLivros() {
        this.livroLista = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroLista.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarLivroPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroLista.isEmpty()) {
            for (Livro l : livroLista) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;

    }

    public List<Livro> pesquisarPorIntervaloDeAno(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroLista.isEmpty()) {
            for (Livro l : livroLista) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        // System.out.println(livrosPorIntervaloAnos);
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroLista.isEmpty()) {
            for (Livro l : livroLista) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        // System.out.println("------Livros Cadastradoa--------");
        // System.out.println(catalogoLivros.livroLista);
        System.out.println("------Pesquisa por Autor--------");
        System.out.println(catalogoLivros.pesquisarLivroPorAutor("Autor 2"));
        System.out.println("------Pesquisa por Ano--------");
        System.out.println(catalogoLivros.pesquisarPorIntervaloDeAno(2020, 2022));
        System.out.println("------Pesquisa por Título--------");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

    }
}

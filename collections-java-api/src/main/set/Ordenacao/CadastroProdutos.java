package main.set.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import main.list.Ordenacao.Pessoa;

/**
 * CadastroProdutos
 */
public class CadastroProdutos {

    private Set<Produto> setProdutos;

    public CadastroProdutos() {
        this.setProdutos = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        setProdutos.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> ordenarPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(setProdutos);
        return produtosPorNome;
    }

    public Set<Produto> ordernarPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(setProdutos);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1L, "Produto 5", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Produto 2", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Produto 4", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Produto 3", 50d, 15);

        // Exibindo todos os produtos no cadastro
        System.out.println(cadastroProdutos.setProdutos);

        // Exibindo produtos ordenados por nome
        System.out.println("------------Ordernar Produtos por Nome------------");
        System.out.println(cadastroProdutos.ordenarPorNome());

        // Exibindo produtos ordenados por preço
        System.out.println("------------Ordernar Produtos por Preço------------");
        System.out.println(cadastroProdutos.ordernarPorPreco());
    }
}
package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaDeItens;

    public CarrinhoDeCompras() {
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        listaDeItens.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if(!listaDeItens.isEmpty()){
            for(Item item : listaDeItens){
                if (item.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(item);
                }
            }
            listaDeItens.removeAll(itensParaRemover);
        }else{
            System.out.println("Lista vazia!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        if (!listaDeItens.isEmpty()){
            for (Item item : listaDeItens) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
        }else{
            System.out.println("Lista vazia!");
        }

        return valorTotal;
    }

    public void exibirItens(){
        if(!listaDeItens.isEmpty()){
            System.out.println(this.listaDeItens);
        }else{
            System.out.println("Lista vazia!");
        }
    }

    @Override
    public String toString() {
      return "CarrinhoDeCompras{" +
          "itens=" + listaDeItens +
          '}';
    }

    public static void main(String[] args) {
    // Criando uma instância do carrinho de compras
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    // Adicionando itens ao carrinho
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
    carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

    // Exibindo os itens no carrinho
    carrinhoDeCompras.exibirItens();

    // Removendo um item do carrinho
    carrinhoDeCompras.removerItem("Lápis");

    // Exibindo os itens atualizados no carrinho
    carrinhoDeCompras.exibirItens();

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
  }
}

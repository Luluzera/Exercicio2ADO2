package cliente;

import composite.Composite;
import composite.Component;
import composite.Leaf;

public class CestaFacade {
    private Composite cesta;

    // Construtor que inicia a cesta
    public CestaFacade(String nomeCesta) {
        cesta = new Composite(nomeCesta);
    }

    // adiciona produto pra cesta
    public void adicionarProduto(double preco, String nome) {
        Component produto = new Leaf(preco, nome);
        cesta.adicionar(produto);
    }

    // adiciona uma caixa de produto na cesta
    public void adicionarCaixa(String nomeCaixa, double[] precos, String[] nomes) {
        Composite caixa = new Composite(nomeCaixa);
        for (int i = 0; i < precos.length; i++) {
            Component produto = new Leaf(precos[i], nomes[i]);
            caixa.adicionar(produto);
        }
        cesta.adicionar(caixa);
    }

    //pega preco
    public double getPrecoTotal() {
        return cesta.getPreco();
    }

    // exibe tudo da cesta
    public void exibirCesta() {
        System.out.println(cesta);
        System.out.println("Total: " + cesta.getPreco());
    }
}

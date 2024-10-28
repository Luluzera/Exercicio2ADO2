package cliente;

public class UsaCesta {
  public static void main(String[] args) {
    // iniciando
    CestaFacade cestaFacade = new CestaFacade("Cesta de cria");

    // chamando o adicionar produto pra incluir na cesta
    cestaFacade.adicionarProduto(12.56, "café");
    cestaFacade.adicionarProduto(10.26, "leite");
    cestaFacade.adicionarProduto(6.12, "pão de queijo");

    //colocando caixa de bombons
    double[] precosBombons = {9.78, 8.23};
    String[] nomesBombons = {"bombom licor", "bombom cereja"};
    cestaFacade.adicionarCaixa("Caixa de bombom", precosBombons, nomesBombons);

    // Exibindo
    cestaFacade.exibirCesta();
  }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author eric
 */
public class InserirProdutos {

    /**
     * cria um variavel array de Produtos que vai ser uma lista de objeto de
     * Produtos Essa variavel é static porque eu vou construir o objeto da
     * classe Produto direto, através do seu construto. Sem a necessidade de
     * criar um objeto para pode para instanci- ar e atribuir seus valores.
     */
    public static Produto[] lista = new Produto[4];

    //variavel que ira percorrer os indices de array lista
    private static int indiceAtual = 0;

    /**
     * metodo para cadastrar os produtos de um produto de uma loja
     *
     * @param recebe um objeto da classe Produto atraves desse metodo vou poder
     * construir um objeto da classe Produto sem a necessidade de criar um
     * objeto de referencia.
     *
     * verifica se a variavel de incremento é do tamanho da lista, quando essa
     * con- dicao vor verdadeira, sera chamado o metodo expadirLista() para
     * aumentar o seu tamanho, para poder expandir o tamanho da lista de objetos
     * e poder con- tinuar cadastrando seus produtos. if (indiceAtual ==
     * lista.length) { lista = expandirLista(); } lista[indiceAtual++] = obj
     *
     * //recebe um objeto de Produto e incrementando toda vez que vor
     * adicionado um objeto na lista de arrays lista[indiceAtual++] = obj;
     */
    public static void cadastraProduto(Produto obj) {
        if (indiceAtual == lista.length) {
            lista = expandirLista();
        }
        lista[indiceAtual++] = obj;
    }

    /**
     * Esse metodo vai ser chamado toda vez que a lista de objeto estiver cheia
     * e lista vai ser expandida acrecentando +5 campos para pode ser prenchido.Isso vai acontecer toda vez que que a lista estiver cheia.
     * @return lista de array expandida
     */
    public static Produto[] expandirLista() {
        Produto[] novaLista = new Produto[indiceAtual + 5];
        for (int i = 0; i < lista.length; i++) {
            novaLista[i] = lista[i];
        }
        return novaLista;
    }

    /**
     * Esse metodo eh para procurar um produto, recebe como parametro um tipo
     * inteiro que será o codigo do produto. E se o codigo do produto existir
     * sera retornado seu codigo, nome e preco esse metodo nao tem tratamento de
     * erro, entao insira um codigo cadastrado, que voce criou.
     */
    public static void pesquisarProduto(int ob) {
        for (int i = 0; i < lista.length; i++) {
            if (ob < 1) {
                System.out.println("codigo invalido!");
                break;
            }
            if (ob > 0 || ob < lista[i].getCodProduto()) {
                if (ob == lista[i].getCodProduto()) {
                    String retorno = String.format("Codigo produto: %d \nNome produto: %s \nPreco produto: %.2f",
                            lista[i].getCodProduto(), lista[i].getNomeProduto(), lista[i].getPreco());
                    System.out.println(retorno);
                    break;
                }
            } else {
                System.out.println("codigo invalido!.");
            }
        }
    }

    /**
     * esse metodo imprimir todos produtos que ja foram cadastrado, ele é static
     * nao precisa de uma referencia de objeto para ser usado.
     * InserirProdutos.exibir(); para usar.
     */
    public static void exibir() {
        for (Produto novaLista : lista) {
            System.out.println(novaLista);
        }
    }

}

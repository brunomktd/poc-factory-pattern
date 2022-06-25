package br.com.factory;

public abstract class CartaoAbstract implements CartaoCredito{
    private String nome;
    private String numero;
    private String cvv;
    private String validade;

//    public CartaoAbstract(String nome, String numero, String cvv, String validade) {
//        this.nome = nome;
//        this.numero = numero;
//        this.cvv = cvv;
//        this.validade = validade;
//    }


    @Override
    public void createCartao(String nome, String numero, String cvv, String validade) {
        this.nome = nome;
        this.numero = numero;
        this.cvv = cvv;
        this.validade = validade;
    }

    protected String getNome() {
        return nome;
    }
}

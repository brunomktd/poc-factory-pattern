package br.com.factory;

public interface CartaoCredito {

    void createCartao(String nome, String numero, String cvv, String validade);
    String getBandeira();

    String donoCartao();
}

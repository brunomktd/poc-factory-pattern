package br.com.factory;

public class Visa extends CartaoAbstract implements CartaoCredito {

    private Visa(String nome, String numero, String cvv, String validade) {
        this.createCartao(nome, numero, cvv, validade);
    }

    @Override
    public String getBandeira() {
        return "Visa do Brasil";
    }

    @Override
    public String donoCartao() {
        return this.getNome();
    }


}

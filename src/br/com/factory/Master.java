package br.com.factory;

public class Master extends CartaoAbstract implements CartaoCredito{

    private Master(String nome, String numero, String cvv, String validade) {
        this.createCartao(nome, numero, cvv, validade);
    }

    @Override
    public String getBandeira() {
        return "MasterCard do Brasil";
    }

    @Override
    public String donoCartao() {
        return this.getNome();
    }

}

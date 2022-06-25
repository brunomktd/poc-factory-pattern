package br.com.factory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CartaoCredito> list = new ArrayList<>();

        CartaoCredito cartao1 = Cartao.Factory.build("Edjaine", Visa.class);
        CartaoCredito cartao2 = Cartao.Factory.build("Bruno", Master.class);

        list.add(cartao1);
        list.add(cartao2);

        list.forEach(cartao -> System.out.printf("O dono do cartao é: %s e a bandeira é: %s %n", cartao.donoCartao(), cartao.getBandeira()));
    }
}

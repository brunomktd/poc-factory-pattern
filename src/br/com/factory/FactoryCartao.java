package br.com.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

class Cartao {

    public static class Factory {

        private static Random rnd = new Random();

        public static <T> T build(String nome, Class<T> cartaoClass) {
            int partNumCartao = rnd.nextInt(999999);
            String numeroCartao = String.format("545467%s9999", partNumCartao);
            String cvv = Integer.toString(rnd.nextInt(999));
            LocalDateTime dateTime = LocalDateTime.now().plusYears(3);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
            String validade = dateTime.format(formatter);

            try {
                Constructor<T> constructor = cartaoClass.getDeclaredConstructor(String.class, String.class, String.class, String.class);
                constructor.setAccessible(true);
                return constructor.newInstance(nome, numeroCartao, cvv, validade);
            } catch (NoSuchMethodException | InvocationTargetException | InstantiationException |
                     IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

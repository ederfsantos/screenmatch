package desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DesafioPrincipal {
    public static void main(String[] args) {
        int opc;

        Scanner ler = new Scanner(System.in);
        System.out.println("Aplicação de compras");
        System.out.println("Digite o limite do cartão:");
        double limite = ler.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);
        int sair = 1;
        while (sair != 0) {
            ler.nextLine();//limpando o buffer
            System.out.println("Digite a descrição da compra:");
            String descricao = ler.nextLine();
            System.out.println("Digite o valor da compra:");
            double valor = ler.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra Realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar:");
                sair = ler.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }

        }

        System.out.println("*******************************************");
        System.out.println("Compras Realizadas:\n");
        Collections.sort(cartao.getCompras());//ordenando por preço
        cartao.getCompras().forEach(c -> System.out.println(c.getDescricao() + " - " + c.getValor()));
        System.out.println("**********************************************");
        System.out.println("Saldo restante R$ " + String.format("%.2f",cartao.getSaldo()));

    }
}

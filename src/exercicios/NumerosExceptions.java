package exercicios;

import java.util.Scanner;

public class NumerosExceptions {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = ler.nextInt();

        try{
            int res = n1/n2;
            System.out.println("O Resultado da divisão é : " + res);

        }catch (ArithmeticException e){
            System.out.println("Erro ao tentar dividir os numeros, foi informado o 0 para divisão " +e.getMessage());
        }finally {
            System.out.println("Programa finalizado");
        }
    }
}

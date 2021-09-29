package exercicios;

import java.util.Scanner;

public class Exercicio04 {
/* Sabe-se que 1 quilowatt de energia custa 1/500 avos do salário mínimo. 
    Faça um algoritmo que receba o valor do salário mínimo e a quantidade de 
    quilowatts consumida por uma residência. Calcule e mostre:

a) O valor, em reais, de cada quilowatt;
b) O valor, em reais, a ser pago por essa residência
c) O valor, em reais, a ser pago com desconto de 15%
*/

public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    double salmin, qtdconsu, valorpkw, valortotal, desc;

    System.out.println("Qual é o salário mínimo atual?");
    salmin = entrada.nextDouble();

    System.out.println("Qual consumo de quilowatt da residencia?");
    qtdconsu = entrada.nextDouble();

    valorpkw = salmin/500;
    valortotal = valorpkw*qtdconsu;
    desc = valortotal -(valortotal*15)/100;

    System.out.println("De acordo com seu salário, cada quilowatt consumido sera cobrado: R$ " + valorpkw);
    System.out.println("O valor da sua conta será: R$ " + valortotal + ". Tendo em vista seu consumo de" + qtdconsu);
    System.out.println("Com o desconto de 15%, o valor será de: R$ "+ desc);

    entrada.close();

}    
}

package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double saláriobruto, prestação, limite;
        System.out.println("Digite o seu salário bruto: ");
        saláriobruto = teclado.nextDouble();
        System.out.println("Digite o valor da prestação: ");
        prestação = teclado.nextDouble();
        limite = saláriobruto * 0.3;
        if (prestação <= limite) {
            System.out.println("Pode receber o empréstimo.");
        } else {
            System.out.println("Não pode receber o empréstimo.");
        }
        teclado.close();
    }

}
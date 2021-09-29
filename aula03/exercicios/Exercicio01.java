package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int número;
        System.out.println("Digite o número inteiro.");
        número = teclado.nextInt();
        if (número > 20) {
            System.out.println("A metade é: " + (número / 2));
        }

        teclado.close();
    }
}

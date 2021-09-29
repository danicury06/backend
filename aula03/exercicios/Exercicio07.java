package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salário;
        System.out.println("Digite do salário salário:");
        salário = teclado.nextDouble();
        if (salário <= 600){
            System.out.println("Inseto");
        }else {
            if (salário <= 1200) {
                System.out.println("20%");
            }else {
                if (salário <= 2000){
                    System.out.println("25%");
                }else {
                    System.out.println("30%");
        }
    }
    }
    teclado.close();
}
}


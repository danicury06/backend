package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, novoSalario;

        // Entrada
        System.out.println("Digite o seu salário atual?");
        salario = teclado.nextDouble();

        // processamento
        // novoSalario = salario + salario * 0.25;
        novoSalario = salario * 1.25;

        // saida

        System.out.println("Novo salário = " + novoSalario);


        teclado.close();


    }

}

package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String senha;

        System.out.println("Digite sua senha:");
        senha = teclado.nextLine();

        //equals = exatamente igual (Emerson e emerson são diferentes)
        //equalsIgnoreCase = desconsidera maiscula e minusculas (Emerson e Emerson são iguais)

        if (senha.equals("R10p5")){
            System.out.println(("Acesso permitido."));
        }else {
            System.out.println(("Acesso negado."));
        }
        teclado.close();
        }
     }
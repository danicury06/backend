package exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int número;

        System.out.println("Digite um valor inteiro:");
        número = entrada.nextInt();

        if(número >=0) {
            System.out.println("Número positivo.");
        } else {
            System.out.println("Número negativo.");
        }

        System.out.println("Final do programa.");
        
        entrada.close ();
}
    }

    

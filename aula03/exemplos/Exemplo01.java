package exemplos;

import java.util.Scanner;

public class Exemplo01 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double nota;

System.out.println("Digite a note do aluno:");
nota = teclado.nextDouble();

if (nota >= 6) {
    System.out.println("Aluno aprovado!");
}

System.out.println("FInal do programa.");


    teclado.close();
}
    
}
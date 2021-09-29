package exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
       String nome = "Daniela";

       //if(nome.equals("Daniela")){
        if(nome.equalsIgnoreCase("Daniela")){
        System.out.println("Igual");
       }else {
           System.out.println("Diferente");
       }

    }
}

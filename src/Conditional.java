import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        //variaveis

        boolean incluidoNoPlano = true;

        System.out.println( "Qual seu plano?");

        //Leitura
        Scanner leitura = new Scanner(System.in);
        String tipoPlano = leitura.nextLine();

        //condições



        if ( incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme liberado!");
        }

    }

    }


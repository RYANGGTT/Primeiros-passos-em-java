import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //variaveis
        double mediaAvaliacao = 8.7;

        double avaliacaoUsuario = 0;

        //scan

        Scanner leitura = new Scanner(System.in);

        for ( int i = 1; i<= 3 ; i++){
            System.out.println("Qual sua " + i + " avaliação pro filme?");
            avaliacaoUsuario = leitura.nextInt();
            mediaAvaliacao =+ avaliacaoUsuario ;

        }

        System.out.println( "Media geral :" + mediaAvaliacao/3);
    }
}


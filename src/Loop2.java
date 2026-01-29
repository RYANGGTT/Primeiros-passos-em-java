import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        //variaveis
        double mediaAvaliacao = 0;
        int totalNotas = 0;
        double avaliacaoUsuario = 0;
        boolean aconteceu = true;
        //scan

        Scanner leitura = new Scanner(System.in);
        //loop
        while ( avaliacaoUsuario != -1){
            System.out.println("Qual sua  avaliação pro filme ou -1 pra encerrar");
            avaliacaoUsuario = leitura.nextInt();

            if (avaliacaoUsuario != -1) {
                mediaAvaliacao += avaliacaoUsuario;
                totalNotas++;

            }else if ( totalNotas == 0){
                aconteceu = false ;
                System.out.println("Avaliações encerradas !");
            }

        }
        if (aconteceu == true) {
            System.out.println("Media geral :" + mediaAvaliacao / totalNotas);
        }
    }
}

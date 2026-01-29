import java.util.Random;
import java.util.Scanner;

public class Jogoadivinha {

    public static void main(String[] args) {
        //scan

        Scanner leitura = new Scanner(System.in); // ativa o scan do terminal

        //variaveis

        int tentativasUsuario = 0; // quantidade de tentativas do usuario
        int mumeroGerado = new Random().nextInt(10); // gera numero aleatorio de 1 a 10
        int numeroTentativa = 0 ; // numero tentativa do usuario
        boolean vitoria = false;
        //execução instrução unica

        System.out.println("Jogo do numero secret0 !");
        System.out.println("Digite um numero de 1 a 10 em no maximo 5 tentativas!");

        //loop
        for (int i = 0 ; i < 5 ; i++){

            tentativasUsuario++;
            numeroTentativa = leitura.nextInt();




            if (numeroTentativa == mumeroGerado ){
                vitoria = true;
                System.out.println("Parabéns voce ganhou com " + tentativasUsuario +  " tentativas !!");
                break;
            } else if ( tentativasUsuario >= 5 ) {
                System.out.println("Você perdeu!!");
                break;
            }else if ( numeroTentativa < mumeroGerado    ){
                System.out.println("seu numero é menor que o gerado!!");

            }else  {
                System.out.println("seu numero é maior que o gerado!!");
            }

            if ( tentativasUsuario == 4 ){
                System.out.println("Ultima chance!!");
            }



        }

    }
}

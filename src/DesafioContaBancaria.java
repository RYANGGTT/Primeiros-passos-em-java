import java.util.Scanner;

public class DesafioContaBancaria {

    //====================Funções=======================
    static void mostrarMenu() {
        System.out.println("""
                Operações
                
                1- Consultar saldos
                2- Depositar valor
                3- transferir valor
                4- sair
                
                Digite a opção desejada :
                    """);
    }

    public static void main(String[] args) {
       //========================variaveis========================
        String usuarioConta = "Fabricio Ryan Machado ALlves";
        String tipoConta ="corrente";
        double saldo = 400;
        double valor = 0;
        Scanner leitura = new Scanner(System.in); // ativa o scan do terminal
        int numeroDigitado = 0;


 //=========================MenuInicial========================
        System.out.println("""
            ======================================
                Dador iniciais do cliente :
          
                Nome: %s
                Tipo conta: %s
                Saldo inicial: %.2f
                
            ======================================
                Operações
                
                1- Consultar saldos
                2- Depositar valor
                3- transferir valor
                4- sair
                
                """.formatted(usuarioConta, tipoConta, saldo));



        //====================Loop=======================
        while (numeroDigitado != 4){
            numeroDigitado = leitura.nextInt();
            if (numeroDigitado == 1){
                System.out.println("Seu saldo é :" + saldo);
                System.out.println("Pressione enter para continuar!");

                leitura.nextLine();
                leitura.nextLine();
                mostrarMenu();
            }

            else if (numeroDigitado == 2){

                System.out.println("Qual valor voce quer depositar?");
                valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atual atualizado :" + saldo);
                mostrarMenu();
            }else if (numeroDigitado == 3){
                System.out.println("Qual valor voce quer transferir?");
                valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Saldo atual insuficiente para transferencia!");
                    System.out.println("Pressione enter para continuar!");
                    leitura.nextLine();
                    leitura.nextLine();
                }else {
                    saldo -= valor;
                    System.out.println("Saldo atual atualizado :" + saldo);

                }
                mostrarMenu();
            }
        }

    }



}





















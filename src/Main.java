//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //variaveis
        String nomeFilme = "Génio Indomável";
        int ano = 1997;
        int quantidadeDeNotas = 4 ;
        double notaImdb = 8.3 ;
        double notaPrime = 8.3;
        double notaAdoroCinema = 9;
        double notaAmazon = 9.2;
        double mediaNotaGeral= (notaImdb + notaAmazon + notaAdoroCinema + notaPrime) / quantidadeDeNotas;

        //Impressoes
        System.out.println("Esse é o screen match");
        System.out.println("Filme:" + nomeFilme);
        System.out.println("Ano :" + ano );
        System.out.println("Nota IMDB:" + notaImdb);
        System.out.println("Nota Prime video:" + notaPrime);
        System.out.println("Nota AdoroCinema:" + notaAdoroCinema);
        System.out.println("Nota Amazon:" + notaAmazon);
        System.out.println("Nota Geral:" + mediaNotaGeral);


    }
}
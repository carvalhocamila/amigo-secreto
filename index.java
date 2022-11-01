
//pegar o codigo ineiro no saf pq ta incompleto e fzr os dois exercicios ate sexta pra ganhar um ponto na n2
import java.util.Scanner; //importar o scanner pq sabe que vai usar para captar os dados

public class AulaDia31{
    public static void main (String[] args){
        System.out.println("Digite o seu nome");

        boolean cadastro = true;
        Scanner scan = new Scanner(System.in);
        String[] nomes = new String [4];
        int i = 0

        while (true) {
            //cadastra as pessoas
            if (cadastro == true){
                System.out.println("Digite seu nome");
                String nome = scan.nextLine();
                nomes[i] = nome;
                i++;

                if (i > 3){
                    cadastro = false;
                }
            } else {
                Random
                System.out.println(nomes[0]);
                System.out.println(nomes[1]);
                System.out.println(nomes[2]);
                System.out.println(nomes[3]);
            }
        }

    }
}
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        
        try{ // tentar
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scan.nextLine();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scan.nextLine();

        System.out.println("Digite sua idade");
        int idade = scan.nextInt();

        System.out.println("Digite sua altura");
        Double altura = scan.nextDouble();

        System.out.println("Olá me chamo "+nome.toUpperCase()+ " " +sobrenome);
        System.out.println("Tenho "+idade+ " anos");
        System.out.println("minha altura é "+ altura + "cm ");
       
        scan.close();
        }
        catch(InputMismatchException e){ //(Exceção de incompatibilidade de entrada)
            System.out.println("Os campos idade e altura precisam ser numericos");
        }
    }
}

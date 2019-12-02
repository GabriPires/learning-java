import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "";

        System.out.print("Escreva uma frase: ");
        frase = sc.nextLine();

        System.out.println("Tem "+frase.split(" ").length+" palavras.");
    }
}

//Gabriel Antonio Santos Pires
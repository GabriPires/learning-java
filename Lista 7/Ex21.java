import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        String frase = "";

        System.out.print("Escreva uma frase: ");
        frase = sc.nextLine();

        for (i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == (char) 32) {
                System.out.println("");
            } else {
                System.out.print(frase.charAt(i));
            }
        }
    }
}

//Gabriel Antonio Santos Pires
import java.util.Scanner;

class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "", palavra = "";
        int i, c = 0;

        System.out.print("Digite uma frase: ");
        frase = sc.nextLine();
        System.out.print("Digite uma palavra: ");
        palavra = sc.nextLine();

        for (i = 0; i <= (frase.length()) - (palavra.length()); i++) {
            if ((frase.substring(i, i + palavra.length()).equalsIgnoreCase("ana"))) {
                c++;
            }
        }

        System.out.println("Tem " + c + " palavras " + palavra + " na frase");
    }
}

//Gabriel Antonio Santos Pires
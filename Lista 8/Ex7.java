import java.util.Random;
import java.util.Scanner;

class Ex7 {
    public static void main(String[] args) {
        int n = 0, maior=0, menor=0;
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Insira o tamanho do vetor: ");
            n = sc.nextInt();
        } while (n > 20 || n <= 0);

        int e[] = new int[n];

        for (int i = 0; i < n; i++) {
            e[i] = rd.nextInt(100) + 1;
            System.out.println(i + 1 + "-" + e[i]);
            if (i == 0) {
                maior = e[i];
                menor = e[i];
            }
            if (e[i] > maior) {
                maior = e[i];
            }
            if (e[i] < menor) {
                menor = e[i];
            }
        }

        System.out.println("Maior: "+maior+"\nMenor: "+menor);
    }
}

//Gabriel Antonio Santos Pires
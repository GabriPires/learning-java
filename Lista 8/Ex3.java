import java.util.Random;
import java.util.Scanner;

class Ex3 {
    public static void main(String[] args) {
        int n=0;
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Insira o tamanho do vetor: ");
            n = sc.nextInt();
        } while (n > 20);

        int c[] = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = rd.nextInt(100) + 1;
            System.out.println(i+1+"-"+c[i]);
        }
    }
}

//Gabriel Antonio Santos Pires
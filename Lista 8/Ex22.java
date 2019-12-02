import java.util.Scanner;
import java.util.Random;

class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int num = 0, tam = 0;
        do {
            System.out.print("Insira o tamanho do vetor: ");
            num = sc.nextInt();
        } while (num <= 0 || num > 20);
        int[] ac = new int[num];

        System.out.print("Insira o maximo para o tamanho dos elementos: ");
        tam = sc.nextInt();

        for (int i = 0; i < ac.length; i++) {
            ac[i] = rd.nextInt(tam) + 1;
            System.out.print(ac[i] + ", ");
        }
    }
}

//Gabriel Antonio Santos Pires
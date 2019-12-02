import java.util.Scanner;
import java.util.Random;

class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int n = 0, m = 0, valor = 0, cont = 0;

        do {
            System.out.print("Insira o numero de linhas: ");
            n = sc.nextInt();
            System.out.print("Insira o numero de colunas: ");
            m = sc.nextInt();
        } while (n < 1 || m < 1);

        do {
            System.out.print("Insira um valor: ");
            valor = sc.nextInt();
        } while (valor < 1 || valor > 25);

        int[][] matriz = new int[n][m];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(25) + 1;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == valor) {
                    System.out.println("Valor encontrado na linha " + i + 1 + " coluna " + j + 1);
                    cont++;
                }
            }
        }
        System.out.println("Valor encontrado " + cont + " vezes.");
    }
}

//Gabriel Antonio Santos Pires
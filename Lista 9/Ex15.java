import java.util.Scanner;
import java.util.Random;

class Ex15 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int n = 0;

        do {
            System.out.print("Insira a dimensao da matriz quadrada: ");
            n = sc.nextInt();
        } while (n < 1);
        int[][] o = new int[n][n];

        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < o.length; j++) {
                o[i][j] = rd.nextInt(9) + 1;
                System.out.print(o[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Diagonal acima e abaixo da  principal");
        System.out.print("  ");
        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < o.length; j++) {
                if (i == j) {
                    if ((i != 0 && j != 0)) {
                        System.out.print(o[i][j - 1] + " ");
                    }
                    else{
                        //System.out.print("  "+o[i][j] + " ");
                    }
                    System.out.print(o[i][j] + " ");
                    if (i != o.length-1 && j != o.length-1) {
                        System.out.print(o[i][j + 1] + " ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

//Gabriel Antonio Santos Pires
import java.util.Scanner;
import java.util.Random;

class Ex10 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int n = 0;

        do {
            System.out.print("Insira a dimensao da matriz quadrada: ");
            n = sc.nextInt();
        } while (n < 1);
        int[][] h = new int[n][n];

        for (int i = 0; i < h.length; i++) {
            for (int j = 0; j < h.length; j++) {
                h[i][j] = rd.nextInt(9) + 1;
                System.out.print(h[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Diagonal secundaria:");
        for (int i = 0; i < h.length; i++) {
            for (int j = 0; j < h.length; j++) {
                if(i+j==h.length-1){
                    System.out.print(h[i][j] + " ");
                }
                else{
                    System.out.print("  ");
                }   
            }
            System.out.println();
        }
    }
}

//Gabriel Antonio Santos Pires
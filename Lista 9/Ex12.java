import java.util.Scanner;
import java.util.Random;

class Ex12 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int n = 0;

        do {
            System.out.print("Insira a dimensao da matriz quadrada: ");
            n = sc.nextInt();
        } while (n < 1);
        int[][] l = new int[n][n];

        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l.length; j++) {
                l[i][j] = rd.nextInt(9) + 1;
                System.out.print(l[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Diagonal acima principal");
        for (int i = 0; i < l.length-1; i++) {
            for (int j = 0; j < l.length-1; j++) {
                if(i==j){
                    System.out.print(l[i][j+1] + " ");
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
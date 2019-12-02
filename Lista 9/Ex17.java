import java.util.Random;
import java.util.Scanner;

class Ex17 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a dimensao da matriz");
        int n = scanner.nextInt();

        int a[][] = new int[n][n];



        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[i].length; k++) {
                a[i][k] = random.nextInt(100);
                System.out.print(a[i][k] + " ");
            }
            System.out.print("\n");
        }
        System.out.println(" ---------------------- ");
        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[i].length; k++) {
                if (i + k >= a.length-1  || i <= k) {
                    System.out.print(a[i][k] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }

        scanner.close();
    }
}

//Gabriel Antonio Santos Pires
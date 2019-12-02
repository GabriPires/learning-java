import java.util.Random;

class Ex1 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[][] a = new int[4][5];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = rd.nextInt(9)+1;
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}

//Gabriel Antonio Santos Pires
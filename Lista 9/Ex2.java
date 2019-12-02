import java.util.Random;

class Ex2 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[][] b = new int[6][3];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = rd.nextInt(9)+1;
                System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = b.length-1; i >= 0; i--) {
            for (int j = b[0].length-1; j >= 0; j--) {
                System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}

//Gabriel Antonio Santos Pires
import java.util.Random;

class Ex21 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] ab = new int[10];

        for (int i = 0; i < ab.length; i++) {
            ab[i] = rd.nextInt(10) + 1;
            System.out.print(ab[i] + ", ");

            if (ab[i] % 2 != 0) {
                ab[i] = ab[i] * 2;
            }
        }

        System.out.print("\n");
        for (int i = 0; i < ab.length; i++) {
            System.out.print(ab[i] + ", ");
        }
    }
}

//Gabriel Antonio Santos Pires
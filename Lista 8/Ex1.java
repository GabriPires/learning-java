import java.util.Random;

class Ex1 {
    public static void main(String[] args) {
        int a[] = new int[15];
        Random rd = new Random();

        for (int i = 0; i < 15; i++) {
            a[i] = rd.nextInt(100)+1;
            System.out.print(a[i]+" ");
        }
    }
}

//Gabriel Antonio Santos Pires
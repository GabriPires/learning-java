import java.util.Random;

class Ex2 {
    public static void main(String[] args) {
        int b[] = new int[15];
        String result="";
        Random rd = new Random();

        for (int i = 0; i < 15; i++) {
            b[i] = rd.nextInt(100)+1;
            result = b[i] +" "+ result;
            //System.out.print(b[i]+" ");
        }

        System.out.print(result);
    }
}

//Gabriel Antonio Santos Pires
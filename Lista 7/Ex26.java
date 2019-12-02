import java.util.Random;

class Ex26 {
    public static void main(String[] args) {
        String str = "";
        Random ran = new Random();
        int nTem = 0;

        for (int i = 0; i < 10; i++) {
            str = str + (char)(ran.nextInt(26) + 97);
        }

        for (int i = 97; i <= 122; i++) {
            nTem = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != (char) i) {
                    nTem++;
                }
            }
            if (nTem == 100) {
                System.out.print((char) i + " ");
            }
        }

        System.out.println(str);
    }
}

//Gabriel Antonio Santos Pires
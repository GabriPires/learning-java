import java.util.Scanner;

class Ex24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase="";
        int cont=0, maiorS=0;

        System.out.print("Insira a cadeia de caracteres: ");
        frase = sc.nextLine();

        for(int i=0;i<frase.length();i++){
           if(frase.charAt(i)=='1'){
               cont++;
           }
           else{
               cont = 0;
           }
           if(maiorS == 0){
               maiorS = cont;
           }
           else{
               if(cont > maiorS){
                   maiorS = cont;
               }
           }
        }

        System.out.print("Maior sequencia: "+maiorS);
    }
}

//Gabriel Antonio Santos Pires
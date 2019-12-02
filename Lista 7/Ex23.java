import java.util.Scanner;

class Ex23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome="", sobrenome="";
        int i=0;
        
        System.out.print("Escreva um nome: ");
        nome = sc.nextLine();

        i = nome.length()-1;
        do{
            sobrenome = nome.charAt(i) + sobrenome;
            i--;
        }while(nome.charAt(i)!=(char)32);

        System.out.println(sobrenome);
    }
}

//Gabriel Antonio Santos Pires
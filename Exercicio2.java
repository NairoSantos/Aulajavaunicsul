import java.util.Scanner;



public class Exercicio2 {
    public static void main(String[] args) {
        String frase;
        int i;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        frase = sc.nextLine();
        sc.close();

        for(i = frase.length() - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
    }
}

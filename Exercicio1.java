import java.util.Scanner;

/* 
Faça um programa em Java que receba uma frase e uma palavra. Caso a frase
contenha a palavra ESCOLA, substitua-a pela palavra digitada. Exemplo:
▪ Frase: Eu moro perto de uma escola, mas essa escola não é a melhor.
▪ Palavra: padaria
▪ Saída: Eu moro perto de uma padaria, mas essa padaria não é a melhor.
*/

public class Exercicio1 {
    public static void main(String[] args) {
        String frase, palavra;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        frase = sc.nextLine();
        System.out.print("Digite uma palavra: ");
        palavra = sc.nextLine();
        sc.close();

        if(frase.indexOf("escola") >= 0) {
            frase = frase.replace("escola", palavra);
            System.out.print(frase);
        } else {
            System.out.println("A palavra escola não foi encontrada");
        }
    }
}
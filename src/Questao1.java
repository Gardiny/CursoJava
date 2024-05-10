import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Escolha um dos sabores de sorvete:");
        System.out.println("=================================");
        System.out.println("1. Morango");
        System.out.println("2. Chocolate");
        System.out.println("3. Melancia");
        Scanner entradadedados = new Scanner(System.in);
        System.out.print("Digite qual sabor desejado:");
        int escolha = entradadedados.nextInt();
        if(escolha == 1) {
            System.out.println("Voce escolheu "+ escolha + " morango");
        }else if(escolha == 2) {
            System.out.println("Voce escolheu "+ escolha + " chocolate");
        }else if(escolha == 3) {
            System.out.println("Voce escolheu "+ escolha + " melancia");
        }else{
            System.out.println("Sabor invalido!!");
        }
        System.out.println(escolha);

        entradadedados.close();

    }
}

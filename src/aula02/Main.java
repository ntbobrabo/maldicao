package aula02;

import java.util.Scanner;
public class Main

{
    public static void main(String[] args) {
        String nomecompleto;
        int idade;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nome: ");
        nomecompleto = scanner.nextLine();
        System.out.printf("Idade: ");
        idade = scanner.nextInt();
        System.out.printf("O %s tem %d anos de idade\n",
                nomecompleto, idade);
    }


}
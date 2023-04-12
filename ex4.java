package aula13;

import java.util.Scanner;

public class ex4 {

    //Programa que peça as 4 notas bimestrais e mostre a média final
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a Nota 1: ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a Nota 2: ");
        double nota2 = scan.nextDouble();

        System.out.println("Digite a Nota 3: ");
        double nota3 = scan.nextDouble();

        System.out.println("Digite a Nota 4: ");
        double nota4 = scan.nextDouble();
        double totalnotas = nota1 + nota2 + nota3 + nota4;
        double notafinal = totalnotas / 4;

        System.out.println("Sua nota final é: " + notafinal);

    }

}

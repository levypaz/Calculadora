package aula13;

import java.util.Scanner;

public class ex3Calculadora {

    //Programa que peça 2 numeros e imprimir a soma
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 1 número: ");
        int numero1 = scan.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = scan.nextInt();
        int resultado = numero1 + numero2;

        System.out.println("A soma dos 2 números é " + resultado);
    }

}

package BackEnd;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira parte: ");
        double primeiraParte = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        String operador = scanner.next();

        System.out.print("Digite a segunda parte: ");
        double segundaParte = scanner.nextDouble();

        Calculadora calculadora = new Calculadora(primeiraParte, operador, segundaParte);
        calculadora.calcular();

        System.out.println(calculadora);
    }
}

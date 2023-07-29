package aula;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		Scanner valor = new Scanner (System.in);
			System.out.println("Insira o valor a ser testado: ");
			double v1 = valor.nextDouble();
			
			
			if (v1>=0) {
				System.out.println("O valor "+ v1 + " eh positivo!");
			} else {
				System.out.println(" O valor" + v1 + " eh negativo !");

			}
			
	}

}

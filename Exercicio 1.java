package aula;

import java.util.Scanner;

public class A01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Numero 1: ");
		int numUm = entrada.nextInt();
		System.out.println("Numero 2: ");
		int numDois = entrada.nextInt();
		
		int resultadoSoma = numUm + numDois;
		int resultadoSubtracao = numUm - numDois;
		int resultadoMultiplicacao = numUm * numDois;
		int resultadoDivisao = numUm / numDois;
		
		System.out.println("A soma eh: "+ resultadoSoma);
		System.out.println("A subtracao eh :"+ resultadoSubtracao);
		System.out.println("A multiplicacao eh: "+resultadoMultiplicacao);
		System.out.println("A divisao eh: "+ resultadoDivisao);
		
	}

}

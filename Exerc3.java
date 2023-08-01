package atividades;

import java.util.Scanner;

public class Aula3Exercicio3 {

	public static void main(String[] args) {
		
		Scanner letra = new Scanner (System.in);
		System.out.println("Insira a letra F (Feminino) ou M (Masculino) ");
				String sexo = letra.nextLine();
				
				if (sexo.equals("F")) {
					System.out.println("Feminino");
				}else if (sexo.equals("M")){
					System.out.println("Masculino");
						
					} else {
						System.out.println("Sexo Invalido");
					}
				}
	}


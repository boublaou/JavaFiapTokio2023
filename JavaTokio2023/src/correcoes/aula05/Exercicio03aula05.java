package correcoes.aula05;

import java.util.Scanner;

public class Exercicio03aula05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		//tem que continuar 
		System.out.println("Selecione seu genero da seguinte forma: ");
		System.out.println("[M] - Masculino");
		System.out.println("[F] - Femenino");
		System.out.println("[] - ");
		System.out.println("[] - ");
		
		char genero = sc.nextLine().charAt(0);
		System.out.println("lá, %s! Voce escolheu a seguinte opcao de genero: %s");
		
		
	}

}

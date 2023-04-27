package correcoes.aula05;

import java.util.Scanner;

public class Exercicio06aula05 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		//Peca 1
		
		System.out.println("Digite o nome da peca 1: ");
		String nomePeca1 = entrada.nextLine();
		
		System.out.println("Escolha a qtd de pecas 1: ");
		int qtdPecas1 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Valor unitario de cada peca 1: ");
		double valorPeca1 = Double.parseDouble(entrada.nextLine());
		
		System.out.println(" ");
		
		//Peca 2
		
		System.out.println("Digite o nome da peca 2: ");
		String nomePeca2 = entrada.nextLine();
		
		System.out.println("Escolha a qtd de pecas 2: ");
		int qtdPecas2 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Valor unitario de cada peca 2: ");
		double valorPeca2 = Double.parseDouble(entrada.nextLine());
		
		System.out.println(" ");
		
		double valorPago1 = qtdPecas1 * valorPeca1;
		double valorPago2 = qtdPecas2 * valorPeca2;
		
		double valorTotal = valorPago1 + valorPago2;
		
		System.out.printf("Valor a ser pago pela %s: %.2f \n",nomePeca1, valorPago1);
		System.out.printf("Valor a ser pago pela peca 1: %.2f \n",nomePeca2,  valorPago2);
		System.out.printf("Valor a ser pago pela peca 1: %.2f", valorTotal);
		
		
		
		
		
	}

}

package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite a qtd de cambalhotas: ");
		
		int qtdRep = tec.nextInt();
		
		for (int num = 1; num <= qtdRep; num++) {
		System.out.println("Cambalhota " + num);
		}

	}

}

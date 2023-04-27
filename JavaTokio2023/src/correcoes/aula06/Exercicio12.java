package correcoes.aula06;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int ladoA = entrada.nextInt();
		int ladoB = entrada.nextInt();
		int ladoC = entrada.nextInt();
		
		System.out.printf("%d %d %d", ladoA, ladoB, ladoC);
		
		int x = 0;
		
		if (ladoA < ladoB){
			x = ladoA;
			ladoA = ladoB;
			ladoB = x;
			}
			System.out.printf("Lado A: %d \nLadoB:  %d \nLadoC: %d \n\n", ladoA, ladoB, ladoC);
		
		
		if(ladoB < ladoC) {
			x = ladoB;
			ladoB = ladoC;
			ladoC = x;
			}
			System.out.printf("Lado A: %d \nLadoB:  %d \nLadoC: %d \n\n", ladoA, ladoB, ladoC);
		
		if(ladoA < ladoB) {
			x = ladoA;
			ladoA = ladoB;
			ladoB = x;
			}
			System.out.printf("Lado A: %d \nLadoB:  %d \nLadoC: %d \n\n", ladoA, ladoB, ladoC);
			
		if (ladoA >= (ladoB + ladoC)) {
			System.out.println("Nao forma trinagulo");
		} else {
			if((ladoA * ladoA) == (ladoB * ladoB) + (ladoC * ladoC)) {
				System.out.println("TRRIANGULO RETANGULO");
			} else if ((ladoA * ladoA) > (ladoB * ladoB) + (ladoC * ladoC)) {
				System.out.println("TRIANGULO OBSTUSANGULO");
			} else {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			
			if (ladoA == ladoB && ladoB == ladoC) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			
			if ((ladoA == ladoB && ladoC != ladoA || ladoB == ladoC && ladoA != ladoB)) {
				System.out.println("TRIANGULO ISOSCELLES");
			}
		}
		
	
		
		
	}

}

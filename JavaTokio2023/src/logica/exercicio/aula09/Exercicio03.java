package logica.exercicio.aula09;

import java.util.Random;

public class Exercicio03 {

	public static void main(String[] args) {
		
		//instância um objeto da classe Random usando o construtor padrão
        Random gerador = new Random();
        
        //imprime sequência de 5 números inteiros aleatórios
        for (int i = 0; i < 5; i++) {
            System.out.println(gerador.nextInt(10));

		
        }
	}
	
	

}

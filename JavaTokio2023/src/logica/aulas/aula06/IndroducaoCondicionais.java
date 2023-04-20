package logica.aulas.aula06;

public class IndroducaoCondicionais {

	public static void main(String[] args) {
		// ESTRUTURA CONDIOCIONAL SIMPLES
		
		/*
		float nota = 5;
		if (nota < 4) {
			System.out.println("Sua nota e: " + nota);
		}
		
		System.out.println("FIM");
		*/
		
		//..............................
		//ESTRUTURA CONDICIONAL COMPOSTA
		//..............................
		
		/*
		float notaFinal = 4;
		
		if (notaFinal < 6) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado");
		}
		*/
		//..............................
		//ESTRUTURA CONDICIONAL ENCADEADA
		//..............................
				
		
		/*
		float notaFinal = 10;
		if (notaFinal < 4) {
			System.out.println("Reprovado");
		} else {
			if (notaFinal < 6) {
				System.out.println("Recuperaçao");
			} else {
				System.out.println("Aprovado");
			}
		}
		*/
		
		//..............................
		//ESTRUTURA CONDICIONAL COMPOSTA
		//..............................
		
		float notaFinal = 10;
		if (notaFinal < 4) {
			System.out.println("Reprovado");
		} else if (notaFinal < 6) {
			System.out.println("Recuperaçao");
		} else {
			System.out.println("Aprovado");
		}
		
		
		
		
		
		
		
	}

}

package atividade1108;

	import java.util.Scanner;
	public class idade {
		public static void main (String args []) {
		
			Scanner in = new Scanner(System.in);
			int idade;
			
			System.out.println("Qual a sua IDADE?");
			idade = in.nextInt();
			
			switch (idade) {
			
			case 6:
				System.out.println("Sua Categoria � �Dente de Leite�. ");
				break;
			case 7:
				System.out.println("Sua Categoria � �J�nior�.");
				break;
			case 8:
				System.out.println("Sua Categoria � �J�nior max�.");
				break;
			case 9:
				System.out.println("Sua Categoria � �J�nior master�.");
				break;
			case 10:
				System.out.println("Sua Categoria � �Master�.");
				break;
			
				default: 
					System.out.println("A escola n�o aceita alunos dessa idade.");
			
			}
			
		}
	}



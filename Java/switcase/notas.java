package atividade1108;
	import java.util.Scanner;
		public class notas {
			public static void main (String args []) {
				
				Scanner in = new Scanner(System.in);
				int mb, b, r, i, alunos;
				double percMb, percB, percR, percI;
				
				System.out.println("Infrome a quantidade de total de alunos");
				alunos = in.nextInt();
				
				System.out.println("Infrome a quantidade de alunos com MB");
				mb = in.nextInt();
				
				System.out.println("Infrome a quantidade de alunos com B");
				b = in.nextInt();
				
				System.out.println("Infrome a quantidade de alunos com R");
				r = in.nextInt();
				
				System.out.println("Infrome a quantidade de alunos com I");
				i = in.nextInt();
				
				 percMb = ((double) mb / alunos) * 100;
			        percB = ((double) b / alunos) * 100;
			        percR = ((double) r / alunos) * 100;
			        percI = ((double) i / alunos) * 100;
				
				
				System.out.println("\nEstat�sticas das men��es:");
		        System.out.printf("Men��o MB: %.2f%%\n", +percMb);
		        System.out.printf("Men��o B: %.2f%%\n", +percB);
		        System.out.printf("Men��o R: %.2f%%\n", +percR);
		        System.out.printf("Men��o I: %.2f%%\n", +percI);
					
							
							
			}
			
}

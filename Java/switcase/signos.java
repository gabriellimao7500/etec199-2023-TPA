package atividade1108;

import java.util.Scanner;
	public class signos {
		public static void main (String args []) {
		
			Scanner in = new Scanner(System.in);
			int mes, dia;
			
			System.out.println("Informe o Dia de nascimento");
			dia = in.nextInt();
			
			System.out.println("Informe o M�s de nascimento");
			mes = in.nextInt();
			
			switch (mes) {
			//Janeiro
			case 1:
				if (dia <=20){
					System.out.println("Seu signo � Capricornio");
					
				}else {	
				System.out.println("Seu signo � Aquario");
				}
				break;
			//Fevereiro	
			case 2:
				if (dia <=19){
					System.out.println("Seu signo � Aquario");
					
				}else {	
				System.out.println("Seu signo � Peixes");
				}
				break;
			//Março	
			case 3:
				if (dia <=20){
					System.out.println("Seu signo � Peixes");
					
				}else {	
				System.out.println("Seu signo � Aries");
				}
				break;
			//Abril
			case 4:
				if (dia <=20){
					System.out.println("Seu signo � Aries");
					
				}else {	
				System.out.println("Seu signo � Touro");
				}
				break;
			//Maio
			case 5:
				if (dia <=20){
					System.out.println("Seu signo � Touro");
					
				}else {	
				System.out.println("Seu signo � Gemeos");
				}
				break;
			//Junho
			case 6:
				if (dia <=20){
					System.out.println("Seu signo � Gemeos");
					
				}else {	
				System.out.println("Seu signo � C�ncer");
				}
				break;
			//Julho
			case 7:
				if (dia <=22){
					System.out.println("Seu signo � C�ncer");
					
				}else {	
				System.out.println("Seu signo � Le�o");
				}
				break;
			//Agosto
			case 8:
				if (dia <=22){
					System.out.println("Seu signo � Le�o");
					
				}else {	
				System.out.println("Seu signo � Virgem");
				}
				break;
			//Setembro
			case 9:
				if (dia <=22){
					System.out.println("Seu signo � Virgem");
					
				}else {	
				System.out.println("Seu signo � Libra");
				}
				break;
			//Outubro
			case 10:
				if (dia <=22){
					System.out.println("Seu signo � Libra");
					
				}else {	
				System.out.println("Seu signo � Escorpi�o");
				}
				break;
			//Novembro	
			case 11:
				if (dia <=21){
					System.out.println("Seu signo � Escorpi�o");
					
				}else {	
				System.out.println("Seu signo � Sargit�rio");
				}
				break;
			//Dezembro
			case 12:
				if (dia <=21){
					System.out.println("Seu signo � Sargit�rio");
					
				}else {	
				System.out.println("Seu signo � Capicornio");
				}
				break;
			}
		}
}
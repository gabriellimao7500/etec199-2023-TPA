package atividade1108;
	import java.util.Scanner;
		public class itens {

		public static void main (String args []) {
			
			Scanner in = new Scanner(System.in);
			int item;
			
			System.out.println("Digite o codigo do item");
			item = in.nextInt();
			
			switch (item) {
			
			case 1:
				System.out.println("Item: Cachorro Quente / Pre�o: 8,00 ");
				break;
			case 2:
				System.out.println("Item: Cheeseburger / Pre�o: R$ 12,00 ");
				break;
			case 3:
				System.out.println("Item: X-Salada / Pre�o: R$ 15,00 ");
				break;
			case 4:
				System.out.println("Item: Misto Quente / Pre�o: R$ 11,00 ");
				break;
			case 5:
				System.out.println("Item: P�o na chapa / Pre�o: R$ 6,00 ");
				break;
			case 6:
				System.out.println("Item: P�o de Queijo / Pre�o: 5,00 ");
				break;
			case 7:
				System.out.println("Item: X-Bacon / Pre�o:13,00 ");
				break;
				
			default:
				System.out.println("N�o temos itens com esse codigo");
			}
			
		}
}

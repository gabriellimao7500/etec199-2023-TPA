import java.util.*;
public class Ex6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], i=0, j=0, k = 0;
		a = new int[TAM];
		b = new int[TAM];
		
		
		for(i=0; i<TAM; i++) {
			System.out.print("Digite o "+(i+1)+"o valor do vetor A: ");
			a[i] = in.nextInt();
		}
		
		
		for(i=0; i<TAM; i++) {
			System.out.print("Digite o "+(i+1)+"o valor do vetor B: ");
			b[i] = in.nextInt();
		}
		
		
		int iguais=0;
		
		
		for(i=0; i<TAM; i++) {
						
			for(j=0; j<TAM;j++) {
				if(a[i] == b[j]) {
					
					iguais++;
					j+=TAM;
				}
			}
		}
		
		
		int c[] = new int[iguais];
		
		for(i=0; i<TAM; i++) {
			
			for(j=0; j<TAM;) {
				if(a[i] == b[j]) {
					c[k] = a[i];
					
					j+=5;
					k++;
					
				}
				j++;
			}
		}
		
				
		System.out.print("C = [ ");
		for(i=0; i<iguais; i++) {
			System.out.print(c[i]+" ");
			
		}
		
		System.out.print("]");
	}
}

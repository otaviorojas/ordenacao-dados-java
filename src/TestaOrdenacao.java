
import java.util.Scanner;

public class TestaOrdenacao {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ordenation ordenation = new Ordenation();
		Vetor vetor;
		
		String[] opcoes = new String[2];
		opcoes[0] = "1 - Bubble sort crescente";
		opcoes[1] = "2 - Bubble sort decrescente";
		
		System.out.println("************** [START OF PROGRAM] **************\n");
		System.out.println("Escola o tamanho do vetor:");
		vetor = new Vetor(scan.nextInt());
		
		
		System.out.println("***************************************************");
		System.out.println("1 - Preencher manualmente:");
		System.out.println("2 - Gerar Radom:");
		switch (scan.nextInt()) {
		case 1:			
			vetor.VectorFill();
			break;
		case 2:
			vetor.generateRandomValues();
			break;	
		default:
			System.out.println("Not valid");
			break;
		}
			

		System.out.println(vetor);
		
		
		System.out.println("***************************************************");
		System.out.println("Escolha o método de ordenacao:\n ");
		
		for (String op : opcoes) {
			System.out.println(op);
		}
		
		switch (scan.nextInt()) {
		case 1:			
			ordenation.bubbleSortUp(vetor);
			break;
		case 2:
			ordenation.bubbleSortDown(vetor);
			break;	
		default:
			System.out.println("Not valid");
			break;
		}
	
		System.out.println("******************* [RESULT] *******************");		
		System.out.print(vetor);
		

		scan.close();
	}
}

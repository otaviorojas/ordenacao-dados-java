
import java.util.Scanner;

public class TestaOrdenacao {

	public void App() {
		Scanner scan = new Scanner(System.in);
		Ordenation ordenation = new Ordenation();
		Vetor vetor;

		String[] opcoes = new String[4];
		opcoes[0] = "1 - Bubble sort crescente";
		opcoes[1] = "2 - Bubble sort decrescente";
		opcoes[2] = "3 - Insertion sort decrescente";
		opcoes[3] = "4 - Insertion sort decrescente";

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
		case 3:
			ordenation.insertionSortUp(vetor);
			break;
		case 4:
			ordenation.insertionSortDown(vetor);
			break;
		default:
			System.out.println("Not valid");
			break;
		}

		System.out.println("******************* [RESULT] *******************");
		System.out.print(vetor);
		System.out.println(ordenation.resultTimer());

		scan.close();
	}

	public static void main(String[] args) {
		
		TestaOrdenacao teste = new TestaOrdenacao();
		teste.App();
		
		

	}
}

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Vetor {
	
	private int [] vetor;
	Scanner scan = new Scanner(System.in);
	
	//Constructor
	public Vetor(int vectorSize) {
		this.vetor = new int[vectorSize];
	}
	
	public void VectorFill() {
		int arrAux[] = new int[this.vetor.length];
		System.out.println("Preencha os números a serem ordenados: ");
		for(int i =0;i<this.vetor.length;i++) {
			arrAux[i] = scan.nextInt();
		}
		this.vetor = arrAux;
		scan.close();
	}
	
	public void generateRandomValues() {
		Random r = new Random();
		System.out.println("Preencha o número máximo a ser gerado:");
		int maxRandom = scan.nextInt();
		
		int arrAux[] = new int[this.vetor.length];
		for(int i =0;i<this.vetor.length;i++) {
			arrAux[i] = r.nextInt(maxRandom);
		}
		
		this.vetor = arrAux;
	}
	
	public int[] getVetor() {
		return vetor;
	}

	public void setVetor(int[] vetor) {
		this.vetor = vetor;
	}

	@Override
	public String toString() {
		return "vetor=" + Arrays.toString(vetor) + "";
	}
	

}


public class Ordenation {

	public void bubbleSortUp(Vetor v) {
		int [] vetor = v.getVetor();
		int aux = 0;
		int i = 0;
		
		for ( i = vetor.length; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				if (vetor[j - 1] > vetor[j]) {
					 aux = vetor[j];
					vetor[j] = vetor[j - 1];
					vetor[j - 1] = aux;
				}

			}
		}
		 
	}
	
	  public void bubbleSortDown(Vetor v) {
		  int [] vetor = v.getVetor();
		  int aux = 0;
		  int i = 0;
			
			for ( i = 0; i < vetor.length; i++) {

				for (int j = i + 1; j < vetor.length; j++) {
					if (vetor[j] > vetor[i]) {
						 aux = vetor[j];
						vetor[j] = vetor[i];
						vetor[i] = aux;
					}

				}
			}
	    }
	  

}

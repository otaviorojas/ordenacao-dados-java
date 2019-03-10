
public class Ordenation {
	
	Timer count = new Timer();

	

	public void bubbleSortUp(Vetor v) {
		
		int [] vetor = v.getVetor();
		int aux = 0;
		int i = 0;
		
		count.timerStart();
		for ( i = vetor.length; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				if (vetor[j - 1] > vetor[j]) {
					 aux = vetor[j];
					vetor[j] = vetor[j - 1];
					vetor[j - 1] = aux;
				}

			}
		}
		count.timerEnd();
	}
	
	  public void bubbleSortDown(Vetor v) {
		  
		  int [] vetor = v.getVetor();
		  int aux = 0;
		  int i = 0;
		  
		  count.timerStart();
			for ( i = 0; i < vetor.length; i++) {

				for (int j = i + 1; j < vetor.length; j++) {
					if (vetor[j] > vetor[i]) {
						 aux = vetor[j];
						vetor[j] = vetor[i];
						vetor[i] = aux;
					}

				}
			}
			count.timerEnd();
	    }
	  
	  public void insertionSortUp(Vetor v) {
		  
			int[] vetor = v.getVetor();
			
			count.timerStart();
			for (int i = 0; i < vetor.length; i++) {
				int a = vetor[i];
				for (int j = i - 1; j >= 0 && vetor[j] > a; j--) {
					vetor[j + 1] = vetor[j];
					vetor[j] = a;
				}
			}
			count.timerEnd();
		}

		public void insertionSortDown(Vetor v) {
			
			int[] vetor = v.getVetor();
			
			count.timerStart();
			for (int i = 0; i < vetor.length - 1; i++) {
				int menor = i;
				for (int j = i + 1; j < vetor.length; j++) {
					if (vetor[j] < vetor[menor]) {
						menor = j;
					}
				}
				int temp = vetor[menor];
				vetor[menor] = vetor[i];
				vetor[i] = temp;
			}
			count.timerEnd();
		}
	  
		public Timer resultTimer() {
			return count;
		}
	  

}

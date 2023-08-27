package br.edu.fateczl.ordenacao.mergesort;

public class ControllerM {

	public ControllerM() {
		super();
	}

	public int[] MergeSort(int vet[], int inicio, int fim) {
		int meio = (inicio + fim) / 2;
		if (inicio < fim) {
			MergeSort(vet, inicio, meio); // Lado 1
			MergeSort(vet, meio + 1, fim); // Lado 2
			Intercala(vet, inicio, meio, fim);
		}
		return vet;

	}

	private void Intercala(int vet[], int inicio, int meio, int fim) {
		int novoVetor[] = new int[vet.length];
		int Esquerda = inicio;
		int Direita = meio + 1;

		for (int i = inicio; i <= fim; i++) {
			novoVetor[i] = vet[i];
		}
		
		// Testes
		for (int i = inicio; i <= fim; i++) {
			if (Esquerda > meio) {
				vet[i] = novoVetor[Direita];
				Direita++;
			} else if (Direita > fim) {
				vet[i] = novoVetor[Esquerda];
				Esquerda++;
			} else if (novoVetor[Esquerda] < novoVetor[Direita]) {
				vet[i] = novoVetor[Esquerda];
				Esquerda++;
			} else {
				vet[i] = novoVetor[Direita];
				Direita++;
				
			}
			
		}


	}

}

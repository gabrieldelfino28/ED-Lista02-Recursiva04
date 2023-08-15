package controller;

public class FatorialDuplo {

	public FatorialDuplo() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public int FuncFatDuplo(int N) {
		//Condição de parada --> Quando N chegar a 1, ele retorna 1 e finaliza a pilha de chamadas de funções.
		if(N == 1) {
			return 1;
		}
		
		return N * FuncFatDuplo(N-2);
		/*
		 * Fatorial duplo ocorre de uma forma recursiva assim como o próprio fatorial, porém em vez de reduzir
		 * N por 1 a cada chamada, N é reduzido por 2.
		 * Assim, a função recebe N e multiplica ele com a chamada da própria função, numa pilha, porém N irá 
		 * sendo multiplicado por (N-2) a cada chamada, até que a função chegue na sua condição de parada.
		 */
	}

}

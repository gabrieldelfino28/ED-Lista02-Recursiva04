package view;

import java.util.Scanner;

import controller.FatorialDuplo;

public class Principal {

	public static void main(String[] args) {
		FatorialDuplo f = new FatorialDuplo();
		int Num = 0;
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("Informe um Valor impar inteiro.");
			Num = s.nextInt();
			
			if(Num % 2 == 0 || Num < 0 ) {
				System.out.println("Erro detectado, tente novamente");
			}
		} while (Num % 2 == 0 || Num < 0 );
		s.close();
		int res = f.FuncFatDuplo(Num);
		System.out.println(res);
	}

}

package estruturaPosCondicionada;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int i = 1, num, som = 0;

		while (i<=10) {
			i++;
			System.out.println("Informe um número: ");
			num = ler.nextInt();
			som += num;
		}

		System.out.println("O resultado da soma é: "+ som);
		ler.close();


	}
}





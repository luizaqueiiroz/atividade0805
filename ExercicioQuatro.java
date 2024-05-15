package estruturaPosCondicionada;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 0; 
		int soma = 0;
		int idade;


		while (i <= 20) {
			i++;
			System.out.println("Informe sua idade");
			idade = ler.nextInt();
			if (idade >= 18) {
				soma++;
			}
			System.out.println(soma+ "São maiores de idade");
			ler.close();
		}
	}
}

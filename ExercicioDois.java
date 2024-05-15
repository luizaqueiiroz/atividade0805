package estruturaPosCondicionada;

public class ExercicioDois {

	public static void main(String[] args) {
		int num = 1;
		int valor, soma = 0;
		
		
		
		while (num<=15) {
			System.out.println(num);
			
			valor = num++;
			soma += valor;
			
		}
		System.out.println("O resultado da soma é: "+ soma);
	}

}

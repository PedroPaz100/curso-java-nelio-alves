package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		int x,y,soma;
		System.out.println("Soma de valores ");
		System.out.println("Digite um numero inteiro");
		x=sc.nextInt();
		System.out.println("Digite o segundo numero inteiro");
		y=sc.nextInt();
		soma=x+y;
		System.out.printf("a soma dos dois valores é igual %d",soma);
		sc.close();

	}

}

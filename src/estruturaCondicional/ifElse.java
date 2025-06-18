package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um numero inteiro para saber se é negativo ou positivo");
		x=sc.nextInt();
		
		if(x>=0){
			System.out.print("NAO NEGATIVO");
		}
		else{
			System.out.print("NEGATIVO");
		}
		
		
		sc.close();

	}

}

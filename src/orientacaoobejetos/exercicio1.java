package orientacaoobejetos;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		Retangulo x= new Retangulo();
		
		System.out.println("Qual altura do retângulo:");
		x.altura=sc.nextDouble();
		System.out.println("Qual largura/base do retângulo:");
		x.base=sc.nextDouble();
		
		System.out.println(x);
		
		sc.close();

	}

}

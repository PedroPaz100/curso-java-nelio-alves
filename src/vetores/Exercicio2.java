package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantos numeros voce vai digitar? ");
		n=sc.nextInt();
		sc.nextLine();
		
		double[]vetor= new double[n];
		double soma=0;
		
		for(int i=0;i<n;i++){
			System.out.printf("Digite o %dº: ",i+1);
			vetor[i]=sc.nextDouble();
			soma+=vetor[i];
		}
		double media=soma/n;
		System.out.println("Nº salvos no vetor ");
		for(int i=0;i<n;i++){
			System.out.println(vetor[i]);
		}
		System.out.printf("A soma dos valores do vetor é: %.2f",soma);
		System.out.println("");
		System.out.printf("A media dos valores do vetor é: %.2f",media);
		sc.close();
	}

}

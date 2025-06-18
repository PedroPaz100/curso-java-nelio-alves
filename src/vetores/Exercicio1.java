package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc= new Scanner(System.in);
	
	int n;
	
	System.out.println("Quantos numeros voce vai digitar? ");
	n= sc.nextInt();
	sc.nextLine();
	
	Double[] vetor= new Double[n];
	for(int i=0;i<n;i++){
		System.out.printf("Digite o %dº ",i+1);
		vetor[i]=sc.nextDouble();
	}
	System.out.println("numeros salvos no vetor");
	for(int i=0;i<n;i++){
		System.out.println(vetor[i]);
	}
	System.out.println("numeros negativos salvos no vetor");
	for(int i=0;i<n;i++){
		if(vetor[i]<0){
			System.out.println(vetor[i]);
		}
	}
	sc.close();
	}

}

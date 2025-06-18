package vetores;

import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoa;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=  new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantas pessoas serao digitadas?");
		n=sc.nextInt();
		sc.nextLine();
		
		Pessoa[]vetor= new Pessoa[n];
		double soma=0;
		
		for(int i=0;i<n;i++){
			System.out.printf("Dados da %d° pessoa:",i+1);
			System.out.println("Nome");
			String nome=sc.nextLine();
			System.out.println("Idade");
			int idade=sc.nextInt();
			sc.nextLine();
			System.out.println("Altura");
			double altura=sc.nextDouble();
			sc.nextLine();
			vetor[i]= new Pessoa(nome,idade,altura);
			soma+=vetor[i].getAltura();
		}
		int contador=0;
		for(int i=0;i<n;i++){
			if(vetor[i].getIdade()<16){
				contador+=1;
			}
		}
		double PorcentagemMenores=(contador * 100.0) / n;
		double media=soma/n;
		
		System.out.printf("%nAltura média: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", PorcentagemMenores);

		
		
		sc.close();

	}

}

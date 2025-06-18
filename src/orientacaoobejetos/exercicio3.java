package orientacaoobejetos;

import java.util.Locale;
import java.util.Scanner;

import entidades.contaBancaria;

public class exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		System.out.println("Nº da conta");
		int numeroConta=sc.nextInt();
		sc.nextLine();
		System.out.println("Nome titular da conta");
		String nome=sc.nextLine();
		System.out.println("Deja fazer o 1º deposito?(s/n)");
		double saldo = 0;
		char validador = sc.next().charAt(0);
		
		if (validador == 's' || validador == 'S'){
			System.out.println("Valor do 1º deposito?");
			saldo=sc.nextDouble();
		}
		else{
			 saldo=0;
		}
		
		contaBancaria x= new contaBancaria(nome,numeroConta,saldo);
		System.out.println(x);
		
		System.out.println("Valor de deposito");
		double valordeposito=sc.nextDouble();
		x.depositar(valordeposito);
		System.out.println(x);
		
		System.out.println("Valor do saque");
		double valorsaque=sc.nextDouble();
		x.sacar(valorsaque);
		System.out.println(x);
		
		
		sc.close();

	}

}

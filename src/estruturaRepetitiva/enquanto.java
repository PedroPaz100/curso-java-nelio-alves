package estruturaRepetitiva;

import java.util.Scanner;

public class enquanto {

	public static void main(String[] args) {
		/*Scanner sc= new Scanner(System.in); 
		int x,soma;
		
		System.out.println("digite um Nº inteiro");
		x=sc.nextInt();
		soma=x;
		
		 while(x!=0){
			 System.out.println("digite um Nº inteiro diferente de 0");
			 x=sc.nextInt();
			 soma=soma+x;
		}
		System.out.println(soma);
	sc.close();*/
	
		
		Scanner sc= new Scanner(System.in); 
		
		int senha;
		
		System.out.println("Digite a senha:");
		senha=sc.nextInt();
		
		while(senha!=2002){
			System.out.println("Senha Invalida,digite novamente:");
			senha=sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}

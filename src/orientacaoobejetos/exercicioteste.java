package orientacaoobejetos;

import java.util.Locale;
import java.util.Scanner;
import entidades.Produto;
public class exercicioteste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		Produto x= new Produto();
		int qnt;
		
		System.out.println("Nome Produto");
		x.nome=sc.nextLine();
		System.out.println("Preço Produto");
		x.preco=sc.nextDouble();
		System.out.println("quantidade em estoque");
		x.quantidade=sc.nextInt();
		
		System.out.println(x);
		
		System.out.println("entrada estoque,qual a quantidade");
		qnt=sc.nextInt();
		x.addestoque(qnt);
		System.out.printf("Produto %s,tem %d unidades em estoque e o avlor total é %.2f",x.nome,x.quantidade,x.totalestoque());
		
		System.out.println("saída estoque,qual a quantidade");
		qnt=sc.nextInt();
		x.removeestoque(qnt);
		
		System.out.println(x);
		sc.close(); 

	}

}

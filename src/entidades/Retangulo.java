package entidades;

public class Retangulo {
	public Double altura;
	public Double base;
	
	public Double areaRetangulo(){
		return altura*base;
	}
	public Double perimetroRetangulo(){
		return 2*(altura+base);
	}
	public Double diagonalRetangulo(){
		double potencia=Math.pow(altura, 2)+Math.pow(base,2);
		double resultado=Math.sqrt(potencia);		
		return resultado;
	}
	
	public String toString(){
		return "Area : "+areaRetangulo()+" Perimetro : "+perimetroRetangulo()+" Diagonal: "+diagonalRetangulo();
	}
}

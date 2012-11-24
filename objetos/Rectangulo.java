package objetos;

public class Rectangulo {
	// atributos
	
	private int base;
	private int altura;
	
	// constructores
	
	public Rectangulo (){ //constructor vacio
		
	}
		
	public Rectangulo (int base, int altura){
		this.base=base;
		this.altura=altura;
	}
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}
	
	public int area(){
		/*int ar=base*altura;
		return ar;*/
		
		return base*altura;
	}
	
	public int perimetro(){
		// return (base+altura)*2;
		
		return 2*base+2*altura;
			
			
	}
	
	public boolean areaMayor (Rectangulo r){
	
		if (this.area()>=r.area())
			return true;
		else
			return false;
	}
	
	
	
	
	
	
}


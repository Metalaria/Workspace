package objetos;

public class Rectangulo {
	// atributos
	
	private int altura;
	private int base;
	private int area;
	
	// constructores
	
	public Rectangulo (){
		area = base*altura; //constructor vacio
		
	}
		
	public Rectangulo(int altura, int base) {
		
		this.altura = altura;
		this.base = base;
		area = base*altura;
	}
	
	

	public Rectangulo(int altura) {
	
		this.altura = altura;
		area = base*altura;
	}

	/*public Rectangulo (int base, int altura){
		this.base=base;
		this.altura=altura;
	}*/
	
	
	
	
	protected int area(){
		return area;
		
		//return base*altura;
	}
	public boolean areaMayor (Rectangulo r){
	
		if (this.area()>=r.area())
			return true;
		else
			return false;
	}
	public int getAltura() {
		return altura;
	}
	public int getBase() {
		return base;
	}
	
	public int perimetro(){
		// return (base+altura)*2;
		
		return 2*base+2*altura;
			
			
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}
	
	
	
	
	
	
}


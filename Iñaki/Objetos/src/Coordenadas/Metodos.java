package Coordenadas;

public class Metodos {
	
	private int x;
	private int y;

	//Constructor por defecto
	public Metodos()
	{}
	
	//Constructor copia
	public Metodos (Metodos p){
		this.x=p.x;
		this.y=p.y;
	}
	
	//Constructor definido
	public Metodos (int x, int y){
		this.x=x;
		this.y=y;
	}
	
	//Set XY
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Get X
	public int getX() {
		return x;
	}
	
	//Get Y
	public int getY() {
		return y;
	}
	
	//GetXY
	public String getXY(){
		return "x: "+x+",y: "+y;
	}
	
	//Decremento
	public String getDecXY(){
		this.x=x-1;
		this.y=y-1;
		return "Decremento de x:"+x+", y:"+y;
	}
	
	//Incremento
	public String getIncXY(){
		this.x=x-1;
		this.y=y-1;
		return "Incremento de x:"+x+", y:"+y;
	}
	
	//Recta
	public String recta (Metodos p){
		double m;
		double x1=this.x;
		double x2=p.x;
		double y1=this.y;
		double y2=p.y;
		m=(y1-y2)/(x1-x2);
		m=(this.y-p.y)/(this.x-p.x);
		return "Recta: y-"+y1+"="+m+"(x-"+x1+")";
	}
	
	//Opuesto
	public String opuestoXY(){
		Metodos op = new Metodos ();
		op.x=this.y;
		op.y=this.x;
		return "Opuesto X: "+op.x+" opuesto Y: "+op.y;
	}

}
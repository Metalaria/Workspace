package SolucionesObjetosBasicos.recta;

public class Posicion {
	private int x;
	private int y;
	
	public Posicion (){	};
	
	public Posicion(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Posicion (Posicion p){
		this.x=p.x;
		this.y=p.y;
	}
	
	public void setXY (int x1, int y1){
		x=x1;
		y=y1;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	public void getXY (){
		System.out.println("("+x+","+y+")");
	}
	
	public Posicion decXY(int x1, int y1){		
		Posicion nuevo=new Posicion(x-x1,y-y1);
		return nuevo;
		
	}

	public Posicion incXY(int x1, int y1){
		Posicion nuevo=new Posicion(x+x1,y+y1);
		return nuevo;
	}
		
	public Posicion opuesto (){
		Posicion op=new Posicion();
		op.x=y;
		op.y=x;
		return op;
	}
	
	public void recta (Posicion p){
		//int m=(p.getY()-y)/(p.getX()-x);
		double m=(p.y-this.y)/(p.x-this.x);
		System.out.println("La pendiente de la recta es "+m);
		System.out.println("la ecuacion de la recta es y-"+p.getY()+ "= "+m+"(x-"+p.getX()+")");
	}

	
}

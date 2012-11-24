package posicion;

public class Posicion {
	private int x;
	private int y;
	
	public Posicion (){}
	
	public Posicion (int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public Posicion (Posicion p){
		this.x=p.x;
		this.y=p.y;
	}
	
	public void setX (int x){
		this.x=x;
	}
	
	public void setY (int y){
		this.y=y;
	}
	
	public void setXY (int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}

	@Override
	public String toString() {
		return "Posicion [x=" + x + ", y=" + y + "]";
	}
	
	public Posicion opuestoXY(){
		/*Posicion op =new Posicion ();
		op.x=this.y;
		op.y=this.x;
		return op;*/
		
		
		Posicion op=new Posicion (this.y,this.x);
		return op;
		
	}
	
	

}

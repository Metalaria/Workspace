package Viviendas;

public class Chalet extends Vivienda {

	protected boolean jardin;
	
	public Chalet(){
		
	}
	
	public Chalet (String calle,int numero,boolean jardin){
		super(200,calle,numero);
		this.jardin=jardin;
	}

	public boolean isJardin() {
		return jardin;
	}

	public void setJardin(boolean jardin) {
		this.jardin = jardin;
	}
	
	public String toString() {
		String salida;
		salida=super.toString();
		salida+="Jardin: "+jardin+"\n";
		return salida;
	}
	
}

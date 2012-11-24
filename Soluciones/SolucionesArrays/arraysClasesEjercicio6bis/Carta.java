package arraysClasesEjercicio6bis;


public class Carta {
	private String palo;
	private String nombre;
	private double valor;

	private static String[] palos={"Corazones", "Picas", "Rombos","Treboles"};
	private static String [] nombres={"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez","J","Q","K"};
	private static  double [] valorCarta={1,2,3,4,5,6,7,8,9,10,0.5,0.5,0.5};
	
	public Carta(){
		int pal=(int)(Math.random() * 4);
		//genera un nº aleatoria entre 0 y 4 para el palo
		int num=(int)(Math.random() * 13);
		//idem para el nombre
		palo=palos[pal];
		nombre=nombres[num];
		valor=valorCarta[num];		
	}
	
	public String getPalo() {
		return palo;
	}

	public String getNombre() {
		return nombre;
	}

	public double getValor() {
		return valor;
	}

	public String toString() {
		return "La carta que has obtenido es " + nombre + " de " +  palo+ " y su  valor es "+ valor;
	}

	

}

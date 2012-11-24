package SolucionesObjetosBasicos.partidoTenis;

public class Partido {
	private Jugador jug1;
	private Jugador jug2;
	
	Partido (Jugador jug1, Jugador jug2){
		this.jug1=jug1;
		this.jug2=jug2;
	}
	
	public Jugador getJug1() {
		return jug1;
	}
	public Jugador getJug2() {
		return jug2;
	}
	
	public Jugador ganador(){
		
		double pto1;
		double pto2;
		do {
			pto1=Math.random()*jug1.getPunt();
			pto2=Math.random()*jug2.getPunt();
		}
		while (pto1==pto2);
		
		System.out.println("Puntos del jugador 1 en el partido "+pto1);
		System.out.println("Puntos del jugador 2 en el partido "+pto2);
		
		if (jug1.getPunt()>jug2.getPunt())
			return jug1;
		else return jug2;
	}
	 public void jugar(){
		 Jugador ganad=ganador();
		 ganad.incremPunt();
		 System.out.println("Ganador: "+ganad.getNombre());
		 System.out.println("Su nueva puntuacion en la ATP es "+ganad.getPunt());
	
	 }
	
	
	
	
	
	
	

}

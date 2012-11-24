import Ejercicio1.LeerTeclado;


public class Ejercicio46 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		
		int a,contador,max,min,medio;
		contador=0;
		System.out.println("Introduce un valor");
		a=LeerTeclado.readInteger();
		max=a;
		min=a;
		medio=0;
		if(a==5)contador=contador+1;
		
		while(contador<3){
			
			System.out.println("Introduce un valor");
			a=LeerTeclado.readInteger();
			if(a==5)contador=contador+1;
			else contador=0;
			if(a<min)min=a;
			if(a>max)max=a;
		}
		System.out.println("Los resultados son:");
		System.out.println("Minimo: "+min);
		System.out.println("Maximo: "+max);
		medio=(min+max)/2;
		System.out.println("Medio: "+medio);
	}

}

import Ejercicio1.LeerTeclado;


public class Ejercicio29 {
	public static void main(String[] args) {
		/*29. Se introducen edades de 25 alumnos de una clase,
		 * imprimir la edad del más joven, la del mayor y la media de la clase. */
			
		int min=9999;
		int max=-9999;
		int med=0;
		int cont=0;
		
		do 
		{
			System.out.println("Introduce edad: ");
			int n=LeerTeclado.readInteger();
			
			if (n>max)
				max=n;
			if (n<min)
				min=n;
			med=med+n;
			cont++;
		}
		while (cont<3);
		
		System.out.println("Mayor: "+max+" Menor: "+min+" Media: "+med/cont);
	}
}
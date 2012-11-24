package objetosOrdenables;

import Empleados.Empleado;
import Empleados.Fijo;
import Figuras.*;

public class TestOrdenable {

	public static void main(String[] args) {
		
		Rectangulo r1=new Rectangulo ("rojo", 5, 6);
		Rectangulo r2=new Rectangulo ("azul", 2, 6);
		Rectangulo r3=new Rectangulo ("yellow", 2, 4);
		Rectangulo r4=new Rectangulo ("verde", 5, 3);
		Rectangulo r5=new Rectangulo ("negro", 4, 7);
		
		Ordenable [] arrayRec={r1,r2,r3,r4,r5};
		
		System.out.println("array desordenado");
		
		for (int i=0; i<arrayRec.length; i++){
			System.out.println(arrayRec[i].toString());
		}
		
		Algoritmos.ordenar(arrayRec);
		
		System.out.println("array ordenado");
		
		for (int i=0; i<arrayRec.length; i++){
			System.out.println(arrayRec[i].toString());
		}
		
		
		Fijo f1 = new Fijo ("Paco", "90348763-G", 628847102, 860);
		Fijo f2 = new Fijo ("Maria", "28902824-H", 603411914, 790);
		Fijo f3 = new Fijo ("Luis", "90348755-G", 628847102, 820);
		Fijo f4 = new Fijo ("Carmen", "27702824-H", 603411914, 990);
		
		Ordenable [] arrayFijo={f1,f2,f3,f4};
		
		System.out.println("array desordenado");
		
		for (int i=0; i<arrayFijo.length; i++){
			System.out.println(arrayFijo[i].toString());
		}
		
		Algoritmos.ordenar(arrayFijo);
		
		System.out.println("array ordenado");
		
		for (int i=0; i<arrayFijo.length; i++){
			System.out.println(arrayFijo[i].toString());
		}

	}

}

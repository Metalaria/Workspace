package objetosOrdenables;

public class Algoritmos {
	
	public static void ordenar(Ordenable [] array){
		Ordenable aux;
		for (int i=0; i<array.length-1 ;i++)
			for (int j=i+1; j<array.length; j++)
				if (array[i].esMayor(array[j])){
					aux=array[i];
					array[i]=array[j];
					array[j]=aux;
				}
	}

}

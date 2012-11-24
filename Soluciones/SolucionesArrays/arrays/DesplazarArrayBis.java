package arrays;

public class DesplazarArrayBis {

	public static void mostrararray( int[] array){
		for(int i=0; i<array.length;i++){
			System.out.println(array[i]);
			
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[30];
		for (int i=0;i<30;i++){
			array[i] = (int)(Math.random()*50 + 1);
		}
		mostrararray(array);
		System.out.println("-----------");
		int aux=array[29];
		for (int i=29;i>0;i--){
				array[i] = array[i-1];
		}
		array[0] = aux;
		mostrararray(array);
	}

}

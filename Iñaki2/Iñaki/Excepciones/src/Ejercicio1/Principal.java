package Ejercicio1;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array=new int[5];
		int num=6;
		for(int i=0;i<array.length;i++){
			array[i]=0;
		}
		try{
			for(int i=0;i<4;i++){
				System.out.println("Posicion: "+array[i]);
			}
			for(int i=0;i<4;i++){
				System.out.println(num/array[i]);
			}
		}
		/*catch (ArrayIndexOutOfBoundsException e){
			System.out.println("No se puede acceder a esa posicion de memoria");
		}
		catch (ArithmeticException f){
			System.out.println("No se puede dividir por 0");
		}*/
		catch(Exception z){
			System.out.println("Hay un error");
		}
	}

}

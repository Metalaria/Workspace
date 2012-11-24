
public class Ejercicio1 {
	public static void main(String[] args) {
		int array[]=new int [5];
		array[3]=0;
		try{
			System.out.println("Introduce un número");
			int n=LeerTeclado.readInteger();
			System.out.println(array[n]);
			for (int i=0; i<array.length; i++){
				System.out.println(n/array[i]);
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
		
		// dividir(array);
	}
	
	/*public static void dividir(int array[]){
		System.out.println("Introduce un número");
		int num=LeerTeclado.readInteger();
		for (int i=0; i<array.length; i++){
			try {
				System.out.println(num/array[i]);
			}
			catch (Exception e1){
				System.out.println(e1);
			}
		}
	}*/
}

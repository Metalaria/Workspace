
public class BucleFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num, vueltas, suma=0;
		float media;
		System.out.println("Introduce el nº de vueltas");
		vueltas=LeerTeclado.readInteger();
		
		for (int i=1; i<=vueltas;i++){
			
			System.out.println("Introduce el nº a sumar");
			num=LeerTeclado.readInteger();
			suma+=num;
			
		}
		System.out.println("la suma es "+suma);
		media=(float)suma/vueltas;
	

	}

}

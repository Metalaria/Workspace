package arrays;

public class DesgloseMonedas4 {

	
	public static void main(String[] args) {

		int[] contador=new int[15];
		float [] monedas={500f,200f,100f,50f,20f,10f,5f,2f,1f,0.5f,0.2f,0.1f,0.05f,0.02f,0.01f};
		System.out.println("Introduzca la cantidad en euros a desglosar ");
		float cantidad=LeerTeclado.readFloat();
		
		System.out.println("Haciendo el desglose...");
		
		for (int i=0;i<15 && cantidad>0 ; i++){ // si ya no hay más divisiones que hacer termina el desglose
			contador[i]=(int)(cantidad/monedas[i]);
			cantidad%=monedas[i];
			
		}
		
		System.out.println("Cantidad de billetes o monedas necesarias"); 
		for (int i=0;i<15; i++){
			if (contador[i]!=0)
				System.out.println("De valor "+monedas[i] +" : "+ contador[i]);
		}

	}

}

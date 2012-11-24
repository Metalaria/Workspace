import java.io.*;

public class CambioBase {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		String resp=LeerTeclado.readString();
		System.out.println("¿Desea introducir un numero para pasarlo a binario? (s/n)");
		while (resp=="s") {
		BufferedReader L = new BufferedReader(new InputStreamReader(System.in));
		int Decimal,R, x = 0;
		String Binario = "";
 
		Decimal=Integer.parseInt(L.readLine());
 
		R = Decimal%2;
		if (R == 1){
 
		while (Decimal > 1){
			Decimal /= 2;
		x = Decimal%2;
		Binario  = (x+Binario +"");
		 }
		}
		else{
 
		while (Decimal > 0){
			Decimal /= 2;
			x = Decimal%2;
			Binario  = (x+Binario +"");
			 }
		}
 
		System.out.println(Binario +x);
		} 
		
	}
 
}

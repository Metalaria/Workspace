
public class Ejercicio4 {
	public static void main(String[] args) {
		float[] billetes={500f, 100f, 50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f};
		System.out.println("Introduzca una cantidad de dinero sin el símbolo €");
		float  num=LeerTeclado.readFloat();
		System.out.println("La cantidad es: "+num);
		float div=num;
		int cont100=0;
		int cont500=0;
		int cont50=0;
		int cont20=0;
		int cont10=0;
		int cont0=0;
		int cont5=0;
		int cont2=0;
		int cont1=0;
		int cont0_50=0;
		int cont0_20=0;
		int cont0_10=0;
		int cont0_05=0;
		int cont0_02=0;
		int cont0_01=0;
		
		do {
			if (div%500>=1){
				cont500++;
			}
			else if (div%200>=1){
				cont100++;
			}
			else if (div%50>=1){
				cont50++;
			}
			else if (div%20>=1){
				cont20++;
			}
			else if (div%10>=1){
				cont10++;
			}
			else if (div%5>=1){
				cont5++;
			}
			else if (div%2>=1){
				cont2++;
			}
			else if (div%1>=1){
				cont1++;
			}
			
		} while (div>0);
	}
}

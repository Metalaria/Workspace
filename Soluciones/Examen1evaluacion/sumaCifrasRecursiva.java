

public class sumaCifrasRecursiva {

	public static void main(String[] args) {
		
			int n;
			System.out.println("Introduce un nº");
			n = LeerTeclado.readInteger();
			System.out.println("La suma de cifras es  "+ sumaCifra(n));
			
		}
		public static int sumaCifra(int i){
			int aux;
			if (i<10)
				return i;
			else {
				 aux=i%10;
				 return aux+sumaCifra(i/10);		
				
			}
		

	}

}


public class Ejercicio3 {
	public static void main(String[] args) {
		System.out.println("introduzca una nota");
		double not=LeerTeclado.readDouble();
		int contNot=0;
		while (not>0 || not<=10) {
			System.out.println("Introduzca otra nota");
			not=LeerTeclado.readDouble();
			contNot++;
			double [] notas=new double[11];
			notas[(int) not]=not;
			System.out.println("Las notas son: "+notas[(int) not]);
		}
	}
}

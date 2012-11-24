
public class Ejercicio07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ejercicio dias de la semana
		
		int dia;
		dia=Integer.parseInt(args[0]);
		switch (dia){
		case 1: System.out.println("Lunes");
		break;
		case 2: System.out.println("Martes");
		break;
		case 3: System.out.println("Miercoles");
		break;
		case 4: System.out.println("Jueves");
		break;
		case 5: System.out.println("Viernes");
		break;
		case 6: System.out.println("Sabado");
		break;
		case 7: System.out.println("Domingo");
		break;
		default: System.out.println("El numero no es correcto");
		}
		
	}

}

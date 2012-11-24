import Ejercicio1.LeerTeclado;


public class Menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// El menu de todos los Ejercicios
		
		int ejercicio,ejecutar;
		ejecutar=1;
	while(ejecutar==1){
		System.out.println("Intruduce un numero de Ejercicio.");
		ejercicio=LeerTeclado.readInteger();
		switch (ejercicio){
		case 1: Ejercicio01.main(null);
		break;
		case 2: Ejercicio02.main(null);
		break;
		case 3: Ejercicio03.main(null);
		break;
		case 4: Ejercicio04.main(null);
		break;
		case 5: Ejercicio05.main(null);
		break;
		case 6: Ejercicio06.main(null);
		break;
		case 7: Ejercicio07.main(null);
		break;
		case 8: Ejercicio08.main(null);
		break;
		case 9: Ejercicio09.main(null);
		break;
		case 10: Ejercicio10.main(null);
		break;
		case 11: Ejercicio11.main(null);
		break;
		case 12: Ejercicio12.main(null);
		break;
		case 13: Ejercicio13.main(null);
		break;
		case 14: Ejercicio14.main(null);
		break;
		case 15: Ejercicio15.main(null);
		break;
		case 16: Ejercicio16.main(null);
		break;
		case 17: Ejercicio17.main(null);
		break;
		case 18: Ejercicio18.main(null);
		break;
		case 19: Ejercicio19.main(null);
		break;
		case 20: Ejercicio20.main(null);
		break;
		case 21: Ejercicio21.main(null);
		break;
		case 22: Ejercicio22.main(null);
		break;
		case 23: Ejercicio23.main(null);
		break;
		case 24: Ejercicio24.main(null);
		break;
		case 25: Ejercicio25.main(null);
		break;
		case 26: Ejercicio26.main(null);
		break;
		case 27: Ejercicio27.main(null);
		break;
		case 28: Ejercicio28.main(null);
		break;
		case 29: Ejercicio29.main(null);
		break;
		case 30: Ejercicio30.main(null);
		break;
		case 31: Ejercicio31.main(null);
		break;
		case 32: Ejercicio32.main(null);
		break;
		case 33: Ejercicio33.main(null);
		break;
		case 34: Ejercicio34.main(null);
		break;
		case 35: Ejercicio35.main(null);
		break;
		case 36: Ejercicio36.main(null);
		break;
		case 37: Ejercicio37.main(null);
		break;
		case 38: Ejercicio38.main(null);
		break;
		case 39: Ejercicio39.main(null);
		break;
		case 40: Ejercicio40.main(null);
		break;
		case 41: Ejercicio41.main(null);
		break;
		case 42: Ejercicio42.main(null);
		break;
		case 43: Ejercicio43.main(null);
		break;
		case 44: Ejercicio44.main(null);
		break;
		case 45: Ejercicio45.main(null);
		break;
		case 46: Ejercicio46.main(null);
		break;
		default: System.out.println("El numero no es correcto");
		System.out.println("Si quieres ejecutar otro ejercicio introduce 1 si no introduce 0");
		ejecutar=LeerTeclado.readInteger();
	}
		}

	}

}


public class AnnoBisiesto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int anno;
		do
			anno=LeerTeclado.readInteger();
		while (anno<0);
		if ((anno%4==0) && ((anno%100!=0) || (anno%400==0)))
			System.out.println (anno+ " es bisiesto");
		else
			System.out.println (anno+ "  no es bisiesto");

	}

}

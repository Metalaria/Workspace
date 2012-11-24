public class Principal {
	public static void main(String[] args) {
		Empresa empr = new Empresa(null, null);
		Departamento informatica = new Departamento("adminitración", 10000);
		System.out.println("Segundo departamento");
		Departamento electronica = new Departamento("informática", 30000);
		
		empr.insertarListaCalculable(informatica);
		empr.insertarListaCalculable(electronica);
		
		int op;
		do {
			System.out.println("Seleccione una opción");
			System.out.println("Opción 1: Contratar empleado");
			System.out.println("Opción 2: Ascender empleado");
			System.out.println("Opción 3: Incrementar recursos");
			System.out.println("Opción 4: Fin");
			op =LeerTeclado.readInteger();
			if (op==1){
				System.out.println("¿Va a dar de alta un ejecutivo? (s/n)");
				String resp=LeerTeclado.readString();
				if (resp.equalsIgnoreCase("s")){
					Ejecutivo1 ej1= new Ejecutivo1();
					System.out.println(ej1.toString());
				}
				else{
					Empleado emp1= new Empleado();
					System.out.println(emp1.toString());
				}
			}
			
			if (op==2){
				empr.ascender();
			}
			
			if (op==3){
				empr.incrementar();
			}
			
			if (op==4){
				System.out.println("Fin");
			}
		}while (op!=4);
	}

}

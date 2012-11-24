package Ejercicio02;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno[] lista=new Alumno [30];		
		String nombre;
		double nota;
		
		for(int i=0;i<lista.length;i++){
			System.out.println("Introduce Nombre:");
			nombre=LeerTeclado.readString();
			nota=Math.random()*11;
			lista[i]=new Alumno(nombre,nota);
			
		}
		
		visualizar(lista);
		calificacion(lista);
		compararNombres(lista);
		visualizar(lista);
		buscarNombre(lista);
		buscarNota(lista);
		
	}

	public  static void visualizar(Alumno lista[]){
		for(int i=0;i<5;i++){
		System.out.println(lista[i].toString());
		}
	}
	public static void calificacion(Alumno lista[]){
		for(int i=0;i<lista.length;i++){
			System.out.println("El alumno "+lista[i].getNombre()+" esta "+lista[i].getAprobado());
		}
		int aprob=0;
		int suspe=0;
		for(int i=0;i<5;i++){
			if(lista[i].getNota()<5){
				suspe++;
			}
			else aprob++;
		}
		System.out.println("Hay:"+aprob+"aprobados y "+suspe+" Suspensos.");
		double media=0;
		for(int i=0;i<lista.length;i++){
			media=media+lista[i].getNota();
		}
		media=media/lista.length;
		System.out.println("La media es: "+media);
	}
	
	public static void compararNombres(Alumno lista[]){
		String nb1;
		String nb2;
		Alumno aux;
		for(int i=0;i<lista.length-1;i++){
			for(int j=i+1;j<lista.length;j++){
			nb1=lista[i].getNombre();
			nb2=lista[j].getNombre();
				if(nb1.compareTo(nb2)>0){//El nombre 1 es mayor
					aux=lista[i];
					lista[i]=lista[j];
					lista[j]=aux;
				}
			}
		}
		
	}
	public static void buscarNombre(Alumno lista[]){
		System.out.println("Introduca el nombre del Alumno.");
		String busca=LeerTeclado.readString();
		String nb1;
		for(int i=0;i<lista.length;i++){
			nb1=lista[i].getNombre();
			if(busca.compareTo(nb1)==0){
				System.out.println("La nota del alumno "+nb1+" es "+lista[i].getNota());
			}
		}
	}
	public static void buscarNota(Alumno lista[]){
		System.out.println("Introduca la nota.");
		int busca=LeerTeclado.readInteger();
		for(int i=0;i<lista.length;i++){
			if(lista[i].getNota()>=busca){
				System.out.println(lista[i].getNombre()+" nota: "+lista[i].getNota());
			}
		}
	}
}


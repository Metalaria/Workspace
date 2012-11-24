package Telefonia;

import java.util.List;
import java.util.Vector;

import Empleados.Empleado;

public class Centralita {

	private Vector <Llamadas> listaLlamadas; 
	
	public Centralita(){
		listaLlamadas= new Vector <Llamadas>();
	}
	
	
	public void nuevaLlamada(){
		//Pedir datos por teclado y los metemos en String
		System.out.println("Introduce el numero desde el que se realiza la llamada.");
		String numeroOrigen=LeerTeclado.readString();
		System.out.println("Introduce el numero al cual se hace la llamada.");
		String numeroDestino=LeerTeclado.readString();
		System.out.println("Introduce la duracion de la llamada es segundos.");
		int duracion=LeerTeclado.readInteger();
		
		String prefijoOrigen=numeroOrigen.substring(0,2);
		String prefijoDestino=numeroDestino.substring(0,2);
		
		if(prefijoOrigen.compareTo(prefijoDestino)==0){
			llamadaLocal(numeroOrigen,numeroDestino,duracion);
		}
		else
		{
			llamadaProvincial(numeroOrigen,numeroDestino,duracion);
		}
		
		
	}
	
	public void llamadaLocal(String numeroOrigen,String numeroDestino,int duracion){
		
		Llamadas a = new LlamadasLocales (numeroOrigen,numeroDestino,duracion);
		listaLlamadas.add(a);
	}
	
	public void llamadaProvincial(String numeroOrigen,String numeroDestino,int duracion){
		double hora;
		System.out.println("Introduce la hora a la que se realizo la llamada");
		hora=LeerTeclado.readDouble();
		Llamadas a = new LlamadasProvinciales (numeroOrigen,numeroDestino,duracion,hora);
		listaLlamadas.add(a);
		
	}
	
	public void visualizar (){
		for(int i=0; i<((List<Llamadas>) listaLlamadas).size(); i++)
			System.out.println(listaLlamadas.elementAt(i).toString());
	}
}



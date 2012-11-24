import java.io.*;
import java.util.Vector;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ListaPersona implements Acceso, Serializable {

	Vector <Persona> vPersonas;
	private ObjectInputStream lectorDeObjetos;
	private ObjectOutputStream escritorDeObjetos;
	
	public ListaPersona() {
		vPersonas= new Vector <Persona>();
	}
	
	public void anadir(Object o) {
		vPersonas.add((Persona) o);
	}

	public void borrar(Object o) {
		vPersonas.removeElement((Persona)o);
	}

	public Object buscar(String nombre) {
		boolean enc=false;
		Persona p=null;
		for (int i=0; i<vPersonas.size(); i++)
			if (vPersonas.elementAt(i).getNombre().equalsIgnoreCase(nombre)){
				enc=true;
				p=vPersonas.elementAt(i);
				break;
			}	
		if (enc)
			System.out.println("La persona es : "+p.toString());
		return p;
	}

	public void listado() {
		for (int i=0; i<vPersonas.size(); i++)
			System.out.print(vPersonas.elementAt(i));
	}
	
	public void escribirObjeto(Object o){
		try {
			escritorDeObjetos = new ObjectOutputStream(new FileOutputStream("ListaDePersonas.dat"));
			escritorDeObjetos.writeObject(o);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("No encontrado archivo");
		} catch (IOException e) {
			System.out.println("IoExcep");
			e.printStackTrace();
		}
	}
	
	public void serializar (){
		escribirObjeto(vPersonas);
	}
	
	public void deserializar(){
		leerObjeto("ListaDePersonas.dat");
	}
	
	public void leerObjeto (String nombreArchivo){
		
		try {
			lectorDeObjetos = new ObjectInputStream(new FileInputStream(nombreArchivo));
			vPersonas = (Vector<Persona>) lectorDeObjetos.readObject();
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
			
		} catch (ClassNotFoundException e) {
			
			
		} 
		
		
	}
}
import java.io.*;
import java.util.Vector;
@SuppressWarnings("serial")
public class ListaLugar implements Acceso, Serializable {

	Vector <Lugar> vLugares; 
	private ObjectInputStream lectorDeObjetos;
	private ObjectOutputStream escritorDeObjetos;
	
	public ListaLugar() {
		vLugares= new Vector <Lugar>();
	}

	public void anadir(Object o) {	
		vLugares.add((Lugar)o);
	}

	public void borrar(Object o) {
		vLugares.removeElement((Lugar)o);
	}

	public Object buscar(String nombre) {
		boolean enc=false;
		Lugar l=null;
		for (int i=0; i<vLugares.size(); i++)
			if (vLugares.elementAt(i).getNombre().equals(nombre)){
				enc=true;
				l= vLugares.elementAt(i);
				break;
			}	
		if (enc)
			System.out.println("El lugar es : "+l.toString());	
		return l;
	}

	public void listado() {
		for (int i=0; i<vLugares.size(); i++)
			System.out.print(vLugares.elementAt(i));
	}
	
	
	
	public void escribirObjeto(Object o){
		@SuppressWarnings("unused")
		File f;
		try {
			escritorDeObjetos = new ObjectOutputStream(new FileOutputStream("ListaDeLugares.dat"));
			escritorDeObjetos.writeObject(o);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void leerObjeto (String nombreArchivo){
		Object retorno = null;
		try {
			lectorDeObjetos = new ObjectInputStream(new FileInputStream(nombreArchivo));
			vLugares = (Vector<Lugar>) lectorDeObjetos.readObject();
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
			
		} catch (ClassNotFoundException e) {
			
			
		}
		
		
	}
	
	
	
	public void serializar (){
		
		escribirObjeto(vLugares);
		
	}
	public void deserializar(){
		leerObjeto("ListaDeLugares.dat");
	}
}
import java.io.*;
import java.util.Vector;

@SuppressWarnings("serial")
public class ListaCitas implements Acceso, Serializable {

	Vector <Cita> vCitas;
	private ObjectInputStream lectorDeObjetos;
	private ObjectOutputStream escritorDeObjetos;
	
	public ListaCitas(){
		vCitas= new Vector <Cita>();
	}
	
	public void anadir(Object o) {
		vCitas.add((Cita) o);
	}
	
	public void borrar(Object o) {    
		vCitas.removeElement((Cita)o);
	}	

	public void buscarCita (String nombre) {
        
        Cita c= null;
        boolean encontrado=false;
        
        for (int i=0;  i<vCitas.size(); i++){
            if (vCitas.elementAt(i).getPersona().getNombre().equals(nombre)){
                c=vCitas.elementAt(i);
                encontrado=true;
                System.out.println(c.toString());
            }
        }
        if (!encontrado)
            System.out.println("Esta persona no tiene ninguna cita");
    }

	public void listado() {
		for (int i=0; i<vCitas.size(); i++)
			System.out.print(vCitas.elementAt(i));
	}
	
	public void listarCitas(){
		for (int i=0; i< vCitas.size(); i++)
			System.out.print(vCitas.elementAt(i));
	}
	
	public void escribirObjeto(Object o){
		try {
			escritorDeObjetos = new ObjectOutputStream(new FileOutputStream("ListaDeCitas.dat"));
			escritorDeObjetos.writeObject(o);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void leerObjeto (String nombreArchivo){
		try {
			lectorDeObjetos = new ObjectInputStream(new FileInputStream(nombreArchivo));
			vCitas = (Vector<Cita>) lectorDeObjetos.readObject();
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		} catch (ClassNotFoundException e) {
			
		}
	}
	
	public void serializar (){
		escribirObjeto(vCitas);
	}
	
	public void deserializar(){
		leerObjeto("ListaDeCitas.dat");
	}

	public boolean buscar1(Lugar l, Persona p, String fecha) {
         Cita c= null;
        boolean encontrado=false;
        
        for (int i=0; i<vCitas.size(); i++ )
            if (vCitas.elementAt(i).getPersona().getNombre().equalsIgnoreCase(p.getNombre()) && vCitas.elementAt(i).getLugar().getNombre().equalsIgnoreCase(l.getNombre()) && vCitas.elementAt(i).getFecha().equalsIgnoreCase(fecha)){
                c=vCitas.elementAt(i);
                encontrado=true;
                System.out.println(c.toString());  
                break;
            }
        if (!encontrado)
            System.out.println("Esta persona no tiene ninguna cita");
		return encontrado;
	}
	public Cita buscaCita2 (Lugar l, Persona p, String fecha){
		Cita c=null;
		boolean encontrado=false;
		for (int i=0; i<vCitas.size(); i++ )
        if (vCitas.elementAt(i)==c){
            c=vCitas.elementAt(i);
            encontrado=true;
            break;  
        }
    System.out.println(c.toString());
	return c;
	}

	public Object buscar(String nombre) {
		return null;
	}

	public Cita  buscar(Persona p, String fecha) {
		   Cita c= null;
	        boolean encontrado=false;
	        
	        for (int i=0; i<vCitas.size(); i++ ){
	            if (vCitas.elementAt(i).getPersona().getNombre().equalsIgnoreCase(p.getNombre()) &&  vCitas.elementAt(i).getFecha().equalsIgnoreCase(fecha)){
	                c=vCitas.elementAt(i);
	                encontrado=true;
	                
	                break;
	            }
	        }
	        //System.out.println(c.toString());
	        if (!encontrado){
	            System.out.println("Esta persona no tiene ninguna cita");
	        return null;
	        }
	     
	        else return c;
		}
		
	
}
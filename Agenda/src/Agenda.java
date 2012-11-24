import java.io.*;

@SuppressWarnings("serial")
public class Agenda implements Serializable {

	protected ListaLugar lugarAgenda = new ListaLugar();
	protected ListaPersona lPersona = new ListaPersona();
	protected ListaCitas lCitas = new ListaCitas();
	
	public Agenda() { 
		lugarAgenda= new ListaLugar();
		lPersona= new ListaPersona();
		lCitas= new ListaCitas();
	}

	/******************************************************************
	 * Este metodo llama a los metodos listado de las clases lista    *
	 * y saca por pantalla todos los datos de la agenda               *
    *******************************************************************/	
	public void listar (){   
		System.out.println("Lugares: ");
		lugarAgenda.listado();
		System.out.println("Personas: ");
		lPersona.listado();
		System.out.println("Citas: ");
		lCitas.listado();                    
	}
	
	/********************************************
	 * En este metodo lo que se hace es 		*
	 * aniadir una persona nueva en la agenda, 	*
	 * para ello evalua primero que esa persona *
	 * no este ya registrada                    *
	 ********************************************/	
	public void registrarLugar (){
		System.out.println("Como se llama el lugar?");
		String nombre = LeerTeclado.readString();
		Lugar l= (Lugar) lugarAgenda.buscar(nombre);
		
		if (l!=null){
			System.out.println("El lugar ya esta registrado");
			System.out.println(l.toString());
		}
		else{
		System.out.println("Donde esta?");
		String direccion = LeerTeclado.readString();
		System.out.println("Telefono de contacto");
		String telefono = LeerTeclado.readString();
		
		Lugar lu = new Lugar(nombre, direccion, telefono);
		lugarAgenda.anadir(lu);
		}
	}
	
	/********************************************
	 * Este metodo sirve para eliminar un 		*
	 * lugar, para ello busca el nombre del		*
	 * mismo en el vector						* 
	 ********************************************/
	public void eliminarLugar(){
		System.out.println("Nombre del lugar a eliminar");
		String lugar = LeerTeclado.readString();
		
		if (lugarAgenda.buscar(lugar) == null)
			System.out.println("El lugar que quiere eliminar no existe en la agenda");
		
		else {
			Lugar lu = (Lugar) lugarAgenda.buscar(lugar);
			System.out.println("Esta seguro? (S/N)");
			String resp=LeerTeclado.readString();
			if(resp.equalsIgnoreCase("s")){
			lugarAgenda.borrar(lu);
			}
		}
	}
	/******************************
	 * En este metodo se registra *
	 * una cita en la agenda	  *
	 * para ello evalua que no se *
	 * haya introducido antes     *
	 ******************************/
	public void registrarCita(){
		
		String nombreLugar="";
        Lugar l= new Lugar();
        String fecha;
        String hora;
       
        System.out.println("Vamos a registrar una cita.");
        System.out.println("Introduce el nombre de la persona.");    
        String nombrePersona =LeerTeclado.readString();
        Persona p=(Persona)lPersona.buscar(nombrePersona);
       
        if (p!=null){
            System.out.println("Esta es la persona de la cita");
            System.out.println(p.toString());
            System.out.println("Introduce el nombre el lugar.");    
            nombreLugar=LeerTeclado.readString();
            l=(Lugar)lugarAgenda.buscar(nombreLugar);
            System.out.println("Fecha: (DD/MM/YYYY)");
            fecha=LeerTeclado.readString();
            
            
            if (l!=null){
                System.out.println("Este es el lugar de la cita");
                System.out.println(l.toString());
                System.out.println("Introduce la fecha de la cita (DD/MM/YYYY)");
                fecha=LeerTeclado.readString();
                System.out.println("Introduce la hora de la cita (HH:MM)");
                hora=LeerTeclado.readString();
                

            
               
                if (lCitas.buscar1(l,p, fecha)==true){
                    System.out.println("Esa cita existe");
                  
                }
                else{
                	 Cita c= new Cita(fecha, hora, p, l);
                    lCitas.anadir(c);
                    System.out.println("La cita ha sido creada con exito.");
                    System.out.println(c.toString());
                }
            }else
                System.out.println("Ese lugar no existe. Cita no almacenada");
        }else
            System.out.println("Esa persona no existe. Cita no almacenada");
	}
	
	/********************************************
	 * Este metodo sirve para eliminar una 		*
	 * cita										* 
	 ********************************************/
	public void eliminarCita(){
		
		String nombreLugar="";
        Lugar l= null;
        
        System.out.println("Vamos a eliminar una cita.");
        
        System.out.println("Introduce el nombre de la persona.");    
        String nombrePersona =LeerTeclado.readString();
        Persona p=(Persona)lPersona.buscar(nombrePersona);
        if (p!=null){
            System.out.println("Esta es la persona de la cita");
            System.out.println(p.toString());
            System.out.println("Introduce el nombre del lugar");
            nombreLugar=LeerTeclado.readString();
            l=(Lugar)lugarAgenda.buscar(nombreLugar);
            System.out.println("Fecha:");
            String fecha=LeerTeclado.readString();
            
            if (l!=null){
                System.out.println("Este es el lugar de la cita");
                System.out.println(l.toString());
                Cita c=(Cita) lCitas.buscar(p, fecha);
                
                if (c!=null){
                    System.out.println(c.toString());
                    System.out.println("Estas seguro de borrar la cita definitivamente?");
                    System.out.println("1.-Si, deseo borrarla.");
                    System.out.println("2.-No, no quiero borrarla.");
                    int op5=LeerTeclado.readInteger();
                    switch (op5){ 
                    case 1:
                        lCitas.borrar(c);
                        System.out.println("La cita ha sido eliminada.");
                        break;
                    
                    case 2:
                        System.out.println("La cita no ha sido eliminada.");
                        break;
                    
                    default:
                        System.out.println("Salir");
                        break;
                    }
                
                }else
                	System.out.println("Esta cita no existe.No se puede eliminar");
                
            }
            else
            	System.out.println("Ese lugar no existe. Cita no almacenada");
                
        }else
        	System.out.println("Esa persona no existe. Cita no almacenada");
	}
	
	/******************************
	 * En este metodo se registra *
	 * una persona en la agenda	  *
	 * para ello evalua que no se *
	 * haya introducido antes     *
	 ******************************/
	public void registrarPersona(){
		System.out.println("Como se llama la persona?");
		String nombre = LeerTeclado.readString();
		Persona p = (Persona) lPersona.buscar(nombre);
		
		if (p!=null)
			System.out.println("La persona ya esta registrada");
		else{
			System.out.println("Mail de contacto");
			String direccion = LeerTeclado.readString();
			
			System.out.println("Que tipo de contacto es? 1.Amistad 2.Contacto de empresa");
			int op = LeerTeclado.readInteger();
			
			switch(op) {
			
			case 1:	System.out.println("Direccion");
					String calle = LeerTeclado.readString();
					System.out.println("Telefono de contacto");
					String telefono = LeerTeclado.readString();
					p = new Amistad(nombre, direccion, calle, telefono);
					lPersona.anadir(p);
					break;
			
			case 2: System.out.println("Nombre de la empresa");
					String nombreEmpresa = LeerTeclado.readString();
					System.out.println("Otra informacion que pueda ser de interes");
					String informacion = LeerTeclado.readString();
					p = new ContactoEmpresa(nombre, direccion, nombreEmpresa, informacion);
					lPersona.anadir(p); 
					break;
			}
		}
	}
	
	public void eliminarPersona(){
		System.out.println("Nombre de la persona que quiere eliminar de la agenda");
		String nombre = LeerTeclado.readString();
		Persona p=(Persona) lPersona.buscar(nombre);
		if ( p== null)
			System.out.println("Esa persona no esta registrada en la agenda");
		else {
			if(p instanceof Amistad)
				System.out.println("Una amistad no se puede eliminar");
			else {
				
				System.out.println("Esta seguro? (S/N)");
				String resp=LeerTeclado.readString();
				if(resp.equalsIgnoreCase("s"))
					lPersona.borrar(p);
			}
		}
	}
	
	public void consultarLugar(){
		System.out.println("Cual es el lugar que quiere consultar?");
		String lugar = LeerTeclado.readString();
		if (lugarAgenda.buscar(lugar) == null) {
			System.out.println("Ese lugar no esta registrado");
		} else {
			Lugar lu = (Lugar) lugarAgenda.buscar(lugar);
			lu.toString();
		}
	}
	
	public void consultarCita() {
		System.out.println("Persona:");
		String nombre=LeerTeclado.readString();
		Persona p = (Persona) lPersona.buscar(nombre);
		
		System.out.println("Cual es la fecha de la cita?");
		String fecha = LeerTeclado.readString();
		
		if (lCitas.buscar(p, fecha) == null)
			System.out.println("No hay citas para esa fecha en la agenda");
		else {
			Cita c = lCitas.buscar(p , fecha);
			System.out.println(c.toString());
		}	
		
	}
	
	public void consultarPersona(){
		System.out.println("Nombre de la persona");
		String nombre = LeerTeclado.readString();
		if (lPersona.buscar(nombre) == null)
			System.out.println("La persona que esta buscando no esta registrada en la agenda");
		else{	
			Persona p1 = (Persona) lPersona.buscar(nombre);
			p1.toString();
		}
	}
	
	public void serializar(){
		lugarAgenda.serializar();
		lCitas.serializar();
		lPersona.serializar();
	}
	
	public void deserializar(){
		lugarAgenda.deserializar();
		lCitas.deserializar();
		lPersona.deserializar();
	}
}
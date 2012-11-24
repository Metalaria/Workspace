package Interfaces.empleadosAbstractos;

import Interfaces.ejercicioInterfazOrdenable.Ordenable;

public abstract class Empleados implements Ordenable 

{
    
    protected String nombreEmpleado;
    protected String dni;
   
    protected int telefono;
    
    public Empleados (String nombreEmpleado, String dni,int telefono)
    {
        this.nombreEmpleado=nombreEmpleado;
        this.dni=dni;
        
        this.telefono=telefono;
    }
    
    public Empleados()
    {
    }
    
    public void setNombre (String nombreEmpleado)
    {this.nombreEmpleado=nombreEmpleado;
    }
    
     public void setDni(String dni)
    {this.dni=dni;
    }
    
   
    
     public void setTelefono (int telefono)
    {this.telefono=telefono;
    }
    
    public String getNombre ()
    { return nombreEmpleado;
    }
    
    public String getDni()
    { return dni;
    }
    
   
    
    public int getTelefono()
    { return telefono;
    }
    
    public abstract int consultarSalario();

	@Override
	public String toString() {
		return "nombreEmpleado=" + nombreEmpleado + ", dni=" + dni
				 + ", telefono=" + telefono ;
	}
   
	public boolean esMayor(Ordenable o){
		boolean mayor=false;
		if (o == null)
			mayor=true;
			else if (!(o instanceof Empleados))
				mayor=true;
			else if (this.consultarSalario()>((Empleados)o).consultarSalario())
				mayor=true;

		return mayor;
    		
    }
    
	public boolean esMenor(Ordenable o){
		boolean menor=false;
		if (o == null)
			menor=true;
			else if (!(o instanceof Empleados))
				menor=true;
			else if (this.consultarSalario()<((Empleados)o).consultarSalario())
				menor=true;

		return menor;
    		
    }
    
}


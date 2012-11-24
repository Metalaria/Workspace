package Interfaces.empleadosAbstractos;



public class EmpleadosFijos extends Empleados 
{
    private int salarioMes;
   
    public EmpleadosFijos (String nombreEmpleado, String dni, int telefono, int salarioMes)
    {
       super (nombreEmpleado, dni, telefono);
       this.salarioMes=salarioMes;
    }

    
    public int consultarSalario()
    {  return salarioMes;
    }
    
    public String toString(){
    	return super.toString()+" salario mensual= "+salarioMes;
    }
    
 
}
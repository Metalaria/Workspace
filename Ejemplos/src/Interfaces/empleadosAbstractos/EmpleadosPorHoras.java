package Interfaces.empleadosAbstractos;


/**
 * Write a description of class EmpleadosPorHoras here.
 * 
 * @author (your name) 
 * @version (a version number or a GregorianCalendar)
 */

public class EmpleadosPorHoras extends Empleados
{
    private int numHoras;
    private int salarioHora;

    public EmpleadosPorHoras(String nombreEmpleado, String dni, int telefono, int numHoras, int salarioHora)
    {
       super (nombreEmpleado, dni, telefono);
       this.numHoras=numHoras;
       this.salarioHora=salarioHora;
    }

   public int consultarSalario()
    {  return  numHoras*salarioHora;
    }
   
   public String toString(){
   	return super.toString()+" salario por horas= "+consultarSalario();
   }
}

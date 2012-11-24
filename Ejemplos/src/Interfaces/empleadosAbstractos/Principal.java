package Interfaces.empleadosAbstractos;

 
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a GregorianCalendar)
 */


public class Principal

{

   public static  void main (String arg[])
{
  
    
    System.out.println ("Introduzca número de empleados");
    int tamaño=LeerTeclado.readInteger();
    //tamaño del array de empleados
    Empleados[] personal= new Empleados [tamaño];
    int i;
 
    Empleados emp;
    
    for (i=0; i<tamaño;i++)
	    {   System.out.println("Alta del empleado ");	
	    	            
            System.out.println ("Introduzca nombre");
            String nombreEmpleado=LeerTeclado.readString();
            System.out.println ("Introduzca dni");
            String dni=LeerTeclado.readString();
            System.out.println ("Introduzca telefono");
            int telefono=LeerTeclado.readInteger();
            System.out.println ("Introduzca tipo de empleado: Fijo o Por Horas (F,H)");
            String tipoEmp=LeerTeclado.readString();
           
            if (tipoEmp.equalsIgnoreCase("f"))
               {   System.out.println ("Introduzca Salario Mensual");
                   int salarioMes=LeerTeclado.readInteger();
                   emp=new EmpleadosFijos (nombreEmpleado,dni,telefono,salarioMes);
                                     
                }
                   
                   else //if tipoEmp.isEqual("H"))
                   {    System.out.println ("Introduzca horas trabajadas");
                        int numHoras=LeerTeclado.readInteger();
                        System.out.println ("Introduzca salario por hora");
                        int salarioHora=LeerTeclado.readInteger();
                        emp=new EmpleadosPorHoras (nombreEmpleado,dni,telefono,numHoras,salarioHora);
                        
                    }
               
               personal[i]=emp;     
     }     
        
    System.out.println("Listado de empleados");
    System.out.println();
    
    for (i=0; i<tamaño; i++)
    {
    	System.out.println("Datos del empleado");
    	System.out.println(personal[i].toString());
    }  
    
    
}
}
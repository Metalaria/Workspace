package Interfaces.ejercicioInterfazOrdenable;

import Interfaces.empleadosAbstractos.Empleados;
import Interfaces.empleadosAbstractos.EmpleadosFijos;
import Interfaces.empleadosAbstractos.EmpleadosPorHoras;


public class Principal

{

   public static  void main (String arg[])
{
    //Se crean dos objetos de tipo fecha para usarlos como fecha de nacimiento y de contratacion de los empledaos
      /*  Date f1=new Date(1956,10,12);
        Date f2=new Date(1976,8,5);*/
        
    /*Empleados emp0=new EmpleadosFijos ("Pepe", "11111111", f1, f2, 91111111, 3000);
    Empleados emp1=new EmpleadosFijos ("Juan", "22222222", f1, f2, 91111112, 4000);
    Empleados emp2=new EmpleadosFijos ("Javier", "3333333", f1, f2, 91111113, 5000);
    Empleados emp3=new EmpleadosFijos ("Ana", "44444444", f1, f2, 91111114, 2000);
    Empleados emp4=new EmpleadosFijos ("Alicia", "77777777", f1, f2, 91111112, 6000);*/
    
    Empleados e1=new EmpleadosFijos ("Pepe", "11111111",  91111111, 3000);
    Empleados e2=new EmpleadosPorHoras ("Juan", "22222222",  91111112, 200, 6);
    Empleados e3=new EmpleadosFijos ("Javier", "3333333",  91111113, 5000);
    Empleados e4=new EmpleadosPorHoras ("Ana", "44444444",  91111114, 100, 7);
    Empleados e5=new EmpleadosFijos ("Alicia", "77777777", 91111112, 6000);
  // Array de 5 empleados
    System.out.println ("_________________Empleados___________");
     
    Ordenable[] personal={ (Ordenable) e1,(Ordenable) e2,(Ordenable) e3,(Ordenable) e4,(Ordenable) e5};
    
    System.out.println ("array desordenado ");
    System.out.println ("__________________");
    int i;
    
    for (i=0; i<personal.length; i++)
    {
       System.out.println ("Nombre "+ ((Empleados)personal[i]).getNombre());
       System.out.println ("Salario "+((Empleados)personal[i]).consultarSalario());
       System.out.println();
       System.out.println(personal[i].toString());
    }
    
   
    Algoritmos.ordenar(personal);
    System.out.println ("__________________");
    System.out.println ("array ordenado");
    
    for (i=0; i<personal.length; i++)
    {
       System.out.println ("Nombre "+ ((Empleados)personal[i]).getNombre());
       System.out.println ("Salario "+((Empleados)personal[i]).consultarSalario());
       System.out.println();
       System.out.println(personal[i].toString());
    }
    
    System.out.println ("__________________");
    System.out.println ("Maximo");
 
    Ordenable aux=Algoritmos.maximo(personal);
    System.out.println ("Nombre "+ ((Empleados)aux).getNombre());
    System.out.println ("Salario "+((Empleados)aux).consultarSalario());
    
    System.out.println ("__________________");
    System.out.println ("Minimo");
 
    aux=Algoritmos.minimo(personal);
    System.out.println ("Nombre "+ ((Empleados)aux).getNombre());
    System.out.println ("Salario "+((Empleados)aux).consultarSalario());
    
    // Se crean los rectángulos y el array
    
   /* System.out.println ("_________________Rectángulos___________");
     
    Rectangulo R0=new Rectangulo (4,5);
    Rectangulo R1=new Rectangulo (3,4);
    Rectangulo R2=new Rectangulo (2,5);
    Rectangulo R3=new Rectangulo (9,6);
    Rectangulo R4=new Rectangulo (8,5); 
  
    Ordenable[] rect=new Ordenable[5];
    rect [0]=(Rectangulo)R0;
    rect [1]=(Rectangulo)R1;
    rect [2]=(Rectangulo)R2;
    rect [3]=(Rectangulo)R3;
    rect [4]=(Rectangulo)R4;
    
    
    System.out.println ("array desordenado ");
    System.out.println ("__________________");
   
    
    for (i=0; i<5; i++)
    {
       
       System.out.println ("Area "+ ((Rectangulo)rect[i]).area());
     //  System.out.println ("Perimetro "+((Rectangulo)personal[i]).perimetro());
    }
    
   
    Algoritmos.ordenar(rect);
    
    System.out.println ("__________________");
    System.out.println ("array ordenado");
    for (i=0; i<5; i++)
    {
       
       System.out.println ("Area "+ ((Rectangulo)rect[i]).area());
    }
    
    System.out.println ("__________________");
    System.out.println ("Maximo");
    aux=Algoritmos.maximo(rect);
    System.out.println ("Area "+ ((Rectangulo)aux).area());
    
    System.out.println ("__________________");
    System.out.println ("Minimo");
 
    aux=Algoritmos.minimo(rect);
   System.out.println ("Area "+ ((Rectangulo)aux).area());
   */
}
}
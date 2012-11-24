package ficheros;

import java.io.*;
/**
 * Ejercicio_UT2_15
 *
 * Definicion de la clase ContarLineasMej
 *   
 * @author (Alvaro) 
 * @version (1.0)
 */
public class ContarLineasMej
{
    public static void main (String args[]) 
    {  
        FileReader in=null;
        BufferedReader bin=null;
        int numeroLineas=0;
        File f=new File(args[0]);
        
        try
        {
           if (args.length==0)
                throw new ExcepcionArgumentos();
           else
           {
                              
                in=new FileReader(f);
                bin= new BufferedReader(in);

                while (bin.readLine()!=null)
                    numeroLineas++;
                
                System.out.println ("Elnumero de lineas del  fichero \""+f.getAbsolutePath()+"\"es: "+numeroLineas);           
           }
            
         }
         catch (ExcepcionArgumentos e)
         { 
             System.out.println("Hay que pasar el nombre del fichero como parametros");
             System.out.println (e); 
         }
         catch (FileNotFoundException e)
         { 
             
             System.out.println (e +".\nEl fichero \""+f.getAbsolutePath()+"\" no existe");           
         }
         catch (IOException e)
         { 
             System.out.println (e);           
         }
         finally
         {
            try
            {
                if ((in!=null) )
                {
                    in.close();
                }
            }
            catch(IOException e)
            {
                System.out.println (e+". Error al cerrar el stream");
            }
          } 
    }
    
    
}
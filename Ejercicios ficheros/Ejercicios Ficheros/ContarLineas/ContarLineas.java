package ficheros;

import java.io.*;

public class ContarLineas
{
    public static void main (String args[]) 
    {  
        FileReader in=null;
        int numeroLineas=0;
        File f=new File(args[0]);
        
        try
        {
           if (args.length==0)
                throw new ExcepcionArgumentos();
           else
           {
                              
                in=new FileReader(f);
                int b=in.read();
                while (b!=-1)
                {
                    if (b=='\n')
                        numeroLineas++;
                    b=in.read();
                }
                  System.out.println ("El numero de lineas del  fichero \""+f.getAbsolutePath()+"\"es: "+numeroLineas);           
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
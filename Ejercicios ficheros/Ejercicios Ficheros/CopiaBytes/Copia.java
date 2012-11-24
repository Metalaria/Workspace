package ficheros;

import java.io.*;

public class Copia
{
    public static void main (String args[])
    {  
        FileInputStream in=null;
        FileOutputStream out=null;
        
        try
        {
            if (args.length!=2)
            {
                throw new ExcepcionArgumentos();
            }
            else
            {
                in=new FileInputStream (args[0]);
                out=new FileOutputStream (args[1]);
                int b=in.read();
                while (b!=-1)
                {
                    out.write(b);
                    b=in.read();
                }
            }
         }
         catch (ExcepcionArgumentos e)
         { 
            System.out.println (e); 
            System.out.println ("El programa tiene que recibir el nombre de dos ficheros Ej: Copia f1 f2");           
         }
         catch (FileNotFoundException e)
         { 
             File f=new File(args[0]);
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
                if ((in!=null) && (out!=null))
                {
                    in.close();
                    out.close();
                }
            }
            catch(IOException e)
            {
                System.out.println (e+". Error al cerrar los stream");
            }
          } 
           
        }
        
}
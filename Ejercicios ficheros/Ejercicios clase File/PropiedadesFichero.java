package claseFile;

import java.io.*;
import java.util.*;

public class PropiedadesFichero
{
    public static void main (String args[]) throws ExcepcionArgumentos 
    {
    	try{
    		if (args.length==0)//si no tiene argumentos
                throw new ExcepcionArgumentos("El programa no tiene argumentos"); //crea una nueva excepcion de tipo ExcepcionArgumentos
             else
            {  
               try
               {   for (int i=0;i<args.length;i++) {                   
                       propiedades (args[i]);//el args[i] indica cada uno de los argumentos del programa
                       System.out.println("----------------------------");
                    }
               }
               catch(ExcepcionFicheroNoExiste e){ //si el fichero no existe recoge la excepción lanzada por el método
               		System.out.println (e);
               }
            } 
    	}
    	catch (ExcepcionArgumentos e){
    		System.out.println(e);
    	}
            
    }
    
    public static void propiedades (String nomFich) throws ExcepcionFicheroNoExiste 
    //lanza la excepcion para que el programa que invocó al método la trate
    {
        
        File f=new File (nomFich);
        //Si el fichero existe
        if (f.exists())
        {
            if (f.isFile())//Si es un fichero ordinario
                System.out.println ("Nombre: "+f.getName()+"\nEs un fichero");
            else
                System.out.println ("Nombre: "+f.getName()+"\nEs un directorio");
            
 
            System.out.println("\nCamino absoluto: "+f.getAbsolutePath()+
                                "\nCamino relativo: "+f.getPath()+
                                "\nPuede leerse: "+f.canRead()+
                                "\nPuede modificarse: "+f.canWrite()+
                                "\nLongitud: "+f.length()+
                                "\nFecha de ultima modificacion: "+new Date(f.lastModified()));
           
            if (f.isDirectory())
            {
                String [] lista=f.list(); //guarda en un array los nombres de los ficheros del directorio
                System.out.println ("Los ficheros de este directorio son:");
                for (int i=0;i<lista.length;i++)
                {                           
                    System.out.println (lista[i]);
                }
            }
        }
        else
            throw new ExcepcionFicheroNoExiste("El fichero o directorio "+nomFich+" no existe"); 
    }
                        
}

package ficheros;

import java.io.*;
public class EscribirFichero
{
	public static void main (String args[]) 
	{  
		FileOutputStream fos=null;
		FileWriter out=null;

		File file=null;
		String nombre=null;
		int op=0;
		String texto=null;
		boolean añadir=false;

		try
		{
			System.out.println("Introduce nombre de fichero:");
			nombre=LeerTeclado.readString();
			file=new File(nombre);

			System.out.println("\nIntroduzca el texto a escribir en el fichero:");
			texto=LeerTeclado.readString();

			if (file.exists())
			{
				System.out.println("\nEl fichero \""+ file.getAbsolutePath()+"\" ya existe");
				System.out.println("Selecione una opcion (1:sobrescribir, 2:escribir al final)");
				op=LeerTeclado.readInteger();
				if (op==1)
					añadir=false;
				else
					añadir=true;
			}

			//Si añadir es igual a true añade al final, si es igual a false sobreescribe

			fos=new FileOutputStream(nombre, añadir);
			out=new FileWriter(nombre,añadir);

			//Escritura en el fichero
			for (int i=0;i<texto.length();i++){
				fos.write((byte)texto.charAt(i));
				out.write(texto.charAt(i)); //tambien:  out.write(texto);
			}



			System.out.println("\nEl texto se ha escrito correctamente en ambos fichero:");

			//cerramos los ficheros de escritura
			try
			{
				out.close();                
				fos.close();

			}
			catch(IOException e)
			{
				System.out.println (e+". Error al cerrar los  ficheros");
			}

			//abrimos los ficheros de lectura

			System.out.println("Procedemos a leer ambos ficheros ");
			FileInputStream fis=new FileInputStream(file);

			System.out.println("El tamaño del fichero FileInputStream es "+fis.available());

			int size=fis.available();
			String salida="";
			for(int i=0; i<size; i++){
				salida+=(char)fis.read();
			}

			System.out.println("El texto completo es "+salida);

			try {
				if ((fis!=null) )
				{
					fis.close();
				}
			}
			catch(IOException e)
			{
				System.out.println (e+". Error al cerrar el file writer");
			}

			//volvemos a abrir el fichero para posicionar de nuevo el 
			fis=new FileInputStream(file);

			size=fis.available();
			salida="";
			for(int i=0; i<size&&i<10; i++){
				salida+=(char)fis.read();
			}

			System.out.println("Los diez primeros caracteres son "+salida);

			//leemos el fichero FileReader
			FileReader in=new FileReader (file);
			salida="";
			char eof=(char)(-1);
			char c=(char)in.read();
			while (c!=eof){
				salida+=c;
				c=(char)in.read();
			}
			System.out.println("La cadena en mayusculas es "+salida.toUpperCase());
			try
			{

				fis.close();

				in.close();

			}
			catch(IOException e)
			{
				System.out.println (e+". Error al cerrar el file output stream");
			}


			//fin del try principal

		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}

    

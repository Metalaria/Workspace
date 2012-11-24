package ficheros;
import java.io.*;

import arrays.LeerTeclado;
public class FusionArticulos {	
	public static void main (String args[]){
		System.out.println("Se procede a crear el fichero Articulo1.dat");
		System.out.println("Se van a dar de alta varios productos que se guardarán en el fichero Articulo1.dat");
		String fichero="Articulo1.dat";
		File f1=new File(fichero);
		PrintWriter pw=abrirFicheroGrabar(f1);
		if (pw!=null){
			grabarRegistros(pw);
		}
		System.out.println("Se procede a leer el fichero completo Articulo1.dat");
		BufferedReader br1=abrirFicheroLeer(f1);
		leerRegistros(br1);
		
		System.out.println();
		System.out.println();
		System.out.println("Se procede a crear el fichero Articulo2.dat");
		System.out.println("Se van a dar de alta varios productos que se guardarán en el fichero Articulo2.dat");
		String fichero2="Articulo2.dat";
		File f2=new File(fichero2);
		pw=abrirFicheroGrabar(f2);
		if (pw!=null){
			grabarRegistros(pw);
		}
		System.out.println("Se procede a leer el fichero completo Articulo2.dat");
		BufferedReader br2=abrirFicheroLeer(f2);
		leerRegistros(br2);
		
		System.out.println();
		System.out.println();
		System.out.println("Se procede a crear el fichero FusionArticulos.dat");
		
		String fichero3="FusionArticulos.dat";
		File f3=new File(fichero3);
		pw=abrirFicheroGrabar(f3);
		br1=abrirFicheroLeer(f1);
		br2=abrirFicheroLeer(f2);
		compararCodigos(br1, br2, pw);
		
		System.out.println();
		System.out.println("Se procede a leer el fichero completo FusionArticulos.dat");
		BufferedReader br3=abrirFicheroLeer(f3);
		leerRegistros(br3);
	}  
	@SuppressWarnings("finally")
	public static PrintWriter abrirFicheroGrabar(File f){
		BufferedWriter bw=null;	PrintWriter salida=null;
		try{
			if (!f.exists()){		
				System.out.println("El fichero "+f.getName()+" no existe y se procede a su creación");	
				bw=new BufferedWriter(new FileWriter(f));
			}
			else {
				System.out.println("El fichero "+f.getName()+" ya existe y los nuevos registros se añadirán al final");
				bw=new BufferedWriter(new FileWriter(f, true));
			}
			salida=new PrintWriter(bw);
		}
		catch (IOException e) {
			System.out.println("Error al crear el fichero");
		}
		finally{
			return salida;
		}
	}
	
	@SuppressWarnings("finally")
	public static BufferedReader abrirFicheroLeer (File f){
		BufferedReader br=null;
		try{
			br=new BufferedReader(new FileReader (f));
		}
		catch(IOException e){
			System.out.println("Error al abrir el fichero "+f.getName()+" para leer");	
		}
		finally{
			return br;
		}
	}
	public static void grabarRegistros(PrintWriter pw){
		//bucle que da de alta varios productos y los almacena en el fichero con toString()
		int codigo;
		String nombre;
		float precio;
		Articulo articulo;
		System.out.println("Introduzca el código del artículo a dar de alta o 0 para terminar");
		codigo=LeerTeclado.readInteger();
		
		while (codigo!=0){
			System.out.println("Introduzca nombre y precio");
			nombre=LeerTeclado.readString();
			precio=LeerTeclado.readFloat();
			
			articulo=new Articulo(codigo, nombre, precio);
			pw.println(articulo.toString());
			//se guarda todo el objeto como un String con el método toString() separando cada campo con ; según se especifó en dicho método
			System.out.println("Se ha guardado el articulo en el fichero");			
			System.out.println("Introduzca el código del artículo a dar de alta o 0 para terminar");
			codigo=LeerTeclado.readInteger();
		}//después del bucle cerramos el fichero	
		try{
			if (pw!=null)
			pw.close();
		}
		catch (Exception e){
			System.out.println("Error al cerrar el fichero después de grabar");
		}		
	}
	
	public static void compararCodigos(BufferedReader br1, BufferedReader br2, PrintWriter pw){
		//leemos cada linea grabada en el fichero. Cada linea es un objeto Producto cuyos campos se separan con ;
	try{
		int codigo1, codigo2;
		String  nombre1, nombre2;
		float precio1, precio2;
		Articulo articulo1, articulo2;
		String linea1=br1.readLine();
		String linea2=br2.readLine();
		while (linea1!=null && linea2!=null){ //mientras los dos ficheros tengan registros
			//busco dentro de la línea leida el caracter separador ;
			String[] contenidoLinea1 = linea1.split(":");
			codigo1=Integer.parseInt(contenidoLinea1[0]);
			nombre1=contenidoLinea1[1];//guarda en la variable nombre la primera componente del array contenidoLinea
			precio1=Float.parseFloat(contenidoLinea1[2]);
			
			//creo el objeto Articulo1
			articulo1=new Articulo (codigo1, nombre1, precio1);
			//System.out.println("Se ha leido del articulo1");
			//articulo1.verArticulo();
			String[] contenidoLinea2 = linea2.split(":");
			codigo2=Integer.parseInt(contenidoLinea2[0]);
			nombre2=contenidoLinea2[1];//guarda en la variable nombre la primera componente del array contenidoLinea
			precio2=Float.parseFloat(contenidoLinea2[2]);
			
			//creo el objeto Articulo2
			articulo2=new Articulo (codigo2, nombre2, precio2);
			// comparamos códigos
			//System.out.println("Se ha leido del articulo2");
			//articulo2.verArticulo();
			if (codigo1<=codigo2){ //grabamos el articulo1 en el fichero de salida
				pw.println(articulo1.toString());
				linea1=br1.readLine();
			}
			
			else {
				pw.println(articulo2.toString());
				linea2=br2.readLine();
			}		
		}
		
		while (linea1!=null){ //Si se ha acabado el fichero Articulos2 y no Articulo1
			String[] contenidoLinea1 = linea1.split(":");
			codigo1=Integer.parseInt(contenidoLinea1[0]);
			nombre1=contenidoLinea1[1];//guarda en la variable nombre la primera componente del array contenidoLinea
			precio1=Float.parseFloat(contenidoLinea1[2]);
			
			//creo el objeto Articulo1
			articulo1=new Articulo (codigo1, nombre1, precio1);
			pw.println(articulo1.toString());
			linea1=br1.readLine();
		}
		
		while (linea2!=null){ //Si se ha acabado el fichero Articulo1 y no Articulo2
			String[] contenidoLinea2 = linea2.split(":");
			codigo2=Integer.parseInt(contenidoLinea2[0]);
			nombre2=contenidoLinea2[1];//guarda en la variable nombre la primera componente del array contenidoLinea
			precio2=Float.parseFloat(contenidoLinea2[2]);
			
			//creo el objeto Articulo2
			articulo2=new Articulo (codigo2, nombre2, precio2);
			pw.println(articulo2.toString());
			linea2=br2.readLine();
		}
		
	}
	catch (IOException e){
		System.out.println("Error al leer del fichero");
		e.printStackTrace();
	}
	finally{
		try{ 
			if (br1!=null && br2!=null)
			br1.close();
			br2.close();
		}
		catch (Exception e){
			System.out.println("Error al cerrar los ficheros después de leer");
		}
		try {
			if (pw!=null)
				pw.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	}
	
	public static void leerRegistros(BufferedReader br){
		//leemos cada linea grabada en el fichero. Cada linea es un objeto Producto cuyos campos se separan con ;
	try{
		int codigo;
		String  nombre;
		float precio;
		Articulo articulo;
		String linea=br.readLine();
		while (linea!=null){
			//busco dentro de la línea leida el caracter separador ;
			String[] contenidoLinea = linea.split(":");
			codigo=Integer.parseInt(contenidoLinea[0]);
			nombre=contenidoLinea[1];//guarda en la variable nombre la primera componente del array contenidoLinea
			precio=Float.parseFloat(contenidoLinea[2]);
			
			//creo el objeto Producto
			articulo=new Articulo (codigo, nombre, precio);
			//invoca al método verProducto()
			articulo.verArticulo();
			//seguimos leyendo el siguiente producto del fichero
			linea=br.readLine();
		}
	}
	catch (IOException e){
		System.out.println("Error al leer del fichero");
	}
	finally{
		try{ 
			if (br!=null)
			br.close();
		}
		catch (Exception e){
			System.out.println("Error al cerrar el fichero después de leer");
		}
	}
	}
}

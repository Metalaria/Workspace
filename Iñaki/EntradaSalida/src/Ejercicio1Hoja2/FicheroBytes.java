package Ejercicio1Hoja2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FicheroBytes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduca texto a gravar.");
		String texto=LeerTeclado.readString();
		System.out.println("Introduca nombre del fichero.");
		String nombre=LeerTeclado.readString();
		
		File f=new File(nombre);//declara una clase file para comprovar la existencia del archivo
		if(f.exists()==false){//Si no existe lo muestra por pantalla y crea el archivo
			System.out.println("El fichero no existe");
				reescribir(f, texto);
		}
		else{//Si existe muestra menu con opciones de reescribir o añadir.
			System.out.println("1.- Reescribir el fichero " +
					"\n2.- Añadir el texto al final del fichero");
			int menu=LeerTeclado.readInteger();
				switch (menu) {
				case 1:reescribir(f,texto);
				break;
				case 2: añadir(f,texto);
				break;
				default:
				}
		}
			
	}
	public static void reescribir(File f,String texto){
		char c;
		FileOutputStream s =null;
		try{
			s =new FileOutputStream(f);//Crea el nuevo fichero eliminando lo que halla creado
			for(int i=0;i<texto.length();i++){
				c=texto.charAt(i);
				s.write(c);
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		finally{
			try {
				if(s!=null) s.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
	public static void añadir(File f,String texto){
		char c;
		FileOutputStream s =null;
		try{
			s =new FileOutputStream(f,true);//Abre el archvo creado para introducir datos acontinuacion de lo que existen
			for(int i=0;i<texto.length();i++){
				c=texto.charAt(i);
				s.write(c);
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		finally{
			try {
				if(s!=null) s.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
	public static void mostar(File f){
		String cad="";
		char c;
		FileInputStream s =null;
		try {
			s = new FileInputStream(f);
			char eof =(char)(-1);
			c=(char) s.read();
			while(c!=eof){
				cad=cad+c;
				c=(char) s.read();
			}
			System.out.println("Texto Completo:" +
					"\n"+cad);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally{
			try {
				if(s!=null) s.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}

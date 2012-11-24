package ejercicio2;

import java.io.*;


import ejercicio1.LeerTeclado;

public class PrincipalEjer2 {

	
	public static void main(String[] args) {
		
		try{
			DataOutputStream dos=new DataOutputStream (new BufferedOutputStream (new FileOutputStream ("FichPeliculas.dat")));
			int codigo;
			String titulo;
			double precio;
			boolean prestada;
			int prest;
			
			Pelicula pelicula;
			System.out.println("Introduce el codigo a dar de alta (0 fin)");
			codigo= LeerTeclado.readInteger();
			
			while (codigo!=0){
				
				System.out.println("Introduce el titulo");
				titulo = LeerTeclado.readString();
				
				System.out.println("Introduce el precio");
				precio=LeerTeclado.readDouble();
				
				System.out.println("Introduce si esta prestada (0) o no (1)");
				prest=LeerTeclado.readInteger();
				if (prest==0)
					prestada=true;
				else
					prestada=false;
				pelicula=new Pelicula(codigo,titulo,prestada, precio);
				pelicula.grabar(dos);
				System.out.println("Introduce el codigo a dar de alta (0 fin)");
				codigo= LeerTeclado.readInteger();
			}
				
				dos.close();
				
				
				
					DataInputStream dis=new DataInputStream(new BufferedInputStream(new FileInputStream("FichPeliculas.dat")));
					System.out.println("Peliculas prestadas");
					int alquilerTotal=0;
					//pelicula=null;
					while(dis.available()>0){
						pelicula=Pelicula.leer(dis);
						if (pelicula.estaPrestada()==true){
							System.out.println(pelicula.toString());
							alquilerTotal+=pelicula.getPrecio();
							
						}
					}
					System.out.println("Importe total de alquileres "+alquilerTotal);
					
					dis.close();
							
					
			}
				catch (IOException e){
					e.printStackTrace();
				}
			}
		
	
		

	}


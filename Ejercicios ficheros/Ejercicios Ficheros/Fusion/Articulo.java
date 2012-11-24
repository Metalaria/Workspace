package ficheros;

public class Articulo {
		private int codigo;
		private String nombre;
		private float precio;
		
		
		public Articulo(int codigo, String nombre, float precio){
					
			this.codigo=codigo;
			this.nombre= nombre;
			this.precio=precio;
			
		}
		
		public String toString(){
			//m�todo para grabar el objeto, separando cada atributo con ;
			return codigo+":"+nombre+":"+precio;
		}
		
		public void verArticulo(){ //m�todo para imprimir el objeto
			String salida;
			salida="Datos del producto"+"\n";
			salida+="C�digo: "+codigo+"\n";
			salida+="Nombre: "+nombre+"\n";
			salida+="Precio: "+precio+"\n";
			System.out.println(salida);
		}
	}



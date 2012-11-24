package ejercicio1;

public class Animal {
	
		String nombreComun;
		 String nombreSpec;
		 double peso;
		 double tamanno;
		public Animal(String nombreComun, String nombreSpec, int peso, int tamanno) {
			this.nombreComun = nombreComun;
			this.nombreSpec = nombreSpec;
			this.peso = peso;
			this.tamanno = tamanno;
		}
		public Animal() {
		}
		public String getNombreComun() {
			return nombreComun;
		}
		public void setNombreComun(String nombreComun) {
			this.nombreComun = nombreComun;
		}
		public String getNombreSpec() {
			return nombreSpec;
		}
		public void setNombreSpec(String nombreSpec) {
			this.nombreSpec = nombreSpec;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(int peso) {
			this.peso = peso;
		}
		public double getTamanno() {
			return tamanno;
		}
		public void setTamanno(int tamanno) {
			this.tamanno = tamanno;
		}
		
		public String toString() {
			return "Animal [nombreComun=" + nombreComun + ", nombreSpec="
					+ nombreSpec + ", peso=" + peso + ", tamanno=" + tamanno + "]";
		}
	

}

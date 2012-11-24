package Empleados;

public abstract class Empleado {
	
		private String nombre;
		private String dni;
		private int telefono;
		
		public Empleado(String n, String dni, int tel)
		{
			this.nombre=n;
			this.dni=dni;
			this.telefono=tel;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		public int getTelefono() {
			return telefono;
		}

		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}

		public String toString() {
			return "Empleado [Nombre: " + nombre + ", Dni: " + dni
					+ ", Telefono: " + telefono + "]";
		}
}
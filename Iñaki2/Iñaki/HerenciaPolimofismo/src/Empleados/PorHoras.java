package Empleados;

public class PorHoras extends Empleado {

		private double horas;
		private double salarioHora;
		
		public PorHoras(String n, String dni, int tel, double h, double salh)
		{
			super(n, dni, tel);
			this.horas=h;
			this.salarioHora=salh;
		}

		public double getHoras() {
			return horas;
		}

		public void setHoras(double horas) {
			this.horas = horas;
		}

		public double getSalarioHora() {
			return salarioHora;
		}

		public void setSalarioHora(double salarioHora) {
			this.salarioHora = salarioHora;
		}

		public String toString() {
			return "PorHoras [" +super.toString()+" Horas: " + horas + ", Salario Hora: " + salarioHora
					+ "]";
		}
		
		public void calcularSalario(){
			double sal=0;
			sal=getSalarioHora()*getHoras();
			
			System.out.println("Horas: "+sal);
		}
		
		
}
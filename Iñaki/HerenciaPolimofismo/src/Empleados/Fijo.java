package Empleados;

public class Fijo extends Empleado {
	
		private double salarioMes;
		
		public Fijo(String n, String dni, int tel, double salm)
		{
			super(n, dni, tel);
			this.salarioMes=salm;
		}

		public double getSalarioMes() {
			return salarioMes;
		}

		public void setSalarioMes(double salarioMes) {
			this.salarioMes = salarioMes;
		}

		public String toString() {
			return "Fijo ["+super.toString()+" Salario Mes: t" + salarioMes + "]";
		}
		
		public void calcularSalario ()
		{
			System.out.println("Fijo: "+getSalarioMes());
		}
}
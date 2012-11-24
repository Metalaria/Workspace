package Ejemplo.empleados;

import Ejemplo.objetosOrdenables.Ordenable;

public class Fijo extends Empleado implements Ordenable  {
	
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
		
		public double calcularSalario2(){
			return salarioMes;
		}

		public boolean esMayor(Ordenable o) {
			boolean mayor;
			if (o==null)
				mayor=true;
			else if (! (o instanceof Fijo))
				mayor=true;
			else {
				Fijo aux=(Fijo)o;
				//if (this.getSalarioMes()>aux.getSalarioMes())
				if (this.calcularSalario2()>((Fijo)o).calcularSalario2())	
					mayor=true;
				else mayor=false;
				
			}
			return mayor;
		}

		
		public boolean esMenor(Ordenable o) {
			boolean menor;
			if (o==null)
				menor=true;
			else if (! (o instanceof Fijo))
				menor=true;
			else {
				Fijo aux=(Fijo)o;
				if (this.calcularSalario2()>aux.calcularSalario2())
					menor=true;
				else menor=false;
				
			}
			return menor;
		}
		
		
		
}
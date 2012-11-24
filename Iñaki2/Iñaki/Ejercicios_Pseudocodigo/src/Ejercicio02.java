
public class Ejercicio02 {
	
	
	public static void main(String[] args) {
	
	
		int radio;
		double longitudCir,areaCir,pi;
		System.out.println("Apartado 1 resolver la Circuferencia");
		System.out.println("Introduce el radio de la ciercunferencia");
			pi=3.14;
			radio=Integer.parseInt(args[0]);
	
			longitudCir=radio*2*pi;
			areaCir=(radio*2*pi)/2;
		
			System.out.println("La longitud del circulo es "+longitudCir);
			System.out.println("El area del circulo es "+areaCir);
		
		System.out.println("Apartado 2 resolver la Ecuacion");
		
		int a,b,y1,y2,x1,x2;
		System.out.println("Para resolver la equacion y=a*x+B introduca");
			System.out.println("El valor de A");
			a=Integer.parseInt(args[1]);
			System.out.println("El valor de B");
			b=Integer.parseInt(args[2]);
			System.out.println("la ecuacion es: y="+a+"*x+"+b);
			System.out.println("Un posible valor para x1");
			x1=Integer.parseInt(args[3]);
			System.out.println("Un posible valor para x2");
			x2=Integer.parseInt(args[4]);
			
			
				y1=a*x1+b;
				y2=a*x2+b;
				System.out.println("Los valores son:");
				System.out.println("x1= "+x1+" y1= "+y1);
				System.out.println("x2= "+x2+" y2= "+y2);
	}
}


public class EcuacionMultiplos5 {
	public static void main(String[] args) {
		int y1;
		double y2;
		for (int x=10;x<=75;x+=5){
			//y1=x*x*x+5*x*x-2*x;//método rudimentario
			//System.out.println("Para x= "+x+ " y = "+y1);
			
			//mejor sería:
			
			y2=Math.pow(x,3)+5*Math.pow(x,2)-2*x;//la potencia se expresa con el metodo pow de la clase Math que actua sobre double
			System.out.println("Para x= "+x+ " y = "+(int)y2);
		}
			

	}

}

package objetos;

public class Circulo {
	//
	private int radio;
	private static final double PI=2.1416; //cte


public Circulo (){
	radio=1;
}

public Circulo(int radio){
	this.radio=radio;
}

public int getRadio(){
	return radio;
}

public void setRadio(int radio){
	this.radio=radio;
}

public void incRadio(int inc){
	radio+=inc;
}

public double longitud (){
	return 2*PI*radio;
	
}

public double area(){
	return PI*radio*radio;
}



}
package arraysClases;

public class PrincipalEjerc1 {

	public static void main(String[] args) {
		
		int tamano=10;
		Array array=new Array(tamano);
		array.inicializarnum();
		array.visualizar();
		array.visualizarInvertido();//visualiza el array invertido (sin generar objeto)
		System.out.println();
		array.invertir().visualizar(); //genera el array inverso como objeto y llama al método visualizar()
	
	}
}

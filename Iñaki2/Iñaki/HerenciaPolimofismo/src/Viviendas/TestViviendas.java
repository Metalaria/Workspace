package Viviendas;

public class TestViviendas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear Casas
		Vivienda casa1=new Vivienda(140,"La paz",88);
		Chalet chalet1=new Chalet("Medinazeli",45,true);
		Chalet chalet2=new Chalet("Arturo",22,false);
		Palacio palacio1=new Palacio(550,"Gran Via",23,10);
		
		// Crear array y asignar posiciones
		Vivienda array[]=new Vivienda[4];
			array[0]=casa1;
			array[1]=chalet1;
			array[2]=chalet2;
			array[3]=palacio1;
			
		//Recorre array mostrando contenido
		for(int i=0;i<array.length;i++){
			System.out.println(array[i].toString());
			
		}
		//Recorre el array y cuenta chalet
		int chalets=0;
		for(int i=0;i<array.length;i++){
			if(array[i].getMetrosCuadrados()==200){
				chalets++;
			}
		}
		System.out.println("El numero de Chalets es:"+chalets);
	}

}

import javax.swing.JFrame;
import java.io.*;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Borrar extends JFrame {

	private JFrame ventanaPadre;
	private File fichero; // Fichero con el que vamos a trabajar
	 
	/**
	* Creates new form Borrar
	*/
	public Borrar(JFrame jF, File fich) {
	this.ventanaPadre = jF;
	this.fichero = fich;
	this.ventanaPadre.setVisible(false);
	try {
		finalize();
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	this.setVisible(true);
	}
	 
	private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {
	this.setVisible(false);
	ventanaPadre.setVisible(true);
	}
	 
	private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
	 
	jTextFieldNombre.setText("");
	}
	 
	private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {
	 
	String limite = " "; // Elemento que separa el nombre, el usuario y la contraseña dentro del fichero
	String[] trozos; // Dividimos la linea del dichero en unidades independientes
	String nombre; // Nombre del sitio que el usuario ha introducido en el cuadro de texto
	String nombreTrozo; // Nombre del sitio dentro del string trozos
	Boolean encontrado = false;
	LinkedList<String> paraGuardar = new LinkedList(); // Almacenamos todas las lineas que no son las que queremos borrar, para despues volverlas a guardar
	 
	if (jTextFieldNombre.getText().equals("")) {
	JOptionPane.showMessageDialog(this, "El campo del nombre del sitio está vacío", "Campo vacío", JOptionPane.INFORMATION_MESSAGE);
	} else {
	try {
	 
	BufferedReader reader = new BufferedReader(new FileReader(fichero));  // Cargamos el fichero para lectura
	String linea = reader.readLine(); // Leemos la primera linea
	 
	if (linea == null) {
	JOptionPane.showMessageDialog(this, "El fichero está vacío", "Fichero vacío", JOptionPane.INFORMATION_MESSAGE);
	reader.close();// Cerramos el fichero para lectura
	} else {
	do {
	 
	trozos = linea.split(limite, 3); //Dividimos la linea leida en tres parte
	 
	nombre = jTextFieldNombre.getText().toUpperCase();
	nombreTrozo = trozos[0].toUpperCase();
	 
	if (!nombreTrozo.equals(nombre)) {
	//Comprobamos que la linea no sea vacia. Si es vacia, no la guardamos
	if (!nombreTrozo.equals("")) {
	paraGuardar.add(linea);
	}
	} else {
	encontrado = true;
	}
	 
	linea = reader.readLine(); // leemos la siguiente línea
	 
	} while (linea != null);
	 
	reader.close();// Cerramos el fichero para lectura
	 
	if (!encontrado) {
	JOptionPane.showMessageDialog(this, "No hay ningun sitio con ese nombre", "No está el sitio", JOptionPane.INFORMATION_MESSAGE);
	} else {
	BufferedWriter writer = new BufferedWriter(new FileWriter(fichero));
	while (!paraGuardar.isEmpty()) {
	writer.write(paraGuardar.poll().toString());
	writer.newLine();
	}
	writer.flush();
	writer.close();
	JOptionPane.showMessageDialog(this, "Eliminado con éxito", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
	}
	}
	} catch (IOException ex) {
	Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
	}
	}
	}
	// Variables declaration - do not modify
	private javax.swing.JButton jButtonAtras;
	private javax.swing.JButton jButtonBorrar;
	private javax.swing.JButton jButtonLimpiar;
	private javax.swing.JLabel jLabelNombre;
	private javax.swing.JLabel jLabelTitulo;
	private javax.swing.JTextField jTextFieldNombre;
	// End of variables declaration
}

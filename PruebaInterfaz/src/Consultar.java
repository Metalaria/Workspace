import javax.swing.JFrame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Consultar extends JFrame {

	private JFrame ventanaPadre;
	private File fichero; // Fichero con el que vamos a trabajar
	 
	/**
	* Creates new form Consultar
	*/
	public Consultar(JFrame jF, File fich) {
	this.fichero = fich;
	this.ventanaPadre = jF;
	this.ventanaPadre.setVisible(false);
	try {
		finalize();
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	this.setVisible(true);
	}
	 
	private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
	jTextFieldNombre.setText("");
	jTextFieldUsuario.setText("");
	jTextFieldContraseña.setText("");
	}
	 
	private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {
	this.setVisible(false);
	ventanaPadre.setVisible(true);
	}
	 
	private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {
	 
	String limite = " "; // Elemento que separa el nombre, el usuario y la contraseña dentro del fichero
	String[] trozos; // Dividimos la linea del dichero en unidades independientes
	String nombre; // Nombre del sitio que el usuario ha introducido en el cuadro de texto
	String nombreTrozo; // Nombre del sitio dentro del string trozos
	Boolean encontrado = false; // Para saber si hemos encontrado el sitio que buscabamos
	 
	jTextFieldUsuario.setText("");
	jTextFieldContraseña.setText("");
	 
	if (jTextFieldNombre.getText().equals("")) {
	JOptionPane.showMessageDialog(this, "El campo del nombre del sitio está vacío", "Campo vacío", JOptionPane.INFORMATION_MESSAGE);
	} else {
	try {
	 
	BufferedReader reader = new BufferedReader(new FileReader(fichero));  // Cargamos el fichero
	String linea = reader.readLine(); // leemos la primera linea
	 
	if (linea == null) {
	JOptionPane.showMessageDialog(this, "El fichero está vacío", "Fichero vacío", JOptionPane.INFORMATION_MESSAGE);
	} else {
	do {
	trozos = linea.split(limite, 3); //Dividimos la linea leida en tres parte
	 
	nombre = jTextFieldNombre.getText().toUpperCase();
	nombreTrozo = trozos[0].toUpperCase();
	 
	if (nombreTrozo.equals(nombre)) {
	encontrado = true;
	jTextFieldUsuario.setText(trozos[1]);
	jTextFieldContraseña.setText(trozos[2]);
	}
	 
	linea = reader.readLine(); // leemos la siguiente línea
	 
	} while (linea != null);
	 
	if (!encontrado) {
	JOptionPane.showMessageDialog(this, "No se han encontrado coincidencias", "No hay coincidencias", JOptionPane.INFORMATION_MESSAGE);
	}
	}
	 
	reader.close();// Cerramos el fichero
	 
	} catch (IOException ex) {
	Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
	}
	}
	}
	 
	private void jTextFieldContraseñaActionPerformed(java.awt.event.ActionEvent evt) {
	}
	// Variables declaration - do not modify
	private javax.swing.JButton jButtonAtras;
	private javax.swing.JButton jButtonBuscar;
	private javax.swing.JButton jButtonLimpiar;
	private javax.swing.JLabel jLabelContraseña;
	private javax.swing.JLabel jLabelNombre;
	private javax.swing.JLabel jLabelTitulo;
	private javax.swing.JLabel jLabelUsuario;
	private javax.swing.JTextField jTextFieldContraseña;
	private javax.swing.JTextField jTextFieldNombre;
	private javax.swing.JTextField jTextFieldUsuario;
	// End of variables declaration
}

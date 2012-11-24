import javax.swing.JFrame;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Insertar extends JFrame {

	private File fichero; // Ruta del fichero a modificar
	private JFrame ventanaPadre; // Ventana anterior de trabajo
	private LinkedList contraseñasGuardar = new LinkedList();// Contraseñas a guardar en el archivo
	 
	/**
	* Creates new form Insertar
	*/
	public Insertar(JFrame jF, File f) {
	this.ventanaPadre = jF;
	this.fichero = f;
	this.ventanaPadre.setVisible(false);
	try {
		finalize();
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	this.setVisible(true);
	}
	 
	private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {
	 
	this.setVisible(false);
	ventanaPadre.setVisible(true);
	 
	}
	 
	private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
	 
	// Limpiamos todos los campos
	jTextFieldNombre.setText("");
	jTextFieldUsuario.setText("");
	jTextFieldPassword.setText("");
	 
	}
	 
	private void jButtonAnadirActionPerformed(java.awt.event.ActionEvent evt) {
	 
	String nuevoItem; // String con nombre, usuario y contraseña que queremos guardar
	 
	// Si algun campo está vacio, mostramos un mensaje informando de que faltan datos
	if (jTextFieldNombre.getText().equals("") || jTextFieldUsuario.getText().equals("") || jTextFieldPassword.getText().equals("")) {
	JOptionPane.showMessageDialog(this, "ERROR: Faltan datos", "Mensaje de Error", JOptionPane.WARNING_MESSAGE);
	return;
	}
	 
	nuevoItem = jTextFieldNombre.getText() + " " + jTextFieldUsuario.getText() + " " + jTextFieldPassword.getText() + " \n";
	contraseñasGuardar.add(nuevoItem);
	jTextPaneVer.setText(jTextPaneVer.getText() + nuevoItem);
	}
	 
	private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {
	 
	BufferedWriter writer; //Para escribir en el fichero
	 
	if (fichero == null) {
	//Activamos el filtro para que nos muestre, por defecto, los archivos de texto
	FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "txt");
	JFileChooser fileChooserGuardar = new JFileChooser();
	fileChooserGuardar.setFileFilter(filtro);
	fileChooserGuardar.setDialogTitle("Guardar");
	int seleccion = fileChooserGuardar.showSaveDialog(this);
	 
	if (seleccion == JFileChooser.APPROVE_OPTION) {
	fichero = fileChooserGuardar.getSelectedFile();
	fileChooserGuardar.setFileSelectionMode(JFileChooser.FILES_ONLY);
	try {
	writer = new BufferedWriter(new FileWriter(fichero + ".txt")); // Ponemos .txt para darle extension al archivo que creamos
	while (!contraseñasGuardar.isEmpty()) {
	writer.write(contraseñasGuardar.poll().toString());
	writer.newLine();
	}
	writer.flush();
	writer.close();
	} catch (IOException e) {
	JOptionPane.showMessageDialog(this, "Error al guardar el archivo", "Error guardar archivo", JOptionPane.ERROR_MESSAGE);
	}
	 
	JOptionPane.showMessageDialog(this, "El fichero de texto se ha guardado correctamente con los datos introducidos");
	}
	} else if (!(fichero == null)) // Añadimos al fichero existente
	{
	try {
	writer = new BufferedWriter(new FileWriter(fichero, true));
	while (!contraseñasGuardar.isEmpty()) {
	writer.write(contraseñasGuardar.poll().toString());
	writer.newLine();
	}
	writer.flush();
	writer.close();
	} catch (IOException e) {
	JOptionPane.showMessageDialog(this, "Error al guardar el archivo", "Error guardar archivo", JOptionPane.ERROR_MESSAGE);
	}
	JOptionPane.showMessageDialog(this, "El fichero de texto se ha guardado correctamente con los datos introducidos");
	} else {
	JOptionPane.showMessageDialog(this, "ERROR: Error al guardar", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
	}
	 
	// Volvemos al menu principal
	this.setVisible(false);
	ventanaPadre.setVisible(true);
	}
	// Variables declaration - do not modify
	private javax.swing.JButton jButtonAnadir;
	private javax.swing.JButton jButtonCancelar;
	private javax.swing.JButton jButtonGuardar;
	private javax.swing.JButton jButtonLimpiar;
	private javax.swing.JLabel jLabelNombre;
	private javax.swing.JLabel jLabelPasswoed;
	private javax.swing.JLabel jLabelTitulo;
	private javax.swing.JLabel jLabelUsuario;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextField jTextFieldNombre;
	private javax.swing.JTextField jTextFieldPassword;
	private javax.swing.JTextField jTextFieldUsuario;
	private javax.swing.JTextPane jTextPaneVer;
	// End of variables declaration
}

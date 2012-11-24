import javax.swing.JFrame;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MenuPrincipal extends JFrame {

	public MenuPrincipal() {
		try {
			finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setVisible(true);
		}
		 
		private void jButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {
		 
		// Creamos un filtro para que se reconozcan los archivos de texto
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "txt");
		JFileChooser fileChooserCargar = new JFileChooser();
		fileChooserCargar.setFileFilter(filtro);
		fileChooserCargar.setDialogTitle("Abrir");
		 
		int seleccion = fileChooserCargar.showOpenDialog(this);
		 
		if (seleccion == JFileChooser.APPROVE_OPTION) {
		File file = fileChooserCargar.getSelectedFile();
		Modificar m = new Modificar(this, file);
		}
		}
		 
		private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {
		 
		Insertar i = new Insertar(this, null); // Le pasamos "null" para que sea el usuario el que elija
		// donde guardar el fichero
		}
		 
		private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {
		 
		System.exit(0); // Salimos del programa
		 
		}
		/**
		* @param args the command line arguments
		*/
		// Variables declaration - do not modify
		private javax.swing.JButton jButtonCargar;
		private javax.swing.JButton jButtonNuevo;
		private javax.swing.JButton jButtonSalir;
		private javax.swing.JLabel jLabelTitulo;
		// End of variables declaration
}

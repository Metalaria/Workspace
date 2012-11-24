import javax.swing.JFrame;
import java.io.File;

public class Modificar extends JFrame {

	private MenuPrincipal menuP;
	private File fichero;
	 
	public Modificar(MenuPrincipal mp, File fich) {
	this.menuP = mp;
	this.fichero = fich;
	this.menuP.setVisible(false);
	try {
		initIDs();
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	this.setVisible(true);
	}
	 
	private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {
	 
	this.setVisible(false);
	menuP.setVisible(true);
	}
	 
	private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {
	 
	Insertar i = new Insertar(this, fichero);
	}
	 
	private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {
	 
	Consultar c = new Consultar(this, fichero);
	}
	 
	private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {
	 
	Borrar b = new Borrar(this, fichero);
	}
	// Variables declaration - do not modify
	private javax.swing.JButton jButtonAñadir;
	private javax.swing.JButton jButtonBorrar;
	private javax.swing.JButton jButtonConsultar;
	private javax.swing.JButton jButtonMenu;
	private javax.swing.JLabel jLabelTitulo;
	// End of variables declaration
}

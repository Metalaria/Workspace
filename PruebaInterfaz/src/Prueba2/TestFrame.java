package Prueba2;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class TestFrame extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TestFrame frame = new TestFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
 }

public TestFrame() {
    initComponents();
}

private void initComponents() {
    // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents

    //======== this ========
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());
    pack();
    setLocationRelativeTo(getOwner());
    // JFormDesigner - End of component initialization  //GEN-END:initComponents
}

// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
// JFormDesigner - End of variables declaration  //GEN-END:variables
	

}

package Start;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Dimension;


public class GeneralWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeneralWindow window = new GeneralWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GeneralWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setSize(new Dimension(500, 400));
	}
}

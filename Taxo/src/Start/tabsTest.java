package Start;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;


public class tabsTest {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tabsTest window = new tabsTest();
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
	public tabsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setSize(new Dimension(100, 200));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel tab1 = new JPanel();
		tabbedPane.addTab("Tab1", null, tab1, null);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Tab2", null, panel, null);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{tab1, tabbedPane}));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

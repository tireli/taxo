import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import controls.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class addTaxo {

	private JFrame frame;
	private JTextField txtNewTaxoCitiName;
	private JLabel lblTaxitype;
	private JLabel lblNewTaxoSelfName;
	private JTextField textFieldNewTaxoSelfName;

	/**
	 * Launch the application.
	 */
	public static void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addTaxo window = new addTaxo();
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
	public addTaxo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frame.setTitle("Добавить новый таксопарк");
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 26, 426, 262);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtNewTaxoCitiName = new JTextField();
		txtNewTaxoCitiName.setBounds(176, 0, 238, 19);
		panel.add(txtNewTaxoCitiName);
		txtNewTaxoCitiName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Название города");
		lblNewLabel.setBounds(10, 2, 135, 15);
		panel.add(lblNewLabel);
		
		lblTaxitype = new JLabel("Система такси");
		lblTaxitype.setBounds(10, 35, 123, 15);
		panel.add(lblTaxitype);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "GetTaxi", "Uber", "Яндекс.Такси"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(176, 31, 238, 19);
		panel.add(comboBox);
		
		lblNewTaxoSelfName = new JLabel("Название таксопарка");
		lblNewTaxoSelfName.setBounds(10, 65, 155, 15);
		panel.add(lblNewTaxoSelfName);
		
		textFieldNewTaxoSelfName = new JTextField();
		textFieldNewTaxoSelfName.setBounds(176, 62, 238, 19);
		panel.add(textFieldNewTaxoSelfName);
		textFieldNewTaxoSelfName.setColumns(10);
		
		JButton btnCreateNewTaxoButton = new JButton("Создать");

		btnCreateNewTaxoButton.addActionListener(new addButtonControl(txtNewTaxoCitiName,txtNewTaxoCitiName,comboBox.getSelectedItem()));
		btnCreateNewTaxoButton.setBounds(10, 225, 117, 25);
		panel.add(btnCreateNewTaxoButton);
		
		JButton btnCreateNewButton = new JButton("Отмена");
		btnCreateNewButton.addActionListener(new cancelButtonControl());
		btnCreateNewButton.setBounds(139, 225, 117, 25);
		panel.add(btnCreateNewButton);
	//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

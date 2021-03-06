package Start;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;

import java.awt.CardLayout;

import javax.swing.JMenuItem;

import common.serialClassAdapter;
import common.taxoPark;
import controls.allControll;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;


public class Taksi {

	private JFrame frame;
	private JPanel pLeftTList;
	private JMenuBar topMenu;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private ArrayList<serialClassAdapter> MDList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Taksi window = new Taksi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Taksi window = new Taksi();
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
	public Taksi() {
		initialize();
	}
	public Taksi(ArrayList<serialClassAdapter> modelList) {
		
		this.MDList = modelList;
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 779, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topMenu = new JMenuBar();
		frame.setJMenuBar(topMenu);
		
		JMenu menu = new JMenu("Таксопарк");
		topMenu.add(menu);
		
		JMenuItem addTaxoMenuItem = new JMenuItem("Добавить таксопарк");
		addTaxoMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addTaxo addTaxo = new addTaxo();
				addTaxo.start();
			}
		});
		menu.add(addTaxoMenuItem);
		frame.getContentPane().setLayout(null);
		
		pLeftTList = new JPanel();
		pLeftTList.setBounds(12, 42, 207, 333);
		pLeftTList.setToolTipText("");
		pLeftTList.setBorder(new LineBorder(new Color(0, 0, 0)));
		frame.getContentPane().add(pLeftTList);
		pLeftTList.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Таксопарк");
		lblNewLabel.setBounds(34, 6, 75, 15);
		pLeftTList.add(lblNewLabel);
		
		JList list = new JList();
		DefaultListModel listModel = new DefaultListModel();
		MDList = allControll.getModelList();//.getMyObj();//.toArray();
		System.out.println(MDList.toString());
		for (int i = 0; i < MDList.size(); i++) {
			serialClassAdapter singleAdapter = MDList.get(i);
			taxoPark taxoParkInfo = (taxoPark) singleAdapter.getMyObj();
			listModel.addElement(taxoParkInfo.getName());
		}
		listModel.addElement("Jone Doe");
		
		list.setModel(listModel);
		
		list.setBounds(12, 33, 183, 288);
		pLeftTList.add(list);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(231, 44, 1, 352);
		separator.setOrientation(SwingConstants.VERTICAL);
		frame.getContentPane().add(separator);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(244, 42, 520, 298);
		frame.getContentPane().add(tabbedPane);
		
		JPanel pnDrivers = new JPanel();
		tabbedPane.addTab("Водители", null, pnDrivers, null);
		pnDrivers.setLayout(null);
		
		JScrollPane scrDrivers = new JScrollPane();
		scrDrivers.setBounds(0, 0, 497, 210);
		pnDrivers.add(scrDrivers);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrDrivers.setViewportView(table_1);
		
		table = new JTable();
		table.setBounds(0, 0, 497, 176);
		pnDrivers.add(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"\u2116", "\u0418\u043C\u044F", "\u0422\u0435\u043B\u0435\u0444\u043E\u043D", "\u0421\u0447\u0435\u0442", "1\u0421", "\u0422\u0430\u0440\u0438\u0444"
			}
		));
		
		JButton btnLjf = new JButton("Добавить");
		btnLjf.setBounds(12, 234, 117, 25);
		pnDrivers.add(btnLjf);
		
		JButton button = new JButton("Загрузить");
		button.setBounds(141, 234, 117, 25);
		pnDrivers.add(button);
		
		JPanel pnTax = new JPanel();
		tabbedPane.addTab("Тарифы", null, pnTax, null);
		pnTax.setLayout(null);
		
		JButton btnNewTaxAdd = new JButton("Добавить тариф");
		btnNewTaxAdd.setBounds(12, 234, 151, 25);
		pnTax.add(btnNewTaxAdd);
		
		JButton btnTaxCange = new JButton("Изменить тариф");
		btnTaxCange.setBounds(175, 234, 157, 25);
		pnTax.add(btnTaxCange);
		
		JList listForTaxes = new JList();
		listForTaxes.setBounds(12, 12, 491, 106);
		pnTax.add(listForTaxes);
		
		JPanel pnForTaxesView = new JPanel();
		pnForTaxesView.setToolTipText("");
		pnForTaxesView.setBorder(new TitledBorder(null, "\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u044F \u043E \u0442\u0430\u0440\u0438\u0444\u0435", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnForTaxesView.setBounds(12, 130, 491, 92);
		pnTax.add(pnForTaxesView);
		pnForTaxesView.setLayout(null);
		
		JPanel pnBank = new JPanel();
		tabbedPane.addTab("Банк", null, pnBank, null);
		pnBank.setLayout(null);
		
		JLabel lb = new JLabel("Использовать интеграцию с банком");
		lb.setBounds(12, 12, 270, 22);
		pnBank.add(lb);
		
		JCheckBox chbBankUseSelector = new JCheckBox("");
		chbBankUseSelector.setBounds(296, 12, 21, 22);
		pnBank.add(chbBankUseSelector);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 35, 503, 22);
		pnBank.add(separator_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 70, 491, 189);
		pnBank.add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, "name_26217123717804");
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, "name_26230150055338");
		panel_3.setLayout(null);
		
		JButton button_1 = new JButton("Загрузить счета");
		button_1.setBounds(12, 152, 149, 25);
		panel_3.add(button_1);
		
		JPanel pnTripList = new JPanel();
		tabbedPane.addTab("Расчет", null, pnTripList, null);
		pnTripList.setLayout(null);
		
		JButton button_2 = new JButton("Загрузить поездки");
		button_2.setBounds(12, 234, 177, 25);
		pnTripList.add(button_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(12, 12, 491, 213);
		pnTripList.add(scrollPane);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table_2);
		
		JPanel pn1C = new JPanel();
		tabbedPane.addTab("1С", null, pn1C, null);
		pn1C.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		pn1C.add(panel, "name_24552139133862");
		panel.setLayout(null);
		
		JLabel label = new JLabel("Делать выгрузку в 1С");
		label.setBounds(12, 12, 169, 15);
		panel.add(label);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(180, 8, 129, 19);
		panel.add(chckbxNewCheckBox);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(12, 35, 491, 15);
		panel.add(separator_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(12, 71, 491, 188);
		panel.add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5, "name_27957851532470");
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6, "name_27961041945014");
		
		JPanel pnPropirties = new JPanel();
		tabbedPane.addTab("Общие", null, pnPropirties, null);
		
		JButton btnNewButton = new JButton("Сохранить");
		btnNewButton.setBounds(549, 371, 117, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Рассчитать");
		btnNewButton_1.setToolTipText("Рассчитать");
		btnNewButton_1.setBounds(244, 371, 117, 25);
		frame.getContentPane().add(btnNewButton_1);
	}
}

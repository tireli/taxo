/**
 * 
 */
package controls;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import common.*;


public class addButtonControl extends controls {

	private JTextField citiName;
	private JTextField taxoName;
	private JComboBox systemName;
	private ActionEvent arg0;
	/**
	 * 
	 */
	public addButtonControl() {
		// TODO Auto-generated constructor stub
		
	}
	public addButtonControl(ActionEvent arg0) {
		// TODO Auto-generated constructor stub
		this.arg0 = arg0;
	}
	
	public addButtonControl(JTextField txtNewTaxoCitiName,
			JTextField txtNewTaxoCitiName2, JComboBox selectedItem) {
		// TODO Auto-generated constructor stub
		this.citiName = txtNewTaxoCitiName;
		this.taxoName = txtNewTaxoCitiName2;
		this.systemName = selectedItem;
		System.out.println(txtNewTaxoCitiName.toString());
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String s = (String)systemName.getSelectedItem();
		taxoPark MyNewTaxo = new taxoPark(taxoName.getText(), citiName.getText(), s);
		allControll.addModelItem(MyNewTaxo);
		System.out.println(taxoName.getText());
		System.out.println("add Taxo");
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "addButtonControl [citiName=" + citiName + ", taxoName="
				+ taxoName + ", systemName=" + systemName + "]";
	}
	

}

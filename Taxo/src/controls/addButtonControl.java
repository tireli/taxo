/**
 * 
 */
package controls;

import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import common.*;


public class addButtonControl extends controls {

	private String citiName;
	private String taxoName;
	private Object systemName;
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
	public addButtonControl(String citiName, String taxoName, Object systemName) {
		// TODO Auto-generated constructor stub
		this.citiName = citiName;
		this.taxoName = taxoName;
		this.systemName = systemName;
		System.out.println(this.toString());
	}
	public addButtonControl(JTextField txtNewTaxoCitiName,
			JTextField txtNewTaxoCitiName2, Object selectedItem) {
		// TODO Auto-generated constructor stub
		this.citiName = txtNewTaxoCitiName.getText();
		this.taxoName = txtNewTaxoCitiName2.getText();
		this.systemName = selectedItem.toString();
		System.out.println(this.toString());
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		taxoPark MyNewTaxo = new taxoPark(taxoName, citiName, systemName.toString());
		allControll.addModelItem(MyNewTaxo);
		System.out.println(taxoName);
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

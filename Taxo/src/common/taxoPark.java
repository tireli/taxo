/**
 * 
 */
package common;

import java.io.Serializable;

/**
 * @author aleksei
 *
 */
public class taxoPark implements Serializable{
	
	////////////////////////////////////////////////////////////////
	//Constructors
	////////////////////////////////////////////////////////////////
	public taxoPark(String name, String citiName, String taxiSystem) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.citiName = citiName;
		this.taxiSystem = taxiSystem;
	}
	
	
	
	////////////////////////////////////////////////////////////////
	//Fields
	////////////////////////////////////////////////////////////////
	private String name, citiName, taxiSystem;
	
	
	////////////////////////////////////////////////////////////////
	//Geters
	////////////////////////////////////////////////////////////////
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the taxiSystem
	 */
	public String getTaxiSystem() {
		return taxiSystem;
	}
	
	/**
	 * @return the citiName
	 */
	public String getCitiName() {
		return citiName;
	}
	////////////////////////////////////////////////////////////////
	//Seters
	////////////////////////////////////////////////////////////////
	/**
	 * @param Name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param taxiSystem the taxiSystem to set
	 */
	public void setTaxiSystem(String taxiSystem) {
		this.taxiSystem = taxiSystem;
	}
	
	/**
	 * @param citiName the citiName to set
	 */
	public void setCitiName(String citiName) {
		this.citiName = citiName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	
	////////////////////////////////////////////////////////////////
	//Methods
	////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "taxoPark [name=" + name + ", citiName=" + citiName
				+ ", taxiSystem=" + taxiSystem + "]";
	}
	
}

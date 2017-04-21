/**
 * 
 */
package common;

/**
 * @author aleksei
 *
 */
public class Driver extends Person {

	
	//test comment for git	


	////////////////////////////////////////////////////////////////
	//Constructors
	////////////////////////////////////////////////////////////////
	
	Driver(String name, String phone)
	{
		super(name, phone);
		this.setMyTarif(Tarif);
		this.setMyBank(Bank);
	}

	
	////////////////////////////////////////////////////////////////
	//Fields
	////////////////////////////////////////////////////////////////
	private Tarif myTarif;
	private Bank myBank;
	private static final Tarif Tarif = null;
	private static final Bank Bank = null;
	
	////////////////////////////////////////////////////////////////
	//Geters
	////////////////////////////////////////////////////////////////
	/**
	 * @return the myTarif
	 */
	public Tarif getMyTarif() 
	{
		return myTarif;
	}
	

	/**
	 * @return the myBank
	 */
	public Bank getMyBank() 
	{
		return myBank;
	}
	
	////////////////////////////////////////////////////////////////
	//Seters
	////////////////////////////////////////////////////////////////

	/**
	 * @param myTarif the myTarif to set
	 */
	public void setMyTarif(Tarif myTarif) 
	{
		this.myTarif = myTarif;
	}


	/**
	 * @param myBank the myBank to set
	 */
	public void setMyBank(Bank myBank) 
	{
		this.myBank = myBank;
	}
	
	
	
	
}

/**
 * 
 */
package common;

/**
 * @author aleksei
 *
 */
public class Person {

	////////////////////////////////////////////////////////////////
	//Constructors
	////////////////////////////////////////////////////////////////
	Person()
	{
		this.setNeme("Имя");
		this.setPhoneNumber("71234567890");
		this.setId(getIdCount());
		this.setFullName(getNeme());
	}
	Person(String name)
	{
		this.setNeme(name);
		this.setPhoneNumber("71234567890");
		this.setId(getIdCount());
		this.setFullName(getNeme());
	}
	Person(String name, String phone)
	{
		this.setNeme(name);
		this.setPhoneNumber(phone);
		this.setId(getIdCount());
		this.setFullName(getNeme());
	}
	
	////////////////////////////////////////////////////////////////
	//Fields
	////////////////////////////////////////////////////////////////
	private String neme;
	private int id;
	private String phoneNumber;
	private String fullName;
	
	private static int idCount = 0;
	
	
	////////////////////////////////////////////////////////////////
	//Geters
	////////////////////////////////////////////////////////////////
	public String getNeme() {
		return neme;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	
	/**
	 * @return the idCount
	 */
	public static int getIdCount() {
		idCount++;
		return idCount;
	}
	////////////////////////////////////////////////////////////////
	//Seters
	////////////////////////////////////////////////////////////////
	
	public void setNeme(String neme) {
		this.neme = neme;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	


}

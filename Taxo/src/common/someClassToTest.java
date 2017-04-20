/**
 * 
 */
package common;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author aleksei
 *
 */
public class someClassToTest  implements Serializable{
	private String myName, type, citi;
	private int age, countForMassives;
	private ArrayList<Object> list; 
	
	public someClassToTest() {
		// TODO Auto-generated constructor stub
		this.myName = "first";
		this.type = "SomeType";
		this.citi = "Moscow";
		this.age = 10;
		this.countForMassives = 2;
		this.list = null;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCiti() {
		return citi;
	}

	public void setCiti(String citi) {
		this.citi = citi;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCountForMassives() {
		return countForMassives;
	}

	public void setCountForMassives(int countForMassives) {
		this.countForMassives = countForMassives;
	}

	public ArrayList<Object> getList() {
		return list;
	}

	public void setList(ArrayList<Object> list) {
		this.list = list;
	}
	
	public ArrayList<Object> createLest(ArrayList<Object> list, int count)
	{
		for (int i = 0; i < count; i++) {
			list.add(new Tarif("Moscow", 5));
		}
		return list;
	}

	@Override
	public String toString() {
		return "someClassToTest [myName=" + myName + ", type=" + type
				+ ", citi=" + citi + ", age=" + age + ", countForMassives="
				+ countForMassives + ", list=" + list + "]";
	}
	
	
}

/**
 * 
 */
package common;

import java.io.Serializable;

/**
 * @author aleksei
 *
 */
public class serialClassAdapter extends someClassToTest implements Serializable {
	
	private Object myObj;
	
	public serialClassAdapter(Object myObj) {
		// TODO Auto-generated constructor stub
		this.myObj = myObj;
	}

	public Object getMyObj() {
		return myObj;
	}

	public void setMyObj(Object myObj) {
		this.myObj = myObj;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "serialClassAdapter [myObj=" + myObj + "]";
	}
	
	
	
	
}

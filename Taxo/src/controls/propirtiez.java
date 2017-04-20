/**
 * 
 */
package controls;

import java.io.Serializable;

/**
 * @author aleksei
 *
 */
public class propirtiez implements Serializable {
	private String path, seriasFileName;
	
	public propirtiez(){
		this.path = "/home/aleksei/RED/";//"../source/";// /home/aleksei/Eworkspace2/classSerialiser/src
		this.seriasFileName = "serFileToSave.fts";
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @return the seriasFileName
	 */
	public String getSeriasFileName() {
		return seriasFileName;
	}
	
	
}

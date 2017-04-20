/**
 * 
 */
package controls;

import java.io.File;
import java.io.IOException;

/**
 * @author aleksei
 *
 */
public class fileMaker {
	
	private propirtiez prop;
	private String fileName;
	private String filePath;
	/**
	 * @param prop
	 */
	public fileMaker(propirtiez prop) {
		super();
		this.prop = prop;
		this.fileName = prop.getSeriasFileName();
		this.filePath = prop.getPath();
	}
	/**
	 * @param prop
	 * @param fileName
	 */
	public fileMaker(propirtiez prop, String fileName) {
		super();
		this.prop = prop;
		this.fileName = fileName;
		this.filePath = prop.getPath();
	}
	/**
	 * @param prop
	 * @param fileName
	 * @param filePath
	 */
	public fileMaker(propirtiez prop, String fileName, String filePath) {
		super();
		this.prop = prop;
		this.fileName = fileName;
		this.filePath = filePath;
	}
	/**
	 * @return the prop
	 */
	public propirtiez getProp() {
		return prop;
	}
	/**
	 * @param prop the prop to set
	 */
	public void setProp(propirtiez prop) {
		this.prop = prop;
	}
	/**
	 * @return the fileName
	 */
	public String getfileName() {
		return fileName;
	}
	/**
	 * @param fileName the fileName to set
	 */
	public void setfileName(String fileName) {
		this.fileName = fileName;
	}
	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}
	/**
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public File makeMe() {
		File f1 = new File(filePath + fileName);
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("FMK ERR");
		}
	//	f1.setWritable(true);
	//	System.out.println(filePath + fileName);
		return f1;
	}		
	
}

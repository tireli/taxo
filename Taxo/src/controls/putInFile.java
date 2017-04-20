/**
 * 
 */
package controls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import common.serialClassAdapter;
import common.someClassToTest;

/**
 * @author aleksei
 *
 */
public class putInFile {
	
	
	
	/**
	 * 
	 */
	private fileMaker fMk;
	private File f1;
	
	public putInFile(propirtiez o) {
		super();
		this.fMk = new fileMaker(o);		
	}
	 
	public void putThis(ArrayList<serialClassAdapter> ML){
		f1 = fMk.makeMe();
		if (f1.exists()) {
			if (f1.canWrite()) {
				try (ObjectOutputStream CO = new ObjectOutputStream(new FileOutputStream(f1))){
					
					CO.writeObject(ML);
					CO.flush();
					
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println("IOExc" + e.toString());
				}
			}else {
				System.out.println("File Error");
			}
		}else {
			//Make file to write current model and safe it
			
			//Make file
			System.out.println("Make file to write current model and safe it");
						
			//Make default model
			ML.add(new serialClassAdapter(new someClassToTest()));
			System.out.println(ML.toString());
			
			//Put default model to file
			System.out.println(f1.canWrite());
			if (f1.canWrite()) {
				try (ObjectOutputStream CO = new ObjectOutputStream(new FileOutputStream(f1))){
					
					CO.writeObject(ML);
					CO.flush();
					
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println("IOExc" + e.toString());
				}
			}else {
				System.out.println("File Error");
			}
		}
	}
	
	
	
}

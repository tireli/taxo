/**
 * 
 */
package controls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
public class allControll {
	
	private static propirtiez startProps = new propirtiez();
	private static ArrayList<serialClassAdapter> modelList = new ArrayList<serialClassAdapter>();
	
	public static void addModelItem(Object o){
		modelList.add(new serialClassAdapter(o));
		putInFile PF = new putInFile(startProps);
		PF.putThis(modelList);
	}
	
	
	public static ArrayList<serialClassAdapter> getModelList() {
		return modelList;
	}


	public void runInit() {
		System.out.println("In run method");
		File f1 = new File(startProps.getPath()+startProps.getSeriasFileName());
		if (f1.exists()) {
			//Read file to load current model
			System.out.println("Read file to load current model");
			//Read file
			
			try (ObjectInputStream CI = new ObjectInputStream(new FileInputStream(f1))){
				System.out.println("Read file");
				ArrayList<serialClassAdapter> readObject = (ArrayList<serialClassAdapter>) CI.readObject();
				modelList = readObject;
				System.out.println(readObject);
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("IOExc" + e.toString());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
				System.out.println("IOExc" + e.toString());
			}
			
		}else {
			//Make file to write current model and safe it
			putInFile PF = new putInFile(startProps);
			PF.putThis(modelList);
			
		}
		
		
		
	}

}

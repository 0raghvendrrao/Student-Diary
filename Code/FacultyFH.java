import java.util.*;
import java.io.*;

public class FacultyFH implements Serializable, FileHandler{
	public static ArrayList<Faculty> get(){
		ArrayList<Faculty> temp=new ArrayList<Faculty>();
		ObjectInputStream obj = null;

                Faculty s = null;
                try {
                        obj = new ObjectInputStream(new FileInputStream("../Files/Faculty.ser"));
                        while (true)
                        {
                            s = (Faculty) obj.readObject();
                            temp.add(s);   
                        }
                } 
                catch (EOFException eof) {
                        System.out.println("Taken out all the students");
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }

                return temp;
	}

	public static void put(ArrayList<Faculty> temp){
		
		try {
			ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("../Files/Faculty.ser"));
			Iterator it = temp.iterator();
			while(it.hasNext()){
				Faculty std = (Faculty) it.next();
				obj.writeObject(std);
			}
		}
		catch (Exception e){
				
			}
	}
}
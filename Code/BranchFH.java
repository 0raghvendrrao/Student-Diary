import java.util.*;
import java.io.*;

public class BranchFH implements Serializable{
	public static ArrayList<Branch> get(){
		ArrayList<Branch> temp=new ArrayList<Branch>();
		ObjectInputStream obj = null;

                Branch s = null;
                try {
                        obj = new ObjectInputStream(new FileInputStream("../Files/Branch.ser"));
                        while (true)
                        {
                            s = (Branch) obj.readObject();
                            temp.add(s);   
                        }
                } 
                catch (EOFException eof) {
                        System.out.println("Taken out all the branches");
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }

                return temp;
	}

	public static void put(ArrayList<Branch> temp){
		
		try {
			ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("../Files/Branch.ser"));
			Iterator it = temp.iterator();
			while(it.hasNext()){
				Branch std = (Branch) it.next();
				obj.writeObject(std);
			}
		}
		catch (Exception e){
				
			}
	}
}
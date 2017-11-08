import java.util.*;
import java.io.*;

public class StudentFH implements Serializable{
	public static ArrayList<Student> get(){
		ArrayList<Student> temp=new ArrayList<Student>();
		ObjectInputStream obj = null;

                Student s = null;
                try {
                        obj = new ObjectInputStream(new FileInputStream("../Files/Student.ser"));
                        while (true)
                        {
                            s = (Student) obj.readObject();
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

	public static void put(ArrayList<Student> temp){
		
		try {
			ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("../Files/Student.ser"));
			Iterator it = temp.iterator();
			while(it.hasNext()){
				Student std = (Student) it.next();
				obj.writeObject(std);
			}
		}
		catch (Exception e){
				
			}
	}
}
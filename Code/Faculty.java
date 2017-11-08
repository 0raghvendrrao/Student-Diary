import java.util.*;
import java.io.*;

public class Faculty extends User implements Serializable{

	//Search Faculty
	public static Faculty searchFaculty(String rollno){
		ArrayList<Faculty> temp = new ArrayList<Faculty>();
		temp = FacultyFH.get();
		Iterator it = temp.iterator();
		while (it.hasNext()) {
            Faculty s = (Faculty)it.next();
            if (s.getUsername().compareTo(rollno) == 0)
                return s;
        }
    }
	
	Faculty(String username, String name, Branch stream){
		super(username,name);
		super.addStream(stream);
	}
public void makeAnouncement(Anouncement temp, ArrayList<Student> s){
		
		for(Student x : s){
			x.addAnouncement(temp);
		}
	}
}


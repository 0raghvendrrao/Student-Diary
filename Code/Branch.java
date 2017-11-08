import java.util.ArrayList;
import java.io.*;
public class Branch  {
	String name;
	ArrayList<Faculty> teachers=null;
	ArrayList<Student> students=null;
	ArrayList<Course> branchSubjects=null;
	Faculty headOfDept=null;
	
	Branch(String name){
		
		this.name = name;
	}
	public void makeHOD(Faculty f){
		headOfDept=f;
	}
	public void addCourses(Course c){
		branchSubjects.add(c);
	}
	public void removeCourses(Course c){
		branchSubjects.remove(c);
	}

	public void addFaculty(Faculty c){
		teachers.add(c);
	}
	public void removeFaculty(Faculty c){
		teachers.remove(c);
	}
}

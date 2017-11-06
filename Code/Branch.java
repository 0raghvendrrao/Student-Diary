import java.util.ArrayList;
import java.io.*;
public class Branch  {
	String name;
	ArrayList<faculty> teachers;
	ArrayList<student> students;
	static ArrayList<Course> branchSubjects;
	static ArrayList<Branch> totalBranches = new ArrayList<Branch>();

	
	Branch(){
		totalBranches.add(this);
		
	}
	public void addCourses(Course c){
		subjects.add(c);
	}
	public void removeCourses(Course c){
		subjects.remove(c);
	}
}

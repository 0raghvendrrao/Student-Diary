import java.util.ArrayList;
public class Anouncement {
	String name;

	Faculty givenBy;
	String anouncement;
	ArrayList<Student> givenTo;
	
	Anouncement(String name, Faculty givenBy, ArrayList<Student> givenTo, String anouncement){
		this.name = name;
		this.givenBy = givenBy;
		this.givenTo = givenTo;
		this.anouncement = anouncement;
	}
	
	public String toString(){
		return String.format("%s%29s|%s%29s|%s",this.name,this.givenBy,this.anouncement);
	}
}

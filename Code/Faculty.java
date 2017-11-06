import java.util.*;
import java.io.*;

public class Faculty implements Serializable{
	private String username="";
	public String name="";
	private Address add=null;
	private Branch department;
	//private 
	Faculty(String username, String name){
		
		this.username=username;
		
		this.name=name;
	}

	private boolean isRollNo(String rollno){
		if(rollno.length()!=15){
			System.out.println("*Roll. No. must be of length 15. Eg:AM.EN.U4CSE16051");
			return false;
		}
		if(rollno.charAt(2)!='.' || rollno.charAt(5)!='.'){
			System.out.println("Roll. No. Must be of the form AM.EN.U4CSE16051");
			return false;

		}
		return true;
	}

	protected void setRollNo(){
		Scanner s=new Scanner(System.in);
		do{
			System.out.print("Enter Roll no. : ");
			rollno = s.next();
		}
		while(!isRollNo(rollno));

	}
	public String getRollNo(){
		return rollno;
	}

	protected void setName(){
		Scanner s= new Scanner(System.in);
		name=s.nextLine();
	}

	public String getName(){
		return name;
	}

	protected void setDetails(){
		setRollNo();
		setName();
	}

}


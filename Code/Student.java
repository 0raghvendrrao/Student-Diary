import java.util.*;
import java.io.*;

public class Student implements Serializable{

	private String rollno="";
	private String name="";
	private ArrayList<Achievement> achieved;
	private Branch stream;
	private Attendance attend;
	private ArrayList<Course> subject;
	private Fee fees;
	private ArrayList<Faculty> teachers;
	private boolean isHonors=false;
	private boolean hasScholarship=false;

	Student(String rollno, String name, String stream){
		if(isRollNo(rollno))
		this.rollno=rollno;
		else
			throw IncorrectRollNoException e;
		this.name = name;
		this.stream = stream;
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

	void setRollNo(){
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

	void setName(){
		Scanner s= new Scanner(System.in);
		name=s.nextLine();
	}

	public String getName(){
		return name;
	}

	void setDetails(){
		setRollNo();
		setName();
	}

	public <Student> ArrayList get(){
    ArrayList<Student> list=new ArrayList<Student>();
    try{
      ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("../files/Student")));
      while(true){
        list.add((Student)in.readObject());
      }
    }
    catch(EOFException e){
      return list;
    }
    catch(IOException e){
      System.out.print("  [*] An Error Occured While Reading the Student");
      System.out.println(" Please ensure that you enter names first!");
      return list;
    }
    catch(ClassNotFoundException e){
      System.out.println("*****Error ! Class is missing !*****");
      return list;
    }
  }

  public static void put(ArrayList<Student> list){
    try{
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("../files/Student"));
      for(Student obj:list){
        out.writeObject(obj);
      }
    }
    catch(IOException e){
      System.out.print("  [*] An Error Occured While Writing to File.");
      System.out.println(" Please ensure that you enter Names first!");
    }
  }

}


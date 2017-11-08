import java.util.*;
import java.io.*;

public class Student extends User implements Serializable{

	ArrayList<Achievement> achieved;
	Branch stream;
	Attendance attend;
    ArrayList<Course> subject;
    ArrayList<Anouncement> ann;
    ArrayList<Fee> fees;
    ArrayList<Faculty> teachers;
    boolean isHonors=false;
    boolean hasScholarship=false;
	//Search Student
	public static Student searchStudent(String rollno){
		ArrayList<Student> temp = new ArrayList<Student>();
		temp = StudentFH.get();
		Iterator it = temp.iterator();
		while (it.hasNext()) {
            Student s = (Student)it.next();
            if (s.getUsername().compareTo(rollno) == 0)
                return s;
        }
                
        return null;
	}
	//Constructor
	Student(String user, String name, Branch stream){
		super(user,name);
		super.addStream(stream);

	}
	//Add
	public void addAnouncement(Anouncement temp){
		ann.add(temp);
	}
	public void addAchievement(Achievement temp){
		achieved.add(temp);
	}
	public void addSubject (Course temp){
		subject.add(temp);
	}
	public void addFee (Fee temp){
		fees.add(temp);
	}
}
// 	createStudent(){
// 		String 
// 	}
// 	getAttendace(){

// 	}

// 	viewAchievement
//     boolean isRollNo(String username){
// 		if(username.length()!=15){
// 			System.out.println("*Roll. No. must be of length 15. Eg:AM.EN.U4CSE16051");
// 			return false;
// 		}
// 		if(username.charAt(2)!='.' || username.charAt(5)!='.'){
// 			System.out.println("Roll. No. Must be of the form AM.EN.U4CSE16051");
// 			return false;

// 		}
// 		return true;
// 	}

// 	void setRollNo(){
// 		Scanner s=new Scanner(System.in);
// 		do{
// 			System.out.print("Enter Roll no. : ");
// 			username = s.next();
// 		}
// 		while(!isRollNo(username));

// 	}
// 	public String getRollNo(){
// 		return username;
// 	}

// 	void setName(){
// 		Scanner s= new Scanner(System.in);
// 		name=s.nextLine();
// 	}

// 	public String getName(){
// 		return name;
// 	}

// 	void setDetails(){
// 		setRollNo();
// 		setName();
// 	}

// 	public <Student> ArrayList get(){
//     ArrayList<Student> list=new ArrayList<Student>();
//     try{
//       ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("../files/Student")));
//       while(true){
//         list.add((Student)in.readObject());
//       }
//     }
//     catch(EOFException e){
//       return list;
//     }
//     catch(IOException e){
//       System.out.print("  [*] An Error Occured While Reading the Student");
//       System.out.println(" Please ensure that you enter names first!");
//       return list;
//     }
//     catch(ClassNotFoundException e){
//       System.out.println("*****Error ! Class is missing !*****");
//       return list;
//     }
//   }

//   public void put(ArrayList<Student> list){
//     try{
//       ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("../files/Student"));
//       for(Student obj:list){
//         out.writeObject(obj);
//       }
//     }
//     catch(IOException e){
//       System.out.print("  [*] An Error Occured While Writing to File.");
//       System.out.println(" Please ensure that you enter Names first!");
//     }
//   }

// }


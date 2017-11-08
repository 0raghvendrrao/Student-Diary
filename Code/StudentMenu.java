import java.util.Scanner;
public class StudentMenu{
	StudentMenu() {
		System.out.println("Enter Roll. no.");
		Scanner s = new Scanner s(System.in);
		String rno = s.nextLine();
		ArrayList<Student> students;
		Student.get(sudents);
		Student curr;
		int flag=0;
		for(Student o: students){
			if(rno.compareTo(o.getRollNo())==0){
				curr = o;
				break;
			}
		}
		if(flag==0){
			System.out.println("User not registered!");
			return;
		}
		while(true){
			System.out.println("1. View attendance");
			System.out.println("2. Announcements");
			System.out.println("4. View courses");
			System.out.println("5. Achievements");
			System.out.println("6. Marks");
			System.out.println("7. Personal Details");
			Scanner s = new Scanner(System.in);
			int i= s.nextInt();

			switch(i){
				case 1: 
				case 2: curr.viewAnnouncement();
				case 3: 
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				default: System.out.println("Try Again!");
			}
	
		}
	
	}
}
import java.util.Scanner;

public class Login{
	public static void LogMeIn() throws ProfileNotReviewedException{
		while(true){
			System.out.println("User Type -");
			System.out.println("1. Student");
			System.out.println("2. Faculty");
			System.out.println("3. Exit ");
			int i ;
			Scanner s = new Scanner(System.in);
			i=s.nextInt();
			switch(i){
				case 1: 
						System.out.print("\n Enter Roll Number :	");
						String rollno = s.next();
						Student std = Student.searchStudent(rollno);
						if(std != null)
							StudentLoginMenu.loginMenu(std);
						else
							System.out.println("Student doesn't exist");
				case 2: 
						System.out.print("\n Enter User Name :	");
						String username = s.next();
						Faculty f = Faculty.searchFaculty(username);
						if(f != null)
						FacultyMenu.facultyMenu(f);
						else
							System.out.println("Faculty doesn't exist");
				case 3: return;
				default: System.out.println("\nTry Again!");
							break;
			}
		}
	}
}
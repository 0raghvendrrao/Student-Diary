import java.util.Scanner;

public class Login{
	public static void LogMeIn(){
		while(true){
			System.out.println("User Type -")
			System.out.println("1. Student");
			System.out.println("2. Faculty");
			System.out.println("3. Exit ");
			int i ;
			Scanner s = new Scanner(System.in);
			i=s.nextInt();
			switch(i){
				case 1: 
						System.out.print("\n Enter Roll Number :	");
						String rollno = i.next();
						Student std = Student.searchStudent(rollno);
						if(std != null)
							studentLoginMenu.loginMenu(std);
				case 2: 
						Sytem.out.print("\n Enter User Name :	");
						String username = i.next();
						FacultyMenu.facultyMenu();
				case 3: return;
				default: System.out.println("Try Again!");
			}
		}
	}
}
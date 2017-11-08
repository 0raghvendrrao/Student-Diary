import java.util.Scanner;

public class AdministratorMenu{
	Login(){
		while(true){
			System.out.println("Select Action -")
			
			System.out.println("1. Add Course");
			System.out.println("2. Add Branch");
			System.out.println("3. ")
			int i ;
			Scanner s = new Scanner(System.in);
			i=s.nextInt();
			switch(i){
				case 1: StudentMenu log = new StudentMenu();
				case 2: FacultyMenu log = new FacultyMenu();
				case 3: return;
				default: System.out.println("Try Again!");
			}
		}
}
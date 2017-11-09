import java.util.*;
class CoursesMenuStudent{
	public static void CoursesMenu(Student s){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("1. View courses.\n2. Back");
			int i = sc.nextInt();
			switch(i){
				case 1:s.printCources();
						break;

				default: return;
			}

		}
	}

}
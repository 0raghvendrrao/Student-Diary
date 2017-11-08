import java.util.*;
import java.io.*;
class StudentLoginMenu{
	public static void loginMenu (Student s){
		while(true){
			System.out.println("Welcome "+s.getName());
			System.out.println("1. Academics \n2. Finance \n3.Personal Details \n4. Back ");
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
		                AcademicMenuStudent.AcademicMenu(s);
                        break;

                case 2:
	                    FinancesMenuStudent.FinancesMenu(s);
                        break;

                case 3:
                        PersonalDetailsMenuStudent.PersonalDetailsMenu(s);
                        break;

                case 4:
                        return;

                
                default:
                        break;
            }
		}
	}
}

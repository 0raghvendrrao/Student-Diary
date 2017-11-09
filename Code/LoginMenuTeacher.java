import java.util.*;
import java.io.*;

public class LoginMenuTeacher
{
        public static void LoginMenu() throws InvalidSemesterException, ProfileNotReviewedException, Exception
        {
                while(true)
                {
                        System.out.println("1. Add Student\n2. Academic Menu\n3. Financial Menu\n4. Personal Details Menu\n5. Remove Student\n6. Exit");
                        Scanner sc = new Scanner(System.in);
                        int ch = sc.nextInt();

                        switch(ch)
                        {
                                case 1:
                                        System.out.print("Enter name: ");
                                        String name = sc.next();

                                        System.out.print("Enter roll number: ");
                                        String roll = sc.next();

                                        System.out.print("Enter phone number: ");
                                        String phoneNo = sc.next();

                                        System.out.print("Enter address: ");
                                        String address = sc.next();

                                        Student s = new Student(name, roll, phoneNo, address);
                                        s.writeInfo();
                                        s.reviewed = true;
                                        break;

                                case 2:
                                        System.out.print("Enter the roll number: ");
                                        String rollno = sc.next();

                                        AcademicMenuTeacher.AcademicMenu(rollno);
                                        break;

                                case 3:
                                        System.out.print("Enter the roll number: ");
                                        rollno = sc.next();

                                        FinancesMenuTeacher.FinancesMenu(rollno);
                                        break;

                                case 4:
                                        System.out.print("Enter the roll number: ");
                                        rollno = sc.next();

                                        PersonalDetailsMenuTeacher.PersonalDetailsMenu();
                                        break;

                                case 6:
                                        return;

                                default:
                                        break;
                        }
                }
        }
}

import java.io.*;
import java.util.*;

public class AcademicMenuStudent// implements AcademicMenu
{
        public static void AcademicMenu (Student s) throws ProfileNotReviewedException, CourseNotFoundException, Exception
        {
                //Student s = Student.searchStudent(rollno);

                while(true)
                {
                        System.out.println("1. Print Details\n2. Achievements Menu\n3. Courses Menu\n4. Attendance Menu\n5. View CGPA\n6. Exit");
                        Scanner sc = new Scanner(System.in);

                        int ch = sc.nextInt();
                        switch(ch)
                        {
                                case 1:
                                        s.printAcademicDetails();
                                        break;

                                case 2:
                                        AchievementsMenuStudent.AchievementsMenu(s);

                                case 3:
                                        CoursesMenuStudent.CoursesMenu(s);
                                        break;

                                case 4:
                                        System.out.println("Enter course code: ");
                                        String c = sc.next();

                                        AttendanceMenuStudent.AttendanceMenu(c, s);
                                        break;

                                case 5:
                                        double cgpa = s.calcCGPA();
                                        System.out.println(cgpa);
                                        break;

                                case 6:
                                        return;

                                default:
                                        break;
                        }
                }
        }
}

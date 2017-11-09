import java.io.*;
import java.util.*;

public class FinancesMenuTeacher
{
        public static void FinancesMenu(String rollno) throws InvalidSemesterException, Exception
        {
                Student s = Student.searchStudent(rollno);
                
                while(true)
                {
                        System.out.println("1. Set fees\n2. Add Fine\n3. Add Scholarship\n4. Set Fees Paid\n5. Print Details\n6. Exit");
                        Scanner sc = new Scanner(System.in);

                        int ch = sc.nextInt();
                        switch(ch)
                        {
                                case 1:
                                        int[] fees = new int[8];
                                        for(int i=0; i<8; i++)
                                        {
                                                System.out.print("Enter fees for Semester#" + i+1);
                                                fees[i] = sc.nextInt();
                                        }
                                        s.f.setFees(fees);
                                        break;

                                case 2:
                                        System.out.print("Enter fine amount: ");
                                        int fine = sc.nextInt();
                                        s.f.addFine(fine);
                                        break;

                                case 3:
                                        System.out.print("Enter scholarship name: ");
                                        String name = sc.next();

                                        System.out.print("Enter scholarship amount: ");
                                        int amount = sc.nextInt();

                                        s.f.addScholarship(name, amount);
                                        break;

                                case 4:
                                        System.out.println("Enter the semester for the fees: ");
                                        int sem = sc.nextInt();
                                        if (sem < 1 || sem > 8)
                                                throw new InvalidSemesterException();

                                        s.f.setFeesPaid(sem);
                                        break;

                                case 5:
                                        s.f.printDetails();
                                        break;

                                case 6:
                                        return;

                                default:
                                        break;

                        }
                }
        }
}

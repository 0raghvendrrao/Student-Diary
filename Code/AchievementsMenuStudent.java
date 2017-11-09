import java.util.*;
import java.io.*;

public class AchievementsMenuStudent{
	public static void AchievementsMenu(Student s){
		while(true){
			System.out.println("1.View Achievements\n2.Back");
			Scanner sc = new Scanner(System.in);
			int i=sc.nextInt();
			switch(i){
				case 1:
						s.printAchievement();
						break;
				case 2: return;
				default: System.out.println("Invalid Input!");

			}
		}
	}
}
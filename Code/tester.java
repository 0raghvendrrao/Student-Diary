import java.util.Scanner;
class tester{

	public static void main(String[] args) {
		while(true){
			System.out.println("1. Login");
			System.out.println("2. Register");
			System.out.println("3. Exit");
			int i ;
			Scanner s = new Scanner(System.in);
			i=s.nextInt();
			switch(i){
				case 1: Login.LogMeIn();
						break;
				case 2: Register.RegisterMe();
						break;
				case 3: return;
				default: System.out.println("Try Again!");
			}
		}
	}	
}
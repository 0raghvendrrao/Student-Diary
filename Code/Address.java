import java.util.*;
import java.io.*;

public class Address {
	 String place = "";
	 String district = "";
	 String state = "";
	 String country = "";
	 String Zip = "";
	 String phone;
	Address(String place, String district , String state , String country, String Zip, String phone){
		this.place = place;
		this.district = district;
		this.state = state;
		this.country = country;
		this.Zip = Zip;
		this.phone = phone;
	}
	public void putAddress(){
		Scanner s = new Scanner(System.in);
		String str;
		System.out.println("****Leave the fields empty to keep it unchanged****");
		System.out.print("Enter Place:");
		str = s.nextLine();
		if(str.length()!=0)
			this.place = str;
		System.out.println();
		System.out.print("Enter District:");
		str = s.nextLine();
		if(str.length()!=0)
			this.district = str;
		System.out.println();
		System.out.print("Enter State:");
		str = s.nextLine();
		if(str.length()!=0)
			this.state = str;
		System.out.println();
		System.out.print("Enter Zip:");
		str = s.nextLine();
		if(str.length()!=0)
			this.Zip = str;
		System.out.println();

	}
	public String toString(){
		return "Place: "+place+" District: "+district+" State: "+" Country: "+country + "Pincode: "+Zip;
	}
}

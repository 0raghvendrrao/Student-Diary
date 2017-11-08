import java.util.*;
import java.io.*;

public class User implements Serializable{
	 String username="";
	 String name="";
	 Branch stream=null;
	 Address address=null;
//Constructor:
	User(String username, String name){
		this.username = username;
		this.name = name;
	}
	//Get:
	public String getName(){
		return name;
	} 
	public Address getAddress(){
		return address;
	}
	public String getUsername(){
		return username;
	}
	public Branch getStream(){
		return stream;
	}
	//Add:
	public void addStream(Branch b){
		stream = b;
	}
	public void addAddress(Address ad){
		address = ad;
	}
	public String toString(){
		return "Name: "+ getName() + " Username: "+getUsername()+"Branch: "+getStream()+"\nAddress: "+address.toString();
	}
}
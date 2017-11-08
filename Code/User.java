import java.util.*;
import java.io.*;

public class User implements Serializable{
	private String username="";
	private String name="";
	private Branch stream;
	private Address address;

	User(String username, String name){
		this.username = username;
		this.name = name;
	}
	public String getName(){
		return name;
	} 
}
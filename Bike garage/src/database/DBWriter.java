package database;

import interfaces.Database;

>>>>>>> 79dcf206b2fea35b57fcbfa20cc88ecacd075541
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.esotericsoftware.yamlbeans.YamlReader;
import com.esotericsoftware.yamlbeans.YamlWriter;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.List;


public class DBWriter {
	
	public static void write() throws IOException{
=======
import java.util.HashMap;
import java.util.List;


public class DBWriter implements Database {
	
	private HashMap<String,User> users;
	private HashMap<String,Bike> bikes;
	
	public DBWriter() {
		// Load from txt file
		users = new HashMap<String,User>();
		bikes = new HashMap<String,Bike>();
		// ...
	}
	
	public static void write() throws IOException{
		/*
>>>>>>> 79dcf206b2fea35b57fcbfa20cc88ecacd075541
		List<String> list = new ArrayList<String>();
		list.add("bike1");
		User user = new User("bajs", "sevensson", "123", "456", list);
		

		
>>>>>>> 79dcf206b2fea35b57fcbfa20cc88ecacd075541
		list.add("bike2");
		User user2 = new User("adsf", "sevensson", "123", "456", list);
		
		YamlWriter writer = new YamlWriter(new FileWriter("output.yml"));

		writer.getConfig().setPrivateFields(true);
		writer.write(user);
		writer.write(user2);
		writer.close();
		
		YamlReader reader = new YamlReader(new FileReader("output.yml"));


		Object object = reader.read();
		User temp = (User)object;
		System.out.println(temp.getName());
		
		Object object2 = reader.read();
		User temp2 = (User)object2;
<<<<<<< HEAD
		System.out.println(temp2.getName());

=======
		System.out.println(temp2.getName());*/

	}

	@Override
	public boolean AddUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean RemoveUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean AddBike(User user, String ID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean RemoveBike(User user, String ID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Bike SearchBike(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User SearchUserName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User SearchUserPin(String pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User SearchUserSSN(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}
}

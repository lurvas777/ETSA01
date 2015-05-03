package interfaces;

import java.util.List;

import database.User;

/**
 * Interface for database. The implemented database can be anything, SQL or a simple
 * 
 * @author lurvas
 *
 */
public interface Database {

	public boolean AddUser(User user);
	
	public boolean RemoveUser(User user);
	
	public boolean AddBike(User user, String ID);
	
	public boolean RemoveBike(User user, String ID);
	
	public User SearchUser(String name);
	
	public List<String> SearchBike(String ID);
	
}

package interfaces;

import java.util.List;

import database.User;

/**
 * Interface for database. The implemented database can be anything, SQL or a simple
 * 
 * @author lurvas
 */
public interface Database {

	/**
	 * 
	 * 
	 * @param user The user object to be added.
	 * @return True if successful.
	 */
	public boolean AddUser(User user);
	
	/**
	 * 
	 * @param user The user object to be removed.
	 * @return True if successful.
	 */
	public boolean RemoveUser(User user);
	
	/**
	 * 
	 * 
	 * @param user The user which to add the bike to.
	 * @param ID The String ID to add to the user.
	 * @return True if successful.
	 */
	public boolean AddBike(User user, String ID);
	
	public boolean RemoveBike(User user, String ID);
	
	public User SearchUser(String name);
	
	public List<String> SearchBike(String ID);
	
}

package interfaces;

import java.util.List;

<<<<<<< HEAD
=======
import database.Bike;
>>>>>>> 79dcf206b2fea35b57fcbfa20cc88ecacd075541
import database.User;

/**
 * Interface for database. The implemented database can be anything, SQL or a simple
 * 
 * @author lurvas777
 */
public interface Database {

	/**
	 * Add info from the User object into the database.
	 * 
	 * @param user The user object to be added.
	 * @return True if successful.
	 */
	public boolean AddUser(User user);
	
	/**
	 * Remove user from database that corresponds to the User object.
	 * 
	 * @param user The user object to be removed.
	 * @return True if successful.
	 */
	public boolean RemoveUser(User user);
	
	/**
	 * Add a bike to the given user in the database, identified by the bike ID.
	 * 
	 * @param user The user which to add the bike to.
	 * @param ID The String ID to add to the user.
	 * @return True if successful.
	 */
	public boolean AddBike(User user, String ID);
	
	/**
	 * @param user User object corresponding to the user in the database.
	 * @param ID 
	 * @return True if successful.
	 */
	public boolean RemoveBike(User user, String ID);
	
	/**
	 * @param name String containing the name of the user in the database.
	 * @return User object containing the User. If non is found, null is returned.
	 */
	public User SearchUserName(String name);
	
	public User SearchUserPin(String pin);
	
	public User SearchUserSSN(String ssn);
	
	
	
	/**
	 * @param ID String containing the ID of the bike, 
	 * @return User that has the bike ID registered in the database. If non is found, null is returned.
	 */
	public Bike SearchBike(String ID);
	
}

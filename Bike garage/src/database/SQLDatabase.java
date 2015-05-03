package database;

import java.util.List;

import interfaces.Database;

public class SQLDatabase implements Database{

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
	public User SearchUser(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> SearchBike(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

}

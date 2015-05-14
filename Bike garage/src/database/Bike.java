package database;

public class Bike {
	private String name;
	private User owner;
	private int currentGaragePid; // -1 if not parked in any garage
	
	public Bike(String name, User owner) {
		this.name = name;
		this.owner = owner;
		currentGaragePid = -1;
	}
	
	public boolean isParked() {
		return currentGaragePid > 0;
	}
	
	public boolean isParkedInGarage(int garagePid) {
		return currentGaragePid == garagePid;
	}
	
	public String getName() {
		return name;
	}
	
	public User getOwner() {
		return owner;
	}
	
	public int getCurrentGaragePid() {
		return currentGaragePid;
	}
	
	public void setCurrentGaragePid(int garagePid) {
		currentGaragePid = garagePid;
	}
}




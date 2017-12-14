package sk.cyklosoft.java8.data;

import java.util.Optional;

public class UserData {
	
	private Optional<User> userOpt = null;
	private User user = null;
	
	public UserData() {
		Climbing climbing = new Climbing();
		climbing.setRoute("via");
		climbing.setGrade("6a");
		Optional<Climbing> climbingOpt = Optional.ofNullable(climbing);
		
		Sport sport = new Sport();
		sport.setClimbing(climbingOpt);
		Optional<Sport> sportOpt = Optional.ofNullable(sport);
		user= new User();
		user.setSport(sportOpt);
	}
	
	public Optional<User> getUserOpt() {
		return userOpt;
	}
	
	public User getUser() {
		return user;
	}


}

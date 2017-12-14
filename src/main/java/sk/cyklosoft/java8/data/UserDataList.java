package sk.cyklosoft.java8.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDataList {
	
	private Optional<User> userOpt = null;
	private User user = null;
	
	public UserDataList() {
		Climbing climbing = new Climbing();
		climbing.setRoute("via");
		climbing.setGrade("6a");
		List<Climbing> climbingList = new ArrayList<>();
		climbingList.add(climbing);
		Climbing climbing7a = new Climbing();
		climbing7a.setRoute("via");
		climbing7a.setGrade("7a");
		climbingList.add(climbing7a);
		Optional<List<Climbing>> climbingOpt = Optional.ofNullable(climbingList);
		
		
		SportList sport = new SportList();
		sport.setClimbing(climbingOpt);
		Optional<SportList> sportOpt = Optional.ofNullable(sport);
		user= new User();
		user.setSportList(sportOpt);
	}
	
	public Optional<User> getUserOpt() {
		return userOpt;
	}
	
	public User getUser() {
		return user;
	}


}

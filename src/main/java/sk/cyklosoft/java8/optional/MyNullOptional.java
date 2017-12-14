package sk.cyklosoft.java8.optional;

import java.util.Optional;

import sk.cyklosoft.java8.data.Climbing;
import sk.cyklosoft.java8.data.Sport;
import sk.cyklosoft.java8.data.User;
import sk.cyklosoft.java8.data.UserData;

public class MyNullOptional {
	Optional<User> user = Optional.empty();

	public static void main(String[] args) {
		MyNullOptional myNullOptional = new MyNullOptional();
		System.out.println("empty: "+myNullOptional.user);
		
		System.out.println("ofNullable: "+Optional.ofNullable(getUserDataNull()));
		
		myNullOptional.user = Optional.ofNullable(getUserData());
		System.out.println("of: "+myNullOptional.user);
		
		
		String grade = myNullOptional.getGrade(myNullOptional.user, "via");
		System.out.println("grade: "+grade);
	}

	private static User getUserDataNull() {
		return null;
	}

	private static User getUserData() {
		return new UserData().getUser();
	}

	private String getGrade(Optional<User> user, String via) {
		return user.flatMap(User::getSport)
				.flatMap(Sport::getClimbing)
				.map(Climbing::getGrade)
				.orElse("0");
	}

}

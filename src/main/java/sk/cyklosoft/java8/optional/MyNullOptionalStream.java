package sk.cyklosoft.java8.optional;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Optional;

import sk.cyklosoft.java8.data.Climbing;
import sk.cyklosoft.java8.data.Sport;
import sk.cyklosoft.java8.data.SportList;
import sk.cyklosoft.java8.data.User;
import sk.cyklosoft.java8.data.UserDataList;

public class MyNullOptionalStream {
	Optional<User> user = Optional.empty();

	public static void main(String[] args) {
		MyNullOptionalStream myNullOptional = new MyNullOptionalStream();
		System.out.println("empty: "+myNullOptional.user);
		
		System.out.println("ofNullable: "+Optional.ofNullable(getUserDataNull()));
		
		myNullOptional.user = Optional.ofNullable(getUserData());
		System.out.println("of: "+myNullOptional.user);
		
		Optional<List<Climbing>> climbingList = myNullOptional.getClibming(myNullOptional.user, "via");
		List<Climbing> list = climbingList.get();
		List<String> grades = list.stream()
				.filter(c -> c.getRoute().equals("via"))
				.map(Climbing::getGrade)
				.collect(toList());
		grades.forEach(System.out::println);
	}

	private static User getUserDataNull() {
		return null;
	}

	private static User getUserData() {
		return new UserDataList().getUser();
	}
	
	private Optional<List<Climbing>> getClibming(Optional<User> user, String via) {
		return user.flatMap(User::getSportList)
				.flatMap(SportList::getClimbing);
	}


	/*private List<String> getGrade(Optional<User> user, String via) {
		return user.flatMap(User::getSportList)
				.flatMap(SportList::getClimbing)
				.map(c -> c.stream())
				.filter(c -> c.)
				.orElse("0");
	}*/

}

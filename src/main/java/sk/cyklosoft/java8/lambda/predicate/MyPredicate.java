package sk.cyklosoft.java8.lambda.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import sk.cyklosoft.java8.data.Address;

public class MyPredicate {
	
	public static Predicate<Address> lowNumber() {
		return a -> a.getNumber() < 3;
	}
	
	public static List<Address> filterAddresses (List<Address> addresses, Predicate<Address> predicate) {
		return addresses.stream().filter( predicate ).collect(Collectors.<Address>toList());
	}
	
	public static Predicate<String> isNotValidEmailAddress() {
		return a -> !a.contains("2");
	}

}

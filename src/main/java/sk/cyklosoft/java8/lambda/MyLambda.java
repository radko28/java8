package sk.cyklosoft.java8.lambda;

import static java.util.stream.Collectors.toList;

import java.util.List;

import sk.cyklosoft.java8.data.Address;
import sk.cyklosoft.java8.data.AddressData;
import sk.cyklosoft.java8.lambda.predicate.MyPredicate;

public class MyLambda {

	public static void main(String[] args) {
		AddressData addressData = new AddressData();
		List<Address> addressList = addressData.getAddress();
		List<Address> lowAddressList = MyPredicate.filterAddresses(addressList, MyPredicate.lowNumber());
		
		List<String> towns = lowAddressList.stream()
				.map(Address::getTown)
				.collect(toList());
		
		towns.forEach(System.out::println);
	}

}

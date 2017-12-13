package sk.cyklosoft.java8.stream;

import java.util.List;

import static java.util.stream.Collectors.toList;
import sk.cyklosoft.java8.data.Address;
import sk.cyklosoft.java8.data.AddressData;

public class MyStream {

	public static void main(String[] args) {
		AddressData addressData = new AddressData();
		List<Address> addressList = addressData.getAddress();
		List<String> towns = addressList.stream()
				.filter(a -> a.getNumber() > 5)
				.map(Address::getTown)
				.collect(toList());
		
		towns.forEach(System.out::println);
	}

}

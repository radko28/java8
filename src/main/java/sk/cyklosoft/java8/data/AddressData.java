package sk.cyklosoft.java8.data;

import java.util.ArrayList;
import java.util.List;

public class AddressData {
	
	private List<Address> addressList = new ArrayList<>();
	
	public AddressData() {
		for(int i = 1; i <= 10; i++) {
			Address address = new Address();
			address.setName("rado_" +i);
			address.setStreet("street_" +i);
			address.setNumber(i);
			address.setTown("town_" + i);
			addressList.add(address);
		}
	}
	

	public List<Address> getAddress() {
		return addressList;
	}
	
	public String getNames() {
		String names = "\"aaaa \"<rado 1>;bbbbbbb ,cccc,acccc<rado 2>;ddddd<rado 3>;rad,ko <rado 4>";
		return 	names;
	}
	
	public String getNamesOrig() {
		String names = "\"aaaa \"<rado 1>,bbbbbbb ,cccc,acccc<rado 2>,ddddd<rado 3>,rad,ko <rado 4>";
		return 	names;
	}


}

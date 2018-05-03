package sk.cyklosoft.stream.split;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import sk.cyklosoft.java8.data.AddressData;
import sk.cyklosoft.java8.lambda.predicate.MyPredicate;

public class MySplitArray {

	public static void main(String[] args) {
		
		AddressData addressData = new AddressData();
		String namesOrig = addressData.getNamesOrig();
		List<String> namesList = Stream.of(namesOrig.split(">,")).map(a -> a.concat(">").replace(">>", ">")).collect(toList());
		namesList.forEach(System.out::println);

		String names = addressData.getNames();
		//List<String> namesList = Stream.of(names.split(";")).filter(MyPredicate.isNotValidEmailAddress()).map(a ->a.replace(">", "&gt")).collect(Collectors.joining(", "));
//		String result = Stream.of(names.split(";")).filter(MyPredicate.isNotValidEmailAddress()).map(a ->a.replace(">", "&gt")).collect(Collectors.joining(","));
		String result = Stream.of(namesOrig.split(">,")).map(a -> a.concat(">").replace(">>", ">")).filter(MyPredicate.isNotValidEmailAddress()).map(a ->a.replace(">", "&gt")).collect(Collectors.joining(","));
//		String result = String.join(", ", namesList);
		System.out.println(result);
		

	}
}
package sk.cyklosoft.groupBy;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import sk.cyklosoft.groupBy.data.Cost;
import sk.cyklosoft.groupBy.data.SignumType;

public class GroupByMain {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		
		List<Cost> costs = Arrays.asList(
				new Cost(1,today,SignumType.INVOICE),
				new Cost(2,today,SignumType.INVOICE),
				new Cost(3,today,SignumType.CANCEL),
				new Cost(4,today,SignumType.CANCEL),
				new Cost(5,tomorrow,SignumType.INVOICE),
				new Cost(6,tomorrow,SignumType.INVOICE),
				new Cost(7,today,SignumType.INVOICE)
				);
		Map<Boolean, Map<LocalDate,Integer>> costsPerSignumAndDate = costs.stream()
				  .collect(	
						  Collectors.partitioningBy(Cost::getSignum,
								  Collectors.groupingBy(Cost::getDate,Collectors.summingInt(Cost::getAmount))));
		System.out.println(costsPerSignumAndDate);

		

	}

}

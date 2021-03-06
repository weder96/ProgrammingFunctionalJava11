package features.streams;

import features.repo.Company;
import features.repo.CompanyRepository;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterCompanyExample {
	
	static Predicate<Company> p1 = per -> per.getQtyEmployee() >= 100000;
	static Predicate<Company> p2 = per -> per.getPositionRanking() > 3;

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sam","Anderson","Peter","Nancy");
		Stream<String> allNames = names.stream();
		Stream<String> updatesList = allNames.filter(s -> s.length() > 3);
		updatesList.forEach(System.out :: println);
		names.stream().filter(s-> s.length()>3).collect(Collectors.toList()).forEach(System.out :: println);
		
		CompanyRepository.getAllCompanies()
		.stream()
		.filter(p1.and(p2))
		//.filter(p2)
		.collect(Collectors.toList()).forEach(System.out :: println);
		
		List<Company> l1 = CompanyRepository.getAllCompanies()
				.stream()
				.filter(per -> per.getQtyEmployee() >= 100000)
				.collect(Collectors.toList());
		l1.forEach(System.out :: println);
		
		
	}

}

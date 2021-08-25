package features.default_methods;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import features.repo.Company;
import features.repo.CompanyRepository;

public class DefaultMethodExample {

	public static void main(String[] args) {
		List<String> nameList = CompanyRepository.getAllCompanies()
				.stream().map(Company :: getName).collect(Collectors.toList());
		nameList.forEach(name -> System.out.printf("%s ",name));
		System.out.println("Before Sort ==============");

		Collections.sort(nameList);
		nameList.forEach(name -> System.out.printf("%s ",name));
		System.out.println("After Sort ==============");

		nameList.sort(Comparator.naturalOrder());
		nameList.forEach(name -> System.out.printf("%s ",name));
		System.out.println("Natural Order ==============");

		nameList.sort(Comparator.reverseOrder());
		nameList.forEach(name -> System.out.printf("%s ",name));
		System.out.println("Reverse Order ==============");
	}

}

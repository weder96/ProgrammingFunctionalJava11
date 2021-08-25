package features.optional;

import features.repo.Address;
import features.repo.Company;
import features.repo.CompanyRepository;

import java.util.Optional;

public class OptionalMapCompanyExample {
	public static void main(String[] args) {
		optionalMapCompanyExample();
		optionalFlatMapExample();
		optionalMapFilterExample();
	}
	static void optionalMapCompanyExample() {
		Optional<Company> per = CompanyRepository.getCompanyOptional();
		per.ifPresent(Company -> {
			String name = per.map(features.repo.Company::getName).orElse("No Data Found");
			System.out.println("Name :"+name);
		} );
	}
	static void optionalFlatMapExample() {
		Optional<Company> per = CompanyRepository.getCompanyOptional();
		if(per.isPresent()) {
			Optional<Address> add = per.flatMap(Company :: getAddress);
			System.out.println("Address :"+add.get());
		}
	}
	static void optionalMapFilterExample() {
		Optional<Company> per = CompanyRepository.getCompanyOptional().filter(Company -> Company.getQtyEmployee() >=100000);
		per.ifPresent(Company -> System.out.println(Company.getAddress().get()));
	}
}

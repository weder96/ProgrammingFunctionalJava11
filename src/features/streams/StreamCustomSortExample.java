package features.streams;

import java.util.Comparator;

import features.repo.Person;
import features.repo.PersonRepository;

public class StreamCustomSortExample {

	public static void main(String[] args) {
		System.out.println("Sort By Name");
		PersonRepository.getAllPersons().stream()
		.sorted(Comparator.comparing(Person :: getName))
		.forEach(System.out::println);
		
		System.out.println("Sort By Height");
		PersonRepository.getAllPersons().stream()
		.sorted(Comparator.comparing(Person :: getHeight))
		.forEach(System.out::println); 
		
		System.out.println("Reverse Sort By Name");
		PersonRepository.getAllPersons().stream()
		.sorted(Comparator.comparing(Person :: getName).reversed())
		.forEach(System.out::println);
	}

}

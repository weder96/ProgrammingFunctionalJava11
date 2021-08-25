package features.repo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
	public static List<Person> getAllPersons() {
		Person p1 = new Person("Isaac", 165, 2860, "Male", 2, Arrays.asList("Soccer", "Swimming", "Tennis"));
		Person p2 = new Person("Angel", 158, 5900, "Female", 2, Arrays.asList("Driving", "Music", "Football"));
		Person p3 = new Person("Dean", 140, 5900, "Male", 2, Arrays.asList("Cricket", "Soccer", "Tennis"));
		Person p4 = new Person("Nancy", 130, 4200, "Female", 2, Arrays.asList("Cricket", "Swimming", "Soccer"));
		Person p5 = new Person("Sttefanny", 125, 9000, "Female", 2, Arrays.asList("Football", "Swimming", "Tennis"));
		Person p6 = new Person("John", 110, 12500, "Male", 2, Arrays.asList("Cricket", "Soccer", "Tennis"));
		Person p7 = new Person("Campell", 165, 1048, "Male", 1, Arrays.asList("Swimming", "Soccer", "Tennis"));
		return Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
	}

	public static Person getPerson() {
		return new Person("Peter", 174, 8000, "Male", 2, Arrays.asList("Soccer", "Swimming", "Tennis"));
	}
	
	public static Optional<Person> getPersonOptional() {
		Person per = getPerson();
		per.setAddress(Optional.of(new Address("7 th Block", "Ashburn", "Virginia", "USA", 20090)));
		return Optional.of(per);
	}

}

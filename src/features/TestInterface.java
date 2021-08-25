package features;

@FunctionalInterface
public interface TestInterface {
	public void add();

	default String sayHello() {
		return "Hello";
	}
	
	static boolean isValid() {
		return true;
	}
}

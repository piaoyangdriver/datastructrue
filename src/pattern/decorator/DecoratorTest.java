package pattern.decorator;

public class DecoratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable decorator = new Decorator(source);
		decorator.method();
	}

}

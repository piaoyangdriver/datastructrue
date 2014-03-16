package pattern.decorator;

/**
 * 被装饰类
 * @author hp
 *
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the original method!");		
	}
	

}

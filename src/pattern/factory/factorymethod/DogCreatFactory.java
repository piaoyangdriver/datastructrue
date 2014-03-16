/**
 * 
 */
package pattern.factory.factorymethod;

import pattern.factory.simple.Animal;
import pattern.factory.simple.Dog;

/**
 * @author hp
 *
 */
public class DogCreatFactory implements CreatFactoryInterface {

	/* (non-Javadoc)
	 * @see pattern.factory.factorymethod.CreatFactoryInterface#getInstance()
	 */
	@Override
	public Animal getInstance() {
		return new Dog();
	}

}

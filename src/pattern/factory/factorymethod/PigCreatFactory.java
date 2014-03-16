package pattern.factory.factorymethod;

import pattern.factory.simple.Animal;
import pattern.factory.simple.Pig;

public class PigCreatFactory implements CreatFactoryInterface {

	@Override
	public Animal getInstance() {
		return new Pig();
	}

}

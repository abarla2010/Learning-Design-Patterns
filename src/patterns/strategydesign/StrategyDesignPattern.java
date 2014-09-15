package patterns.strategydesign;

/**
 * Class to demonstrate the strategy design pattern
 */
public class StrategyDesignPattern {

	public static void main(String[] args){

		Animal animal = new Animal();
		Dog dog = new Dog();
		Eagle eagle = new Eagle();
		CantFly cantFly = new CantFly();
		CanFly canFly = new CanFly();

		animal.setName("Generic Animal");
		dog.setName("Scooby");
		eagle.setName("Falco");

		System.out.println(dog.makeSound());
		System.out.println(dog.tryToFly());
		System.out.println(eagle.makeSound());
		System.out.println(eagle.tryToFly());
		System.out.println("Now, hypothetically making the dog fly!");
		dog.setFly(new CanFly());
		System.out.println(dog.tryToFly());


	}

}

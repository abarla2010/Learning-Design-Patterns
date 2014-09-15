package patterns.strategydesign;

/**
 * Created by abhishekbarla on 10/27/16.
 */
public class Dog extends Animal {

	/**
	 * Empty Constructor
	 */
	public Dog(){
		super();
		setSound("Bark");
		flyingAbility = new CantFly();
	}
}

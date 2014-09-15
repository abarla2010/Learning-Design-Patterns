package patterns.strategydesign;

/**
 * Dog class
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

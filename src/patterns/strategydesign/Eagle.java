package patterns.strategydesign;

/**
 * Eagle class
 */
public class Eagle extends Animal {

	/**
	 * Empty Constructor
	 */
	public Eagle(){
		super();
		setSound("Swish");
		flyingAbility = new CanFly();
	}
}

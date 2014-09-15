package patterns.strategydesign;

/**
 * Created by abhishekbarla on 10/27/16.
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

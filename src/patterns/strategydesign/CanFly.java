package patterns.strategydesign;

/**
 * CanFly class
 */
public class CanFly implements FlyingAbility {

	@Override
	public String fly(){
		return "I can fly!";
	}
}

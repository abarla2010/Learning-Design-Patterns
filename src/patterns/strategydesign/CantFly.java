package patterns.strategydesign;

/**
 * CantFly class
 */
public class CantFly implements FlyingAbility {

	@Override
	public String fly(){
		return "I can't fly!";
	}
}

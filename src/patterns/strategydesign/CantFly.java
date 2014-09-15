package patterns.strategydesign;

/**
 * Created by abhishekbarla on 10/28/16.
 */
public class CantFly implements FlyingAbility {

	@Override
	public String fly(){
		return "I can't fly!";
	}
}

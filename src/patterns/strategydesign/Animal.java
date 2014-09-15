package patterns.strategydesign;

/**
 * Created by abhishekbarla on 10/27/16.
 */
public class Animal {

	private String name;
	private int weightInPounds;
	private double heightInFeet;
	private String sound;
	public FlyingAbility flyingAbility;

	/**
	 * Empty Constructor
	 */
	public Animal(){
	}

	/**
	 * Getter method for name
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter method for weightInPounds
	 * @return
	 */
	public int getWeightInPounds() {
		return weightInPounds;
	}

	/**
	 * Setter method for weightInPounds
	 * @param weightInPounds
	 */
	public void setWeightInPounds(int weightInPounds) {
		this.weightInPounds = weightInPounds;
	}

	/**
	 * Getter method for heightInFeet
	 * @return
	 */
	public double getHeightInFeet() {
		return heightInFeet;
	}

	/**
	 * Setter method for heightInFeet
	 * @param heightInFeet
	 */
	public void setHeightInFeet(double heightInFeet) {
		this.heightInFeet = heightInFeet;
	}

	/**
	 * Getter for variable sound
	 * @return
	 */
	public String getSound() {
		return sound;
	}

	/**
	 * Setter for sound
	 * @param sound
	 */
	public void setSound(String sound) {
		this.sound = sound;
	}

	/**
	 * Getter for property 'flyingAbility'.
	 *
	 * @return Value for property 'flyingAbility'.
	 */
	public FlyingAbility getFlyingAbility() {
		return flyingAbility;
	}

	/**
	 * Setter for property 'flyingAbility'.
	 *
	 * @param flyingAbility Value to set for property 'flyingAbility'.
	 */
	public void setFly(FlyingAbility flyingAbility) {
		this.flyingAbility = flyingAbility;
	}

	/**
	 * Method to makeSound
	 */
	public String makeSound(){
		String soundString = "";
		soundString = getName() + " says,\"I " + getSound() + "!\"";
		return soundString;
	}

	/**
	 * Method tryToFly
	 * @return
	 */
	public String tryToFly(){
		String flyString = "";
		flyString = getName() + " says,\"" + getFlyingAbility().fly() + "!\"";
		return flyString;
	}

}

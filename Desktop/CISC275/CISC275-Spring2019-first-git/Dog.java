
public class Dog extends Animal{
	
	private String name;
	private int legs;
	
	public Dog(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}

	public int getLegs() {
		return legs;
	}
	
	public String toString() {
		return this.name + " " + this.legs;
	}
	
}

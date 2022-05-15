package week2.ZooKeeperOne;

public class Gorilla extends Mammal {
    public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	public void throwSomething() {
		System.out.println("Take this banana");
		energyLevel -= 5;
	}
	public void eatBananas() {
		System.out.println("I love bananas yum");
		energyLevel += 10;
	}
	public void climb() {
		System.out.println("I have made it to the top of the tree");
		energyLevel -= 10;
	}
}

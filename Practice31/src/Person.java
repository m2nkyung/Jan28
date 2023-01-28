public class Person {
	private int weight, height;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public boolean isTallerThan(Person aPerson) {
		if(height > aPerson.height) {
			return true;
		} else {
			return false;
		}
	}
	
	public int idealWeight() {
		return height - 110;
	}
}

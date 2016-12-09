package gowerment;

public class People {

	private int weight;
	private int heigth;
	
	
	public People(int weight, int height) {
		super();
		this.weight = weight;
		this.heigth = height;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + heigth;
		result = prime * result + weight;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		if (heigth != other.heigth)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "People [weight=" + weight + ", height=" + heigth + "]";
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return heigth;
	}
	public void setHeight(int height) {
		this.heigth = height;
	}
	
}

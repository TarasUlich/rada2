package gowerment;

import java.util.Scanner;

public class Deputy extends People{

	private static final Scanner SC = new Scanner(System.in);
	
	private String name;
	private String secondName;
	private int age;
	private boolean grafter;
	private int bribe;
	

	public Deputy(int weight, int height, String name, String secondName, int age, boolean grafter) {
		super(weight, height);
		this.name = name;
		this.secondName = secondName;
		this.age = age;
		this.grafter = grafter;
	}
	
	public void giveBribe(){
		if(this.grafter == false){
			System.out.println("Deputy " + this.name + " " + this.secondName + " don't take bribe!");
		}else{
			System.out.println("write down size of bribe");
			int bribe = SC.nextInt();
			
			
			if(bribe >= 5000){
				System.out.println("Deputy " + this.name + " " + this.secondName + " took bribe and was arrested!");
				this.bribe = bribe;
				
			}else{
				this.bribe = bribe;
			}
		}
	}
	
	
	
	
	
	public int getBribe() {
		return bribe;
	}
	
	public void setBribe(int bribe) {
		this.bribe = bribe;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSecondName() {
		return secondName;
	}


	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean isGrafter() {
		return grafter;
	}


	public void setGrafter(boolean grafter) {
		this.grafter = grafter;
	}

	@Override
	public String toString() {
		return "Deputy [name=" + name + ", secondName=" + secondName + ", age=" + age + ", grafter=" + grafter
				+ ", bribe=" + bribe + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + age;
		result = prime * result + bribe;
		result = prime * result + (grafter ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((secondName == null) ? 0 : secondName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deputy other = (Deputy) obj;
		if (age != other.age)
			return false;
		if (bribe != other.bribe)
			return false;
		if (grafter != other.grafter)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (secondName == null) {
			if (other.secondName != null)
				return false;
		} else if (!secondName.equals(other.secondName))
			return false;
		return true;
	}


	
	
	
}

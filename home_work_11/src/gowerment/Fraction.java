package gowerment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Fraction {
	
	private String name;
	private List<Deputy> deputies = new ArrayList<Deputy>();
	private static final Scanner SC = new Scanner(System.in);
	

	
	public Fraction(String name, List<Deputy> deputies) {
		super();
		this.name = name;
		this.deputies = deputies;
	}


	public void addDeputy(){
		System.out.println();
		System.out.println("Put weight:");
		int weight = SC.nextInt();
		System.out.println("Put height:");
		int height = SC.nextInt();
		System.out.println("Put name:");
		String name = SC.next();
		System.out.println("Put second name:");
		String secondName = SC.next();
		System.out.println("put age:");
		int age = SC.nextInt();
		System.out.println("Grafter or no, put true or false:");
		boolean grafter = SC.nextBoolean();
		Deputy dep = new Deputy(weight, height, name, secondName, age, grafter);
		if(dep.isGrafter()){
			dep.giveBribe();
		}
		deputies.add(dep);
			if(dep.getBribe() >= 100000){
				Iterator<Deputy> iter = deputies.iterator();
				while(iter.hasNext()){
					Deputy deputy = iter.next();
					if(deputy.getName().equals(name)){
						iter.remove();
						System.out.println(dep.getName() + " " + dep.getSecondName() + " " + " was removed from fraction!");
					}				
				}
			}
				
	}
	
	
	public void removeDeputy(){
		System.out.println("Put name of deputy you want to remove:");
		String name = SC.next();
		System.out.println("Put second name of deputy you want to remove:");
		String secondName = SC.next();
		boolean b = false;
		
		Iterator<Deputy> iterator = deputies.iterator();
		while(iterator.hasNext()){
			Deputy deputy = iterator.next();
			if(deputy.getName().equals(name) && deputy.getSecondName().equals(secondName)){
				iterator.remove();
				System.out.println("Peputy was removed!");
				b = true;
			}else{
				b = false;
			}
		}
		
		if(b == false){
			System.out.println("No such deputy!");
		}
		
	}
	
	
	public void allTakeBraib(){
		Iterator<Deputy> iterator = deputies.iterator();
		
		while(iterator.hasNext()){
			Deputy deputy = iterator.next();
			if(deputy.isGrafter() == true){
				System.out.println(deputy);
			}
		}
	}
	
	
	public Deputy biggestGrafter(){
		Iterator<Deputy> iterator = deputies.iterator();
		Deputy dep = null;
		int maxBraib = 0;
		
		while(iterator.hasNext()){
			Deputy deputy = iterator.next();
			if(deputy.getBribe() > maxBraib){
				maxBraib = deputy.getBribe();
				dep = deputy;
			}
		}
		return dep;
	}
	
	
	
	public void allDeputy(){
		Iterator<Deputy> iterator = deputies.iterator();
		
		while(iterator.hasNext()){
			Deputy deputy = iterator.next();
			System.out.println(deputy);
		}
	}
	
	
	public void removeAllDeputy(){
		Iterator<Deputy> iterator = deputies.iterator();
		
		while(iterator.hasNext()){
			
			iterator.next();
			iterator.remove();
			
		}
		System.out.println("All deputis are removed.");
	}


	


	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public List<Deputy> getFraction() {
		return deputies;
	}
	
	
	@Override
	public String toString() {
		return "Fraction [name=" + name + ", deputies=" + deputies + "]";
	}


	public void setFraction(ArrayList<Deputy> fraction) {
		this.deputies = fraction;
	}
	
	
}

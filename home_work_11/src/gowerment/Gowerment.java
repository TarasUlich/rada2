package gowerment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Gowerment {

	
	
	private List<Fraction> fractions = new ArrayList<Fraction>();
	private static final Scanner SC = new Scanner(System.in);

	

	public void addFraction(){
		System.out.println("Write down name of fraction you want to add:");
		String nameOfFraction = SC.next();
		boolean b = false;
		
		for (Fraction fraction : fractions) {
			if(nameOfFraction.equals(fraction.getName())){
				System.out.println("Fraction " + nameOfFraction + " allready exist!");
				b = true;
			}
		}
		
		if(b == false){
			Fraction frac = new Fraction(nameOfFraction, new ArrayList<Deputy>());
			fractions.add(frac);
			System.out.println(frac);
		}	
	}
	
	
	
	public void removeFraction(){
		System.out.println("Write down the name of fraction you want to remove:");
		String nameOfFraction = SC.next();
		
		
		Iterator<Fraction> iter = fractions.iterator();
		while(iter.hasNext()){
			
			String name = iter.next().getName();
			
			if(name.equals(nameOfFraction)){
				iter.remove();
				System.out.println("Fraction " + name + " was removed.");
			}
		}
	
		
	}
	
	
	public void clearFraction(){
		System.out.println("Write down the name of fraction you want to clear:");
		String nameOfFraction = SC.next();
		
		Iterator<Fraction> iter = fractions.iterator();
		while(iter.hasNext()){
			Fraction fraction = iter.next();
			if(fraction.getName().equals(nameOfFraction)){
				fraction.removeAllDeputy();
			}
		}
		
	}
	
	
	public void printAllFractions(){
		Iterator<Fraction> iter = fractions.iterator();
		if(!iter.hasNext()){
			System.out.println("No fractions!");
		}
		while(iter.hasNext()){
			Fraction fraction = iter.next();
			System.out.println(fraction);
		}
	}
	
	public void printFraction(){
		System.out.println("Write down the name of fraction you want to print:");
		String nameOfFraction = SC.next();
		
		Iterator<Fraction> iter = fractions.iterator();
		if(!iter.hasNext()){
			System.out.println("No fractions!");
		}
		while(iter.hasNext()){
			Fraction fraction = iter.next();
			if(fraction.getName().equals(nameOfFraction)){
				System.out.println(fraction);
			}else{
				System.out.println("No such fraction!");
			}
		}
	}
	
	
	
	public void addDeputyToFraction(){
		System.out.println("Write down the name of fraction which you want to add deputy:");
		String nameOfFraction = SC.next();
		boolean b = false;
		
		for (Fraction fraction : fractions) {
			if(fraction.getName().equals(nameOfFraction)){
				fraction.addDeputy();
				b = true;
			}else{b = false;}	
		}
		
		if(b == false){
			System.out.println("No such fraction!");
		}

	}
	
	public void removeDepFromFraction(){
		System.out.println("Write down the name of fraction which you want to remove deputy:");
		String nameOfFraction = SC.next();
		
		for (Fraction fraction : fractions) {
			if(fraction.getName().equals(nameOfFraction)){
				fraction.removeDeputy();
			}
		}
	}
	
	public void listOfGrafters(){
		for (Fraction fraction : fractions) {
			fraction.allTakeBraib();
		}
	}
	
	public void biggestGrafterInGowerment(){
		List<Deputy> depTakeBraib = new ArrayList<>();
		Fraction biggstGrafters = new Fraction("biggestGrafters", depTakeBraib);
		
		
		for (Fraction fraction : fractions) {
			depTakeBraib.add(fraction.biggestGrafter());
		}
		System.out.println(biggstGrafters.biggestGrafter());
	}
	
	
	



	public List<Fraction> getFractions() {
		return fractions;
	}




	public void setFractions(ArrayList<Fraction> fractions) {
		this.fractions = fractions;
	}




	@Override
	public String toString() {
		return "Gowerment [fractions=" + fractions + "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fractions == null) ? 0 : fractions.hashCode());
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
		Gowerment other = (Gowerment) obj;
		if (fractions == null) {
			if (other.fractions != null)
				return false;
		} else if (!fractions.equals(other.fractions))
			return false;
		return true;
	}
	
	
	
	
	
	


	
	
}

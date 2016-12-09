package gowerment;


import java.util.Scanner;

public class Main {

	private static final Scanner SC = new Scanner(System.in);
	
	public static void main(String[] args) {
			
			
			Gowerment gowerment = new Gowerment();
			
			boolean isRun = true;
			
			while(isRun){
				System.out.println();
				System.out.println("---------------------------------------------");
				System.out.println("Write down 1 to add fraction");
				System.out.println("Write down 2 to remove fraction");
				System.out.println("Write down 3 to clear fraction");
				System.out.println("Write down 4 to print all fraction");
				System.out.println("Write down 5 to print the fraction");
				System.out.println("Write down 6 to add deputy to the fraction");
				System.out.println("Write down 7 to remove deputy from fraction");
				System.out.println("Write down 8 to print list of grafters");
				System.out.println("Write down 9 to print the biggest grafter");
				System.out.println("---------------------------------------------");
				System.out.println();
				switch (SC.next()) {
				case "1":{
					gowerment.addFraction();
					break;
				}	
				case "2":{
					gowerment.removeFraction();
					break;
				}	
				case "3":{
					gowerment.clearFraction();
					break;
				}
				case "4":{
					gowerment.printAllFractions();;
					break;	
				}
				case "5":{
					gowerment.printFraction();
					break;
				}
				case "6":{
					gowerment.addDeputyToFraction();
					break;
				}
				case "7":{
					gowerment.removeDepFromFraction();
					break;
				}
				case "8":{
					gowerment.listOfGrafters();
					break;
				}
				case "9":{
					gowerment.biggestGrafterInGowerment();
					break;
				}
				
				default:{
					System.out.println("Exit!");
					isRun = false;
					break;
				}	
			}
			}	
	}

}

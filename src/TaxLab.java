import java.util.Scanner;
public class TaxLab {
	public static void single(int x) {//function to calculate taxes for someone filing single
		double tax=0;//variable to calculate tax owed
		if(x<=9700 && x>0) {//first tax bracket 0-9700
			tax = 0.10*x;
			System.out.println("You owe $" + tax + " in taxes");
		}
		else if(x>9700 && x<=39475) {//second tax bracket 9701-39475
			tax = 970 + 0.12*(x-9700);
			System.out.println("You owe $" + tax + " in taxes");
		}
		else if(x>39475 && x<=84200) {//third tax bracket 39476-84200
			tax = 970 + 3573+ 0.22*(x-39475);
			System.out.println("You owe $" + tax + " in taxes");
		}
		else if(x>84200 && x<=160725) {//fourth tax bracket 84201-160725
			tax = 970 + 3573+ 9839.5+ 0.24*(x-84200);
			System.out.println("You owe $" + tax + " in taxes");
		}
		else if(x>160725 && x<=204100) {//fifth tax bracket 160726-204100
			tax = 970 + 3573+ 9839.5+18366+ 0.32*(x-160725);
			System.out.println("You owe $" + tax + " in taxes");
		}
		else if(x>204100 && x<=510300) {//sixth tax bracket 204101-510300
			tax = 970 + 3573+ 9839.5+18366+ 13880 + 0.35*(x-204100);
			System.out.println("You owe $" + tax + " in taxes");
		}
		else if(x>510300) {//seventh tax bracket >510300
			tax = 970 + 3573+ 9839.5+18366+ 13880 + 107170+ 0.37*(x-510300);
			System.out.println("You owe $" + tax + " in taxes");
		}
		else {//in case someone enters a negative income
			System.out.println("Invalid income!");
		}
		return;
	}//end of single function
	
	public static void marriedJointWidow(int x) {//function to calculate taxes for someone filing marriedJoint
		double tax=0;//variable to calculate tax owed
		if(x<=19400 && x>0) {//first tax bracket 0-19400
			tax = 0.10*x;
			System.out.println("You owe $" + tax + " in taxes");
		}
		else if(x>19400 && x<=78950) {//second tax bracket 19401-78950
			tax = 1940 + 0.12*(x-19400);
			System.out.println("You owe $" + tax + " in taxes");
		}
		else if(x>78950 && x<=168400) {//third tax bracket 78951-168400
			tax = 1940 + 7146 + 0.22*(x-78950);
			System.out.println("You owe $" + tax + " in taxes");
		}
		else if(x>168400 && x<=321450) {//fourth tax bracket 168401-321450
			tax = 1940 + 7146 + 19679 + 0.24*(x-168400);
			System.out.println("You owe $" + tax + " in taxes");
		}
		else if(x>321450 && x<=408200) {//fifth tax bracket 321451-408200
			tax = 1940 + 7146 + 19679 + 36732 + 0.32*(x-321450);
			System.out.println("You owe $" + tax + " in taxes");
		}
		else if(x>408200 && x<=612500) {//sixth tax bracket 408201-612500
			tax = 1940 + 7146 + 19679 + 36732 + 27760 + 0.35*(x-408200);
			System.out.println("You owe $" + tax + " in taxes");
		}
		else if(x>510300) {//seventh tax bracket >612500
			tax = 1940 + 7146 + 19679 + 36732 + 27760 + 71505 + 0.37*(x-612500);
			System.out.println("You owe $" + tax + " in taxes");
		}
		else {//in case someone enters a negative income
			System.out.println("Invalid income!");
		}
		return;
	}//end of marriedJointWidow function
	
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Are you filing as Single, Head of Household, Married filing jointly, Qualified Widow, or Married filing seperately?");

	    String input = myObj.nextLine();  // Read user input
	    Scanner income = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("How much did you make this year?");

	    Integer inc = income.nextInt();  // Read user input
	    switch (input){//switch through inputs
	    case "Single" :
	    	TaxLab.single(inc);//calling function single
	    	break;
	    case "Head of Household" :
	    	System.out.println("IT WORKED");
	    	break;
	    case "Married filing jointly" :
	    	TaxLab.marriedJointWidow(inc);//calling function marriedJointWidow
	    	break;
	    case "Qualified Widow" :
	    	TaxLab.marriedJointWidow(inc);//calling function marriedJointWidow
	    	break;
	    case "Married filing seperately" :
	    	System.out.println("IT WORKED");
	    	break;
	    default : 
	    	System.out.println("Please enter the option exactly as shown.");
	    }
	  
	    
	    
	    
	    System.out.println("I am filing as " + input + " and I earned $" + inc);  // Output user input
	  }
}

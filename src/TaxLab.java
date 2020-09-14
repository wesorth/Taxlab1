import java.util.Scanner;
public class TaxLab {
	public static void single(int x) {//function to calculate taxes for someone filing single
		//	Test
		double tax=0;//variable to calculate tax owed
		if(x<=9700 && x>0) {//first tax bracket 0-9700
			tax = 0.10*x;
		}
		else if(x>9700 && x<=39475) {//second tax bracket 9701-39475
			tax = 970 + 0.12*(x-9700);
		}
		else if(x>39475 && x<=84200) {//third tax bracket 39476-84200
			tax = 970 + 3573+ 0.22*(x-39475);
		}
		else if(x>84200 && x<=160725) {//fourth tax bracket 84201-160725
			tax = 970 + 3573+ 9839.5+ 0.24*(x-84200);
		}
		else if(x>160725 && x<=204100) {//fifth tax bracket 160726-204100
			tax = 970 + 3573+ 9839.5+18366+ 0.32*(x-160725);
		}
		else if(x>204100 && x<=510300) {//sixth tax bracket 204101-510300
			tax = 970 + 3573+ 9839.5+18366+ 13880 + 0.35*(x-204100);
		}
		else if(x>510300) {//seventh tax bracket >510300
			tax = 970 + 3573+ 9839.5+18366+ 13880 + 107170+ 0.37*(x-510300);
		}
		else {//in case someone enters a negative income
			System.out.println("Invalid income!");
			return;
		}
		System.out.println("You owe $" + tax + " in taxes");
		return;
	}//end of single function
	
	public static void marriedJointWidow(int x) {//function to calculate taxes for someone filing marriedJoint
		double tax=0;//variable to calculate tax owed
		if(x<=19400 && x>0) {//first tax bracket 0-19400
			tax = 0.10*x;
		}
		else if(x>19400 && x<=78950) {//second tax bracket 19401-78950
			tax = 1940 + 0.12*(x-19400);
		}
		else if(x>78950 && x<=168400) {//third tax bracket 78951-168400
			tax = 1940 + 7146 + 0.22*(x-78950);
		}
		else if(x>168400 && x<=321450) {//fourth tax bracket 168401-321450
			tax = 1940 + 7146 + 19679 + 0.24*(x-168400);
		}
		else if(x>321450 && x<=408200) {//fifth tax bracket 321451-408200
			tax = 1940 + 7146 + 19679 + 36732 + 0.32*(x-321450);
		}
		else if(x>408200 && x<=612500) {//sixth tax bracket 408201-612500
			tax = 1940 + 7146 + 19679 + 36732 + 27760 + 0.35*(x-408200);
		}
		else if(x>510300) {//seventh tax bracket >612500
			tax = 1940 + 7146 + 19679 + 36732 + 27760 + 71505 + 0.37*(x-612500);
		}
		else {//in case someone enters a negative income
			System.out.println("Invalid income!");
			return;
		}
		System.out.println("You owe $" + tax + " in taxes");
		return;
	}//end of marriedJointWidow function
	public static void marriedFilingSeperately(int x) {
		double tax = 0; // calculate the tax owed
		if (x <= 9700) {
			tax = x * .10;
		}
		else if (x <= 39475) {
			tax = 9700 * .10 + (x - 9700) *.12;
		}
		else if (x <= 84200) {
			tax = 9700 * .10 + (39475 - 9700) * .12 + (x - 39475) * .22;
		}
		else if (x <= 160725) {
			tax = 9700 * .10 + (39475 - 9700) * .12 + (84200 - 39475) * .22 + (x - 84200) * .24;
		}
		else if (x <= 204100) {
			tax = 9700 * .10 + (39475 - 9700) * .12 + (84200 - 39475) * .22 + (160725 - 84200) * .24 + (x - 160725) * .32;
		}
		else if (x <= 306175) {
			tax = 9700 * .10 + (39475 - 9700) * .12 + (84200 - 39475) * .22 + (160725 - 84200) * .24 + (204100 - 160725) * .35 + (x - 204100) * .35;
		}
		else {
			tax = 9700 * .10 + (39475 - 9700) * .12 + (84200 - 39475) * .22 + (160725 - 84200) * .24 + (204100 - 160725) * .35 + (306175 - 204100) * .35 + (x - 306175) * .37;
		}
		System.out.println("You owe $" + tax + " in taxes");
	}
	public static void headOfHousehold(int x) {
		double tax = 0; // initialize tax
		if (x <= 13850) {
			tax = x * .10;
		}
		else if (x <= 52850) {
			tax = 13850 * .10 + (x - 13850) * .12;
		}
		else if (x <= 84200) {
			tax = 13850 * .10 + (52850 - 13850) * .12 + (x - 52850) * .22;
		}
		else if (x <= 160700) {
			tax = 13850 * .10 + (52850 - 13850) * .12 + (84200 - 52850) * .22 + (x - 84200) * .24;
		}
		else if (x <= 204100) {
			tax = 13850 * .10 + (52850 - 13850) * .12 + (84200 - 52850) * .22 + (160700 - 84200) * .24 + (x - 160700) * .32;
		}
		else if (x <= 510300) {
			tax = 13850 * .10 + (52850 - 13850) * .12 + (84200 - 52850) * .22 + (160700 - 84200) * .24 + (204100 - 160700) * .32 + (x - 204100) * .35;
		}
		else {
			tax = 13850 * .10 + (52850 - 13850) * .12 + (84200 - 52850) * .22 + (160700 - 84200) * .24 + (204100 - 160700) * .32 + (510300 - 204100) * .35 + (x - 510300) * .37;
		}
		System.out.println("You owe $" + tax + " in taxes");
	}
	
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Are you filing as Single, Head of Household, Married filing jointly, Qualified Widow, or Married filing seperately?");

	    String input = myObj.nextLine();  // Read user input
	    Scanner income = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("How much did you make this year?");

	    Integer inc = income.nextInt();  // Read user input
	    System.out.println("I am filing as " + input + " and I earned $" + inc);  // Output user input // Change
	    switch (input){//switch through inputs
	    case "Single" :
	    	TaxLab.single(inc);//calling function single
	    	break;
	    case "Head of Household" :
	    	TaxLab.headOfHousehold(inc);
	    	//System.out.println("IT WORKED");
	    	break;
	    case "Married filing jointly" :
	    	TaxLab.marriedJointWidow(inc);//calling function marriedJointWidow
	    	break;
	    case "Qualified Widow" :
	    	TaxLab.marriedJointWidow(inc);//calling function marriedJointWidow
	    	break;
	    case "Married filing seperately" :
	    	TaxLab.marriedFilingSeperately(inc);
	    	//System.out.println("IT WORKED");
	    	break;
	    default : 
	    	System.out.println("Please enter the option exactly as shown.");
	    }
	  }
}

package check;

import constants.Constants;

public class Check {
	private static String firstName = "早紀";
	private static String lastName = "大町";
	
	private static void printName(String firstName, String lastName) {
    	System.out.println("printNameメソッド → " + lastName  + firstName);
    }
	
	public static void main(String[] args) {
		printName(firstName, lastName);
		
		Pet pt = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pt.introduce();
		
		RobotPet rpt = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		rpt.introduce();
	} 
	
}

package check;

import constants.Constants;

public class Main {
	private static  String f;
	private static  String l;
	private static  String firstName="角田";
	private static  String lastName="秀馬";
	
	public static void main(String[] args) { 
		printName(firstName,lastName);
		Pet pet1=new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		RobotPet rp=new RobotPet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		pet1.introduce();
		rp.introduce();	
	}
	private static void printName(String f,String l) {
		System.out.println(f+l);
	}
	
}

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter minutes to convert: ");
		int minutes = sc.nextInt();
		sc.close();
		System.out.println("The seconds are: " + minsToSecs(minutes));
	}
	public static int minsToSecs(int minutes){
		int seconds = minutes * 60;
		return seconds;
	}
}
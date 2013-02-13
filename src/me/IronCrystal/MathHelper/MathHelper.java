package me.IronCrystal.MathHelper;

import java.util.Scanner;

public class MathHelper {

	public static void main(String [] args) {
		AskAgain();
	}

	private static void AskAgain() {
		Scanner sc = new Scanner(System.in);
		String method;
		
		System.out.printf("What type of math function would you like:\n\n");
		System.out.printf("Addition \tTangent \tQuadratic\nSubtraction \tSine\n");
//		System.out.println("What type of math function would you like:");
//		System.out.println("Quadratic");
//		System.out.println("Addition");
//		System.out.println("Tangent");
//		System.out.println("Sine");

		method = sc.next();

		if (method.equalsIgnoreCase("quadratic")) {
			Quadratic();
		}
		else if(method.equalsIgnoreCase("addition")) {
			Addition();
		}
		else if(method.equalsIgnoreCase("tangent")) {
			Tangent();
		}
		else if (method.equalsIgnoreCase("sine")) {
			Sine();
		}else{
			System.out.println("Something tells me you can't answer simple questions. Terminating...");
		}
		sc.close();
	}

	private static void Quadratic() {
		Scanner sc = new Scanner(System.in);

		System.out.print("A: ");
		double x = sc.nextDouble();
		System.out.print("B: ");
		double y = sc.nextDouble();
		System.out.print("C: ");
		double z = sc.nextDouble();
		System.out.printf("\nCongratulations!  You started the quadratic formula with the numbers %.2f %.2f and %.2f\n", x, y, z);

		double solution1 = ((-1*y) + Math.sqrt(y*y - 4*x*z))/(2*x);
		double solution2 = ((-1*y) - Math.sqrt(y*y - 4*x*z))/(2*x);

		System.out.printf("X ~ %.2f or %.2f\n", solution1, solution2);

		System.out.println("Would you like to do another method? (Y/N): ");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("y")) {
			AskAgain();
		}
		else if (answer.equalsIgnoreCase("n")) {
			System.out.println("Ok. See ya later!");
		}else{
			System.out.println("Something tells me you can't answer simple questions. Terminating...");
		}
		sc.close();
	}

	private static void Addition() {
		double x;
		double y;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amounts you would like to add.");
		x = sc.nextDouble();
		y = sc.nextDouble();

		System.out.printf("Solution: %.2f\n", x + y);

		//		while(!sc.next().equalsIgnoreCase("!")) {
		//			try {
		//				numbers.add(sc.nextDouble());
		//			}catch(InputMismatchException e) {
		//				System.out.println("Please input a number.");
		//			}			
		//		}
		//		Iterator<Double> listIterator = numbers.iterator(); // Get the iterator.
		//
		//		while(listIterator.hasNext()) {
		//			solution = solution + listIterator.next();
		//		}

		//		while(!sc.next().equalsIgnoreCase("!")) {
		//			Double d = sc.nextDouble();
		//			System.out.printf("%.2f\n", d);
		//			try {
		//				solution = solution + d;
		//				System.out.printf("Current total: %.2f\n", solution);
		//			}catch(InputMismatchException e) {
		//				System.out.println("Please input a number.");
		//			}			
		//		}
		//		System.out.printf("Solution: %.2f\n", solution);

		System.out.println("Would you like to do another method? (Y/N): ");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("y")) {
			AskAgain();
		}
		else if (answer.equalsIgnoreCase("n")) {
			System.out.println("Ok. See ya later!");
		}else{
			System.out.println("Something tells me you can't answer simple questions. Terminating...");
		}
		sc.close();
	}

	private static void Tangent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the degrees: ");
		double degrees = sc.nextDouble();
		double radians = Math.toRadians(degrees);

		System.out.format("The tangent of %.1f degrees is %.2f%n", degrees, Math.tan(radians));
		System.out.println("Would you like to do another method? (Y/N): ");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("y")) {
			AskAgain();
		}
		else if (answer.equalsIgnoreCase("n")) {
			System.out.println("Ok. See ya later!");
		}else{
			System.out.println("Something tells me you can't answer simple questions. Terminating...");
		}
		sc.close();
	}

	private static void Sine() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the degrees: ");
		double degrees = sc.nextDouble();
		double radians = Math.toRadians(degrees);

		System.out.format("The sine of %.1f degrees is %.2f%n", degrees, Math.sin(radians));
		
		System.out.println("Would you like to do another method? (Y/N): ");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("y")) {
			AskAgain();
		}
		else if (answer.equalsIgnoreCase("n")) {
			System.out.println("Ok. See ya later!");
		}else{
			System.out.println("Something tells me you can't answer simple questions. Terminating...");
		}
		sc.close();
	}
}

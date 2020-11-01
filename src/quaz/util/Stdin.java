package quaz.util;

import java.util.Scanner;

public class Stdin {
	
	//private final static Scanner scanner = new Scanner(System.in);
	
	private static String readLine() {
		try(Scanner scanner = new Scanner(System.in)) {
			return scanner.nextLine();
		}
	}

	public static String input() {
		return readLine();
	}
	
	public static String input(Object obj) {
		System.out.print(obj);
		return readLine();
	}
	
	public static String input(int obj) {
		System.out.print(obj);
		return readLine();
	}
	
	public static String input(boolean obj) {
		System.out.print(obj);
		return readLine();
	}
	
	public static String input(double obj) {
		System.out.print(obj);
		return readLine();
	}
	
	public static String input(float obj) {
		System.out.print(obj);
		return readLine();
	}
	
}

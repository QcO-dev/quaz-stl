package quaz.util;

import java.util.Scanner;

public class Stdin {
	
	private final static Scanner scanner = new Scanner(System.in);

	public static String input() {
		return scanner.nextLine();
	}
	
	public static String input(Object obj) {
		System.out.print(obj);
		return scanner.nextLine();
	}
	
	public static String input(char obj) {
		System.out.print(obj);
		return scanner.nextLine();
	}
	
	public static String input(short obj) {
		System.out.print(obj);
		return scanner.nextLine();
	}
	
	public static String input(long obj) {
		System.out.print(obj);
		return scanner.nextLine();
	}
	
	
	public static String input(byte obj) {
		System.out.print(obj);
		return scanner.nextLine();
	}
	
	public static String input(int obj) {
		System.out.print(obj);
		return scanner.nextLine();
	}
	
	public static String input(boolean obj) {
		System.out.print(obj);
		return scanner.nextLine();
	}
	
	public static String input(double obj) {
		System.out.print(obj);
		return scanner.nextLine();
	}
	
	public static String input(float obj) {
		System.out.print(obj);
		return scanner.nextLine();
	}
	
}

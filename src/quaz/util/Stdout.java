package quaz.util;

public class Stdout {
	public static void println(int val) {
		System.out.println(val);
	}
	
	public static void println(char val) {
		System.out.println(val);
	}
	
	public static void println(double val) {
		System.out.println(val);
	}
	
	public static void println(float val) {
		System.out.println(val);
	}
	
	public static void println(boolean val) {
		System.out.println(val);
	}
	
	public static void println(Object obj) {
		System.out.println(obj);
	}
	
	public static void println() {
		System.out.println();
	}
	
	// TODO Soon
	
	public static void println(Object... objects) {
		
		int len = objects.length;
		
		String[] strings = new String[len];
		
		for(int i = 0; i < len; i++) strings[i] = objects[i].toString();
		
		System.out.println(String.join(" ", strings));
		
	}
	
	public static void print(Object... objects) {
		
		int len = objects.length;
		
		String[] strings = new String[len];
		
		for(int i = 0; i < len; i++) strings[i] = objects[i].toString();
		
		System.out.print(String.join(" ", strings));
		
	}
	
}

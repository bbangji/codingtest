import java.util.HashMap;
import java.util.Scanner;

public class BOJ_1076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> color = new HashMap<String, Integer>();
		color.put("black", 0);
		color.put("brown", 1);
		color.put("red", 2);
		color.put("orange", 3);
		color.put("yellow", 4);
		color.put("green", 5);
		color.put("blue", 6);
		color.put("violet", 7);
		color.put("grey", 8);
		color.put("white", 9);
		int val1 = color.get(sc.next())*10;
		int val2 = color.get(sc.next());
		long val3 = (long) Math.pow(10, color.get(sc.next()));
		System.out.println((val1+val2)*val3);
		
	}
}

import java.util.ArrayList;
import java.util.Scanner;
public class BOJ_1284 {
	
	static int width(int num) {
		String number = Integer.toString(num);
		int sum = 0;
		for(int i=0;i<number.length();i++) {
			if(number.charAt(i)=='1') {
				sum += 2;
			} else if (number.charAt(i)=='0') {
				sum += 4;
			} else {
				sum += 3;
			}
		}
		return sum + 2 + number.length()-1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(true) {
			int n = sc.nextInt();
			if(n==0) {
				break;
			}
			arr.add(width(n));
		}
		for(int val : arr) {
			System.out.println(val);
		}
	}

}

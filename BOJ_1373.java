import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_1373 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		StringBuilder sb = new StringBuilder();
		if(num.length()%3==0) {
			sb.append(num);
		} else if(num.length()%3==1) {
			sb.append("00").append(num);
		} else {
			sb.append("0").append(num);
		}
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<sb.length();i+=3) {
			arr.add((sb.charAt(i)-'0')*4+(sb.charAt(i+1)-'0')*2+(sb.charAt(i+2)-'0')*1);
		}
		for(int val : arr) {
			System.out.print(val);
		}
	}
}

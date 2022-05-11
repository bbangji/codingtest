import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_1259 {
	// 펠린드롬이면 yes 아니면 no 
	static void pelindrom(int num) {
		String number = Integer.toString(num);
		boolean check = false;
		for(int i=0,j=number.length()-1;i<number.length();i++,j--) {
			if(number.charAt(i)-'0'==number.charAt(j)-'0') {
				check = true;
			} else {
				check = false;
				break;
			}
		}
		if(check) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(true) {
			int n = sc.nextInt();
			arr.add(n);
			if(n==0) {
				break;
			}
		}
		for(int i=0;i<arr.size()-1;i++) {
			pelindrom(arr.get(i));
		}
		
	}

}

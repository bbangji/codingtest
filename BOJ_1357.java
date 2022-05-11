import java.util.Scanner;

public class BOJ_1357 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		System.out.println(Rev(Rev(X)+Rev(Y)));

	}
	static int Rev(int n) {
		if(n<10) {
			return n;
		} else if(n<100) {
			return 10*(n%10) + n/10;
		} else if (n<1000) {
			return n/100 + ((n/10)%10)*10 + (n%10)*100;
		} else {
			return n/1000 + ((n/100)%10)*10 + ((n/10)%10)*100 + (n%10)*1000;
		}
	}
}

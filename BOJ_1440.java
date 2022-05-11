import java.util.Scanner;
public class BOJ_1440 {

	public static void main(String[] args) {
		// Time machine
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		sc.close();
		String[] each = time.split(":");
		int cnt = 0;
		for(int i=0; i<3; i++) {
			if(Integer.parseInt(each[i])>0 && Integer.parseInt(each[i])<=12) {
				cnt++;
			}
		}
		System.out.println(cnt*2);
	}
}

import java.util.Scanner;

public class BOJ_1408 {

	public static void main(String[] args) {
		// 남은 시간 구하기 
		// String으로 받고 :으로 스플릿
		Scanner sc = new Scanner(System.in);
		String ct = sc.next();
		String st = sc.next();
		sc.close();
		String[] current = ct.split(":");
		String[] start = st.split(":");
		int[] CT = new int[3];
		int[] ST = new int[3];
		for(int i=0;i<3;i++) {
			CT[i] = Integer.parseInt(current[i]);
			ST[i] = Integer.parseInt(start[i]);
		}
		int ct_sec = CT[0]*3600+CT[1]*60+CT[2];
		int st_sec = ST[0]*3600+ST[1]*60+ST[2];
		if(ct_sec > st_sec) {
			st_sec = st_sec + 24*3600;
		}
		int answer = st_sec - ct_sec;
		int[] time = new int[3];
		time[0] = answer/3600;
		time[1] = (answer%3600)/60;
		time[2] = (answer%3600)%60;
		
		if(time[0]<10) {
			System.out.print(0);
			System.out.print(time[0]);
		} else {
			System.out.print(time[0]);
		}
		System.out.print(":");
		if(time[1]<10) {
			System.out.print(0);
			System.out.print(time[1]);
		} else {
			System.out.print(time[1]);
		}
		System.out.print(":");
		if(time[2]<10) {
			System.out.print(0);
			System.out.print(time[2]);
		} else {
			System.out.print(time[2]);
		}
	}
}

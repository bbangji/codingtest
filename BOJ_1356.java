import java.util.Scanner;

public class BOJ_1356 {

	public static void main(String[] args) {
		//유진수
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int[] first = new int[N.length()-1]; // 앞자리
		int[] second = new int[N.length()-1]; // 뒷자리
		for(int i=0;i<N.length()-1;i++) {
			first[i] = 1;
			second[i] = 1;
		}
		for(int i=0;i<N.length()-1;i++) {
			for(int j=0; j<=i; j++) {
				first[i] *= N.charAt(j)-'0';
			}
			for(int j=N.length()-1; j>i; j--) {
				second[i] *= N.charAt(j)-'0';
			}
		}
		
		boolean check = false;
		for(int i=0;i<N.length()-1;i++) {
			if(first[i]==second[i]) {
				check = true;
			}
		}
		if(check) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}

}

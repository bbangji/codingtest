import java.util.Scanner;

public class BOJ_1075 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = sc.nextInt();
		sc.close();
		// n을 100으로 나눠서 100의 자리까지만 나누고 그 나머지에 다시 100을 곱한다
		// 나머지*100 값부터 1씩 증가시켜 나머지가 0이면 문자열로 컨버트하고 두번째 세번째 문자 출력
		int r = ((n/100)%f)*100;
		for(int i =r; i<r+100; i++) {
			if(i%f == 0) {
				int val = i - (i/100)*100;
				if(val<10) {
					System.out.print(0);
					System.out.print(val);
				} else {
					System.out.print(val);
				}
				break;
			}
		}
		
	}
}

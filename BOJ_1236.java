import java.util.Scanner;

public class BOJ_1236 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		//String 값으로 받기
		String[] arr = new String[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.next();
		}
		//boolean 배열 2개 생성 - 행과 열 하나씩
		boolean[] check1 = new boolean[N];
		boolean[] check2 = new boolean[M];
		//arr문자값 비교 X면 트루 .이면 폴스
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(arr[i].charAt(j)=='X') {
					check1[i] = true;
					check2[j] = true;
				}
			}
		}
		// false 일 때 갯 / 단 false가 더 많은 쪽(적은 쪽은 어차피 중복됨)
		int f1 = 0;
		int f2 = 0;
		for(boolean val : check1) {
			if(val==false) {
				f1++;
			}
		}
		for(boolean val : check2) {
			if(val==false) {
				f2++;
			}
		}
		if(f1>=f2) {
			System.out.println(f1);
		} else {
			System.out.println(f2);
		}
		
		
		
		
	}

}

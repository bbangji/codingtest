import java.util.Scanner;
public class BOJ_1173 {

	public static void main(String[] args) {
		// 최저 맥박: m(초기맥박), 최고 맥박: M, 운동: +T, 휴식: -R
		// M 보다 작을 때까지 운동 가능 M보다 클 경우 휴식 그리고 다시 M보다 작을 때 까지 운동 반복 -> 운동or 휴식할때마다 N++
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int m = sc.nextInt();
		int M = sc.nextInt();
		int T = sc.nextInt();
		int R = sc.nextInt();
		int work = 0;
		int rest = 0;
		int bpm = m;
		if(bpm+T>M) {
			System.out.println(-1);
		} else {
		while(work<N) {
			if(bpm+T<=M) {
				bpm += T;
				work++;
			} else if(bpm+T>M){
				bpm -= R;
				if(bpm<m) {
					bpm = m;
				}
				rest++;
			} 
		}
		System.out.println(work+rest);
		}
	}

}

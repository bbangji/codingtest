import java.util.Scanner;
public class BOJ_1434 {

	public static void main(String[] args) {
		// 책 정리
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] box = new int[N];
		int[] book = new int[M];
		for(int i=0;i<N;i++) {
			box[i] = sc.nextInt();
		}
		for(int i=0;i<M;i++) {
			book[i] = sc.nextInt();
		}
		sc.close();
		
		int waste = 0;
		int j=0;
		int t = 0;
		while(j<M) {
			if(box[t]>=book[j]) {
				box[t] -= book[j];
				j++;
			} else {
				t++;
			}
		}
		for(int c=0;c<N;c++) {
			waste += box[c];
		}
		System.out.println(waste);
	}

}

import java.util.Scanner;

public class BOJ_1333 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 수록곡 수
		int L = sc.nextInt(); // 각 노래 길이
		int D = sc.nextInt(); // 전화벨 텀
		// when can gangto listen to bell?
		boolean[] album = new boolean[(N*L)+((N-1)*5)];
		for(int i=0; i<album.length; i+=L+5) {
			for(int j=0;j<L;j++) {
				album[i+j] = true;
			}
		}
		int result = 0;
		while(result<album.length) {
			result += D;
		}
		for(int i=D; i<album.length; i+=D) {
			if(!album[i]) {
				result = i;
				break;
			} 
		}
		System.out.print(result);
	}
}


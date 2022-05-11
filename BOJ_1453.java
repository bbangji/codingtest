import java.util.Scanner;

public class BOJ_1453 {

	public static void main(String[] args) {
		// Sejun's pc bang alba	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[] check = new boolean[101];
		int count = 0;
		for(int i=0;i<N;i++) {
			int num = sc.nextInt();
			if(check[num]==true) {
				count++;
			}
			check[num] = true;
		}
		System.out.println(count);
	}

}

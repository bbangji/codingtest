import java.io.*;
import java.util.StringTokenizer;
public class BOJ_1524 {

	public static void main(String[] args) throws IOException {
		// sejun vs seby
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			String L = br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[] sejun = new int[N];
			int[] seby = new int[M];
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				sejun[j] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				seby[j] = Integer.parseInt(st.nextToken());
			}
			if(max(sejun)>=max(seby)) {
				System.out.println("S");
			} else {
				System.out.println("B");
			}
		}
	}
	public static int max(int[] arr) {
		int m = 0;
		for(int val: arr) {
			if(val > m) {
				m = val;
			}
		}
		return m;
	}
}

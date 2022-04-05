
import java.util.ArrayList;
import java.util.Scanner;
public class BOJ_1145 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 5개중 3개의 최소공배수 but 가장 작은 값
		// for statement -> 
		int[] arr = new int[5];
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
			for(int i=0;i<5;i++) {
				for(int j=i+1;j<5;j++) {
					for(int t=j+1;t<5;t++) {
						result.add(least(arr[i], arr[j], arr[t]));
				}
			}
		}
		int min = result.get(0);
		for(int val : result) {
			if(val<min) {
				min = val;
			}
		}
		System.out.println(min);
		
}
	static int least(int a, int b, int c) {
		int i=1;
		while(true) {
			if(i%a==0 && i%b==0 && i%c==0) {
				return i;
			}
			i++;
		}
	}
}

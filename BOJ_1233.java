import java.util.ArrayList;

import java.util.Scanner;

public class BOJ_1233 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 덧셈 조합에서 가장 많이 나올 수 있는 수 -> 
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s = 0;
		
		ArrayList<Integer> sum = new ArrayList<Integer>();

		for(int i=1;i<=s1;i++) {
			for(int j=1;j<=s2;j++) {
				for(int t=1;t<=s3;t++) {
					 sum.add(i+j+t);
					}
				}
			}
		
		int[] arr = new int[1600];
		for(int i=0;i<sum.size();i++) {
			arr[sum.get(i)]++;
		}
		int max = 0;
		for(int val : arr) {
			if(val>max) {
				max = val;
			}
		}
		for(int i=0;i<1600;i++) {
			if(arr[i]==max) {
				System.out.println(i);
				break;
			}
		}
	}
}

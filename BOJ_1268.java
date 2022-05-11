import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ_1268 {

	public static void main(String[] args) {
		// 임시반장 선거 -> 같은 반 많이 해본 사람
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //학생수
		int[][] arr = new int[n][5];
		int studentMax = 0;
		int answer = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		for(int i=0;i<n;i++) {
			Set<Integer> studentSet = new HashSet<Integer>();
			for(int j=0;j<5;j++) {
				for(int k=0;k<n;k++) {
					if(i==k) {
						continue;
					}
					if(arr[i][j]==arr[k][j]) {
						studentSet.add(k);
					}
				}
			}
			if(studentSet.size()>studentMax) {
				studentMax = studentSet.size();
				answer = i;
			}
		}
		System.out.println(answer+1);
		
	}

}

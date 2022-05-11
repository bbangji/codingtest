import java.util.Scanner;

public class BOJ_1418 {

	public static void main(String[] args) {
		// 세준수 구하기 - 소인수 최댓 K이하
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int count = 0;
		for(int i=1;i<=N;i++) {
			if(pf_max(i)<=K) {
				count++;
			}
		}
		System.out.println(count);
	}
	//소인수 최댓값
	public static int pf_max(int num) {
		if(num==1)return 1;
		int i = 2;
		while(num>i) {
			if(num%i==0) {
				num/=i;
			} else {
				i++;
			}
		}
		return i;
	}
}

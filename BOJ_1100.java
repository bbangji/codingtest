import java.util.Scanner;

public class BOJ_1100 {

	public static void main(String[] args) {
		// 8*8 체스판 0*0은 white String배열에서 [짝수][짝수] or [홀수][홀수]일 때 흰칸
		// 해당 값이 F이면 count++
		Scanner sc = new Scanner(System.in);
		String[] chess = new String[8];
		int count = 0;
		for(int i=0;i<8;i++) {
			chess[i] = sc.next();
			for(int j=0;j<8;j++) {
				if(i%2==0 && j%2==0) {
					if(chess[i].charAt(j)=='F') {
						count++;
					}
				}
				if(i%2!=0 && j%2!=0) {
					if(chess[i].charAt(j)=='F') {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_1247 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Test case x3
		for(int i=0;i<3;i++) {
			int N = sc.nextInt();
			BigInteger S = new BigInteger("0");
			for(int j=0;j<N;j++) {
				long num = sc.nextLong();
				BigInteger big1 = new BigInteger(Long.toString(num));
				S = S.add(big1);
			}
			if(S.compareTo(BigInteger.ZERO)==1) {
				System.out.println('+');
			} else if(S.compareTo(BigInteger.ZERO)==-1) {
				System.out.println('-');
			} else {
				System.out.println(0);
			}
		}
		sc.close();

	}

}

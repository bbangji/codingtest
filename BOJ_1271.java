import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_1271 {

	public static void main(String[] args) {
		// 엄청난 부자
		Scanner sc = new Scanner(System.in);
		BigInteger money = new BigInteger(sc.next());
		BigInteger num = new BigInteger(sc.next());
		System.out.println(money.divide(num));
		System.out.println(money.remainder(num));

	}

}

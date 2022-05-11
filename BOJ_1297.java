import java.util.Scanner;

public class BOJ_1297 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int H = sc.nextInt();
		int W = sc.nextInt();
		// 세로: a  가로: b라고 할 때 a제곱+b제곱 = D제곱 , a:b = H:W -> Hb=Wa -> b = W/H*a
		// a제곱 + W/H*a의 제곱 = D제곱 a제곱(1+w제곱/h제곱)=D제곱 ->
		// a = root (D^2/(1+W^2/H^2))
		double a = Math.sqrt((Math.pow(D, 2)/(1+Math.pow(W, 2)/Math.pow(H, 2))));
		double b = (a*W)/H;
		System.out.println((int)a+" "+(int)b);
	}

}

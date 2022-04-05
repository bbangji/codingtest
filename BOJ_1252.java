import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_1252 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String a = st.nextToken();
		String b = st.nextToken();
		BigInteger A = new BigInteger(a, 2);
		BigInteger B = new BigInteger(b, 2);
		BigInteger sum = A.add(B);
		String result = sum.toString(2);
		System.out.println(result);
	}

}

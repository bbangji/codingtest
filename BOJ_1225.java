import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1225 {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// a의 각자리수의 합 * b의 각 자리수의 합 / 두 수는 만자리 이하 -> long
	StringTokenizer st = new StringTokenizer(br.readLine()," ");
	String a = st.nextToken();
	String b = st.nextToken();
	long sum1 = 0;
	long sum2 = 0;
	for(int i=0;i<a.length();i++) {
		sum1 += a.charAt(i)-'0';
	}
	for(int i=0;i<b.length();i++) {
		sum2 += b.charAt(i)-'0';
	}
	System.out.println(sum1*sum2);
	}
}

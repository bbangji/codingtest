import java.io.*;

public class BOJ_1212 {

	public static void main(String[] args) throws IOException {
		// 8진수 -> 2진수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 8진수의 각자릿수를 2진수로 바꿔서 나열하면됨 but 앞자리 0이면 생략
		// 8은 2의 3제곱이니까 각 자릿수는 2진수 3자리로 나타남
		String num = br.readLine();
		int[] arr = new int[num.length()];
		for(int i=0;i<num.length();i++) {
			arr[i] = num.charAt(i)-'0';
		} // 각 자릿수 배열에 담기
		StringBuilder sb = new StringBuilder();
		sb.append(Integer.toBinaryString(arr[0]));
		for(int i=1;i<arr.length;i++) {
			if(Integer.toBinaryString(arr[i]).length()==3) {
				sb.append(Integer.toBinaryString(arr[i]));
			}
			if(Integer.toBinaryString(arr[i]).length()==2) {
				sb.append('0').append(Integer.toBinaryString(arr[i]));
			}
			if(Integer.toBinaryString(arr[i]).length()==1) {
				sb.append("00").append(Integer.toBinaryString(arr[i]));
			}
		}
		System.out.println(sb);
	}
		
    	
		
	}



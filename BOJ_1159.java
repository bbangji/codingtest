import java.util.Scanner;

public class BOJ_1159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] name = new String[n];
		for(int i=0;i<n;i++) {
			name[i] = sc.next();
		}
		// charAt(0) 값 인덱스로 변환하기
		// char[] 배열 (알파벳) length -> 26
		// n번 검사해서 char[charAt(0)-'0']++; -> element 5이상인  값 출력
		int[] alp = new int[26];
		for(int i=0; i<n; i++) {
			alp[name[i].charAt(0)-97]++;
		}
		char ch;
		boolean check = true;
		for(int i=0; i<26; i++) {
			if(alp[i]>=5) {
				check = false;
				ch = (char) (i+97);
				System.out.print(ch);
			} 
		}
		if(check) {
			System.out.println("PREDAJA");
		}
		
	}

}

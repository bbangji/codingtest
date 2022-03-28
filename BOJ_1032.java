import java.util.Scanner;

public class BOJ_1032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// n개의 String 값 받아오는 배열 생성
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i] = sc.next();
		}
		// 첫번째 문자열 문자 배열에 담고 두번째이상 문자열과 문자 비
		char[] ch = new char[str[0].length()];  
		for(int i=0;i<str[0].length();i++) {
			ch[i]=str[0].charAt(i);
		}
		for(int i=1; i<n; i++) {
			for(int j=0;j<str[0].length();j++) {
				if(str[i].charAt(j)!=ch[j]) {
					ch[j] = '?';
					// 다르면 '?'저장
				}
			}
		}
		for(int i=0;i<str[0].length();i++) {
			System.out.print(ch[i]);
		}
	}
}

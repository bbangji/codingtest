import java.util.ArrayList;
import java.util.Scanner;
//모음의 개수
public class BOJ_1264 {
	static void count_vowel(String str) {
		char[] vowel = {'a','e','i','o','u'};
		int count = 0;
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<5;j++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				if(str.charAt(i)+32==vowel[j]) {
					count++;
				}
				} else {
					if(str.charAt(i)==vowel[j]) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		while(true) {
			String str = sc.nextLine();
			arr.add(str);
			if(str.equals("#")) {
				break;
			}
		}
		for(int i=0;i<arr.size()-1;i++) {
			count_vowel(arr.get(i));
		}
		
	}

}

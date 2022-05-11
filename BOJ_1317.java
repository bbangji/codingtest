import java.util.Scanner;

public class BOJ_1317 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] alp = new int[26];
		while(sc.hasNextLine()) {
			String phrase = sc.nextLine();
			for(int j=0;j<phrase.length();j++) {
				if(phrase.charAt(j)>='a' && phrase.charAt(j)<='z') {
					alp[phrase.charAt(j)-'a']++;
				}
		}
		}
		sc.close();
		int max = 0;
		for(int i=0;i<26;i++) {
			if(alp[i]>max) {
				max = alp[i];
			}
		}
		for(int i=0;i<26;i++) {
			if(alp[i]==max) {
				System.out.print((char)(i+'a'));
			}
		}

	}

}

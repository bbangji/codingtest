import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1296 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int n = sc.nextInt();
		String[] team = new String[n];
		for(int i=0;i<n;i++) {
			team[i] = sc.next();
		}
		sc.close();
		int max = -1;
		for(String val : team) {
			if(winRate(name, val)>max) {
				max = winRate(name, val);
			}
		}
		Arrays.sort(team);
		for(String val : team) {
			if(winRate(name, val)==max) {
				System.out.println(val);
				break;
			}
		}
		
	}
	static int winRate(String name, String team) {
		String love = "LOVE";
		int[] count = new int[4];
		int total = 1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<name.length();j++) {
				if(love.charAt(i)==name.charAt(j)) {
					count[i]++;
				}
			}
			for(int j=0;j<team.length();j++) {
				if(love.charAt(i)==team.charAt(j)) {
					count[i]++;
				}
			}
		}
		for(int i=0;i<4;i++) {
			for(int j=i+1;j<4;j++) {
				total *= (count[i]+count[j]);
			}
		}
		return total%100;
	}
}

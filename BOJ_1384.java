import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_1384 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// group rotation - while if 0 break
		int num = 1;
		while(true) {
			int n = sc.nextInt();
			if(n==0) {
				break;
			}
			// name에 한 줄 씩 담기?
			String[][] letter = new String[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					letter[i][j] = sc.next();
				}
			}
			ArrayList<String> nasty = new ArrayList<String>();
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(letter[i][j].equals("N")) {
						if(i<j) {
							nasty.add(letter[i-j+n][0]+" was nasty about "+letter[i][0]);
						} else {
						nasty.add(letter[i-j][0]+" was nasty about "+letter[i][0]);
						}
					}
				}
			}
			System.out.println("Group "+num);
			if(nasty.size()!=0) {
				for(String val : nasty) {
					System.out.println(val);
				} 
			} else {
				System.out.println("Nobody was nasty");
			}
			System.out.println();
			num++;
		}

	}

}

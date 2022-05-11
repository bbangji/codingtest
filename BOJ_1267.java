import java.util.Scanner;

public class BOJ_1267 {
	
	static int Y_plan(int call) {
		int i=0;
		while(call>=0) {
			call -= 30;
			i++;
		}
		return 10*i;
	}
	static int M_plan(int call) {
		int i=0;
		while(call>=0) {
			call -= 60;
			i++;
		}
		return 15*i;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//영식 -> 30초에 10
		//민식 -> 60초에 15
		int n = sc.nextInt();
		int Y_sum = 0;
		int M_sum = 0;
		for(int i =0;i<n;i++) {
			int call = sc.nextInt();
			Y_sum += Y_plan(call);
			M_sum += M_plan(call);
		}
		
		if(Y_sum>M_sum) {
			System.out.print('M'+" "+M_sum);
		} else if(Y_sum<M_sum) {
			System.out.print('Y'+" "+Y_sum);
		} else {
			System.out.print('Y'+" "+'M'+" "+Y_sum);
		}
		
	}

}

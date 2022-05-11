import java.util.Scanner;

public class BOJ_1350 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] file = new long[N];
		for(int i=0;i<N;i++) {
			file[i] = sc.nextLong();
		}
		int cl = sc.nextInt();
		sc.close();
		
		long disk = 0;
		for(long val : file) {
			if(val==0) {
				disk += 0;
			} else if(val<=cl) {
				disk += cl;
			} else if(val%cl!=0){
				disk += ((val/cl)+1)*cl;
			} else {
				disk += val;
			}
		}
		System.out.println(disk);
	}
}

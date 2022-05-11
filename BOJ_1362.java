
import java.util.Scanner;

public class BOJ_1362 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idx = 0;
		while(true) {
		idx++;
		int o = sc.nextInt();
		int w = sc.nextInt();
		if(o==0 && w==0) {
			break;
		}
		String pet_state;
			while(true) {
				char pet = sc.next().charAt(0);
				int n = sc.nextInt();
				if(pet=='#') {
					break;
				}
				if(pet=='F') {
					w += n;
				} else if(pet=='E'){
					w -= n;
				}
				if(w<=0) {
					pet_state = "RIP";
					break;
				}
			}
			if(w>o/2 && w<o*2) {
				pet_state = ":-)";
			} else if(w<=0){
				pet_state = "RIP";
			} else {
				pet_state = ":-(";
			}
			System.out.println(idx+" "+pet_state);
		}
	}

}

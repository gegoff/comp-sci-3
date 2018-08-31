
public class Two {

	public static void main(String[] args) {
		int num=1;
		int nextNum=2;
		int sum = 0;
		boolean go = true;
		while(go){
			if(nextNum%2==0) {
				sum+=nextNum;
			}
			int i = nextNum;
			nextNum+=num;
			num=i;
			if(nextNum>=4000000) {
				go=false;
			}
		}
		System.out.println(sum);

	}

}

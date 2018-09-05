
public class Five {

	public static void main(String[] args) {
		
		for(long i = 20; i<670442572800.0;i+=20) {
			boolean ans = true;
			for(int j = 2;j<21;j++) {
				if(i%j!=0) {
					ans=false;
					break;
				}
			}
			if(ans) {
				System.out.println(i);
				break;
			}
		}

	}

}

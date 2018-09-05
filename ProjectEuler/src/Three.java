
public class Three {

	public static void main(String[] args) {
		for(long i = 2; i<150212868785.0;i++) {
			if(600851475143.0%i==0) {
				if(prime((long)600851475143.0/i)) {
					System.out.println(600851475143.0/i);
					break;
				}
			}
		}

	}
	
	public static boolean prime(long num) {
		for(long i = 2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}

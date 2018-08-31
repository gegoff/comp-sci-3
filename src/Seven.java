import java.util.Stack;

public class Seven {

	public static void main(String[] args) {
		Stack primes = new Stack();
		
		for(long i = 2; i<Math.pow(10, 10);i++) {
			if(prime(i)) {
				primes.push(i);
				if(primes.search(i)==10001) {
					System.out.println(i);
					break;
				}
			}
			
		}
	}
	public static boolean prime(long num) {
		if(num%2==0 && num!=2) {
			return false;
		}
		for(long i = 2; i<Math.sqrt(num)+1; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}

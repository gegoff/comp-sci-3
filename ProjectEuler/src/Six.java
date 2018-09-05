
public class Six {

	public static void main(String[] args) {
		long sumSq = 0;
		long sqSum = 0;
		for(int i = 1; i<101;i++) {
			sumSq+=Math.pow(i, 2);
		}
		for(int i=1; i<101; i++) {
			sqSum+=i;
		}
		sqSum=(int)Math.pow(sqSum, 2);
		long ans = Math.abs(sumSq-sqSum);
		System.out.println(ans);

	}

}

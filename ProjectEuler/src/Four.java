
public class Four {

	public static void main(String[] args) {
		int ans=0;
		for(int i = 999; i>99;i--) {
			for(int j = 999; j>99;j--) {
				if(palindrome(i*j) && i*j>ans) {
					ans=i*j;
				}
			}
			
		}
		System.out.println(ans);
		

	}
	public static boolean palindrome(int num) {
		String temp = ""+num;
		String back="";
		for(int i = temp.length()-1;i>=0;i--) {
			back+=temp.charAt(i)+"";
		}
		if(temp.equals(back)) {
			
			return true;
		}
		return false;
	}

}

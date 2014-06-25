package eureka;

public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long n=(long) Math.pow(2, 1000);
		int sum=0;
		System.out.println(n);
		while(n>0)
		{
			sum+=(n%10);
			n=n/10;
			System.out.println(sum);
		}
		System.out.println(sum);
	}

}

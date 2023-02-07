package adactin;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int flag=0;
		int n=33;
		
		for(int i=1; i<=n; i++) {
			if(n/i==0) {
				System.out.println(n+ "is  not prime");
			flag=1;
			break;
			}
			 {
				if(flag==0) {
				System.out.println(n+ " is prime");
			}}
	}}}



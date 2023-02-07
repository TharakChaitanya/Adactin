package adactin;
class login{
	public void loginn() {
		
	System.out.println("login");}}

	class password extends loginpage
	{
		public void passwordd() {
			System.out.println("PAss");
		}}
		class c extends password{
		public void search()
		{
		System.out.println("searched");	
		}
		}
public class Inheritanceadactin {

	public static void main(String[] args) {
	
		c in= new c();
		in.loginn();
		in.passwordd();
		in.search();}
		

		
	}



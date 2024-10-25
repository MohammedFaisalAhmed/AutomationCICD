package programs;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Faisal";
		String b = "Ahmed";
		
		a=a+b;
		
		b= a.substring(0,a.length()-b.length());
		a= a.substring(b.length());
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		

	}

}

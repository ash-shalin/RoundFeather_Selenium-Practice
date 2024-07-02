package strings;

public class ReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="malayalam";
		String b="";
		for(int i= a.length()-1;i>=0;i--) {
		b=	b+a.charAt(i);
		}
		System.out.println(b);
		if(a.equals(b)) {
			System.out.println(a+" is palindrome");
		}
		else
			System.out.println(a+ " is not palindrome");

		String z="boby";
		String y="";
		for(int k=z.length()-1;k>=0;k--) {
			y=y+z.charAt(k);
		}
		System.out.println(y);
	}

}
	
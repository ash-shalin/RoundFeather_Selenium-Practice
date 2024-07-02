
public class Overloading {
public void m1(char a) {
	System.out.println("char");
	
}
public void m1(int a) {
	System.out.println("short");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Overloading o = new Overloading();
byte b=1;

o.m1(b);
o.m1(1);
	}

}

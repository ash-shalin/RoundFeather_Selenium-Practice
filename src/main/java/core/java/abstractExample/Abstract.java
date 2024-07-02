package core.java.abstractExample;
//if there any method in class which is abstract then the class will be treated as abstract class
//unlike interfaces, this abstract class can have methods(concrete) which have implementation as well. so with abstract class only partial abstraction is acheived.
public abstract class Abstract{
	public static void main(String[] args) {
		
	}

	public abstract void partial();
	public void concrete() {
		System.out.println();
	}
}

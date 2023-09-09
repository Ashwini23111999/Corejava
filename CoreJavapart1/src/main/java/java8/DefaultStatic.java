package java8;
interface MyInter1{
	void msg();
	default void display() {
		System.out.println("Default method of interface");
	}
	static void displayStatic() {
		System.out.println("static display method");
	}
}
public class DefaultStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package java8;

@FunctionalInterface
interface Display {
	void display();
}
public class MethodRefEX {
    public void myMethod() {
    	System.out.println("Method reference in java 8");
    }
	public static void main(String[] args) {
		MethodRefEX obj = new MethodRefEX();
		obj.myMethod();
		System.out.println("++++++++++++++");
		Display ref = obj::myMethod;
		ref.display();	
	}
}

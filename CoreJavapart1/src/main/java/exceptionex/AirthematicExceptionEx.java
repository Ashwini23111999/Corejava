package exceptionex;
//Unchecked /Runtime Exception
public class AirthematicExceptionEx {

	public static void main(String[] args) {
		try {
		int c=10/4;
		System.out.println("Value of c: "+c);
		int a[]= {1,2,3,4,5};
		a[2]=45;
		System.out.println(a[2]);
		int a1=Integer.parseInt("123");
		System.out.println(a1);
		
		}
		catch(ArithmeticException e){
			System.out.println("number canot divide by zero" +e);
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		}
		catch(NumberFormatException e2) {
			System.out.println(e2);
		}
		finally {
			System.out.println("End of code");
			}
		}

	}



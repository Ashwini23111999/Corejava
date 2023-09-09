package java8;

 interface Myinterface {
	 int add(int a,int b);
	 //int mul(int m, int n);
 }
 
public class LambdaEx {

	public static void main(String[] args) {
		Myinterface mf =(int a,int b)->a+b;
		System.out.println("Addition of 2 number is:......"+mf.add(10, 90));
		//System.out.println("multiplication:"+mf.mul(4, 5));

	}

}

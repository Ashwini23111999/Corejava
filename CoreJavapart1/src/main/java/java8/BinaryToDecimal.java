package java8;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
        int a =12;//Decimal
        String b = Integer. toBinaryString(a);//convert Decimal to Binary
        System.out.println(b);
        
        String f=Integer.toHexString(a);//convert Decimal to Hexadecimal
        System.out.println(f);
        
        String c=Integer.toOctalString(a);//covert Decimal to octal
        System.out.println(c);        
	}

}

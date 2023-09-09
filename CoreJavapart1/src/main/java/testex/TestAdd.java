package testex;

import static org.unit.Assert.assertEquals;

import org.junit.Test;

public class TestAdd {
    public int add(int a,int b) {
    	return a+b;
    }
    @Test
    public void addTest() {
    	TestAdd t=new TestAdd();
    	assertEquals(2, t.add(1, 1));
    }

}
 
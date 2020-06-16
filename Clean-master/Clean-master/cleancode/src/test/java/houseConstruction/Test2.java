package houseConstruction;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test2 {

	@Test
	public void test() {
		Calculation obj=new Calculation();
		double output;
		output=obj.constructionCost(300,1,0);
		assertEquals(450000.0,output,200.0);
	}

}

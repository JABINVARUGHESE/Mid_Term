import org.testng.Assert;
import org.testng.annotations.*;
public class MidTermTest {

			@Test
			public void test1() {
			MidTerm obj = new MidTerm();
			int test1 = obj.check("Rohan", "2312");
			Assert.assertEquals(0, test1);
			}
			@Test
			public void test2() {
			MidTerm obj = new MidTerm();
			int test2 = obj.check("Jabin", "1112");
			Assert.assertEquals(0, test2);
			}
	}


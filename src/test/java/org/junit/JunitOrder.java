package org.junit;
public class JunitOrder {
	
	@BeforeClass
	public static void start() {
System.out.println("start");
	}
	
	@Before
	public  void forehead() {
System.out.println("before");
	}
	
	@Test
	public  void tC1() {
System.out.println("tc1");
	}
	
	@Test
	public void tC2() {
System.out.println("tC2");
	}
	
	@Test
	public void tC3() {
System.out.println("tC3");
	}
	
	@After
	public  void after() {
System.out.println("after");
	}
	
	@AfterClass
	public static void afterClass() {
System.out.println("exit");
	}


}

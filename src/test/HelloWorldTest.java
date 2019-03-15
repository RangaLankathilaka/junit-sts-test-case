package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {
	
	private HelloWorld helloworld;
	
  public HelloWorldTest() {
	  helloworld=new HelloWorld();
	}
	
	
	@Test
	void testAdd() {
	
		int sum=helloworld.add(23, 2);
		assertEquals(25, sum);
	}
	
	@Test
	void testNameList() {
		
	}
	/**
	 * this test method use to check insertion order 
	 */
	@Test
	public void testAddAndGet1() {
	   
		 helloworld.nameList.add("Sanka");
		 helloworld.nameList.add("Ranga");
		 helloworld.nameList.add("Rangana");
		 helloworld.nameList.add("Nuwan");
	    assertEquals("Sanka", helloworld.nameList.get(0));
	    assertEquals("Ranga", helloworld.nameList.get(1));
	    assertEquals("Rangana", helloworld.nameList.get(2));
	    assertEquals("Nuwan", helloworld.nameList.get(3));

	    assertEquals("Sanka", helloworld.nameList.get(0),"second attempt");   // make sure I can get them a second time
	    assertEquals("Ranga", helloworld.nameList.get(1),"second attempt");
	}
	
	
	/**
	 * this test method use to check insertion with array list size
	 */
	
	
	@Test
	public void testSize1() {
	   
	    assertEquals(0, helloworld.nameList.size());
	    helloworld.nameList.add("Sanka");
	    assertEquals(1, helloworld.nameList.size());
	    helloworld.nameList.add("Ranga");
	    assertEquals(2, helloworld.nameList.size());
	    helloworld.nameList.add("Ranga");
	    assertEquals(3, helloworld.nameList.size());
	    helloworld.nameList.add("Nuwan");
	    assertEquals(4, helloworld.nameList.size());
	    assertEquals( 4, helloworld.nameList.size(),"second attempt");   // make sure I can get size again
	}
	
	/**
	 * this test method is use to check whether array list is empty or not
	 */
	
	@Test
	public void testIsEmpty1() {
	  
	    assertTrue(helloworld.nameList.isEmpty());
	    helloworld.nameList.add("Sanka");
	    assertFalse( helloworld.nameList.isEmpty(),"should have one element");
	    helloworld.nameList.add("Ranga");
	    assertFalse( helloworld.nameList.isEmpty(),"should have two elements");
	}
	
	/*
	 * this test method use to check array is empty when use remove() method
	 */
	
	@Test
	public void testIsEmpty2() {
	    
		helloworld.nameList.add("Ranga");
		helloworld.nameList.add("Sanka");
	    assertFalse( helloworld.nameList.isEmpty(),"should have two elements");
	    helloworld.nameList.remove(1);
	    helloworld.nameList.remove(0);
	    assertTrue(helloworld.nameList.isEmpty(),"after removing all elements");
	    helloworld.nameList.add("Nuwan");
	    assertFalse( helloworld.nameList.isEmpty(),"should have one element");
	}




}

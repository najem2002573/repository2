package ex4.ex4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ex4.ex4.Triangle_clf_types.Triangle_Types;


public class AppTest{
	Triangle_clf_types tester=new Triangle_clf_types();
	
	@Test
	public void path1() {
		int a=5;
		int b=5;
		int c=5;
		
		String result = tester.classifyTriangle(a,b,c);
		String expected =tester.types.equilateral.toString();
		
		assertEquals(expected, result);
	}
	@Test
	public void path2() {
		int a=5;
		int b=5;
		int c=3;
		
		String result = tester.classifyTriangle(a,b,c);
		String expected =tester.types.isosceles.toString();
		
		assertEquals(expected, result);
	}
	
	@Test
	public void path3() {
		int a=5;
		int b=3;
		int c=5;
		
		String result = tester.classifyTriangle(a,b,c);
		String expected =tester.types.isosceles.toString();
		
		assertEquals(expected, result);
	}
	
	@Test
	public void path4() {
		int a=3;
		int b=5;
		int c=5;
		
		String result = tester.classifyTriangle(a,b,c);
		String expected =tester.types.isosceles.toString();
		
		assertEquals(expected, result);
	}
	
	@Test
	public void path5() {
		int a=4;
		int b=5;
		int c=6;
		
		String result = tester.classifyTriangle(a,b,c);
		String expected =tester.types.Scalene.toString();
		
		assertEquals(expected, result);
	}
	
	@Test
	public void path6() {
		int a=2;
		int b=3;
		int c=6;
		
		String result = tester.classifyTriangle(a,b,c);
		String expected =tester.types.Nottriangle.toString();
		
		assertEquals(expected, result);
	}
	
	@Test
	public void path7() {
		int a=2;
		int b=6;
		int c=3;
		
		String result = tester.classifyTriangle(a,b,c);
		String expected =tester.types.Nottriangle.toString();
		
		assertEquals(expected, result);
	}
	
	@Test
	public void path8() {
		int a=7;
		int b=2;
		int c=3;
		
		String result = tester.classifyTriangle(a,b,c);
		String expected =tester.types.Nottriangle.toString();
		
		assertEquals(expected, result);
	}
	
	
	
}

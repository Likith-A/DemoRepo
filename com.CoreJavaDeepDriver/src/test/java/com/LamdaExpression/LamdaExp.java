package com.LamdaExpression;
/**
 * lamda expression
 * @author Likith
 * @version jdk11
 * @since 08/06/2023
 */
interface Calculator{
	public int add(int x, int y);
	
}

//class cla implements Calculator{
//	@Override
//	public int add(int x,int y) {
//		return (x+y);
//	}
//}
public class LamdaExp {

	public static void main(String[] args) {
//		cla c = new cla();
//		System.out.println(c.add(3, 4));
		
		Calculator c = (x,y)->x+y;
		System.out.println(c.add(5, 7));
	}

}

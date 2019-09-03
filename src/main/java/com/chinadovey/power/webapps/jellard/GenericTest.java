package com.chinadovey.power.webapps.jellard;


/**
 * 泛型
 * @author huaching01160510
 *
 * @param <E>
 */
public class GenericTest<A> {
	
	private A info;

	public GenericTest(A info) {
		super();
		this.info = info;
	}

	public A getInfo() {
		return info;
	}

	public void setInfo(A info) {
		this.info = info;
	}
	public static void main(String[] args) {
		GenericTest<String> g1 = new GenericTest<String>("hello generic");
		System.out.println(g1.getInfo());
		GenericTest<Double> g2 = new GenericTest<Double>(123d);
		System.out.println(g2.getInfo());
		
	}
	
	

}

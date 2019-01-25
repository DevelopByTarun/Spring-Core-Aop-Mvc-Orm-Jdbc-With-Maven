package com.app.spel.bean;

public class Display {
	private String a;
	private int b;
	private boolean c;
	private String d;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public boolean isC() {
		return c;
	}

	public void setC(boolean c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Display [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

}

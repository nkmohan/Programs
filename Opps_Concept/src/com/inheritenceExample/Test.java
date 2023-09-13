package com.inheritenceExample;

public class Test {
	public static void main(String[] args) {
		Father f = new Father();
		f.property();
		Son s = new Son();
		s.property();
		GrandSon Gs = new GrandSon();
		Gs.property();
		Gs.car();
	}

}

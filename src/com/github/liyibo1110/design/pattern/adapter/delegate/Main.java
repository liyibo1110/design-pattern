package com.github.liyibo1110.design.pattern.adapter.delegate;

public class Main {

	public static void main(String[] args) {
		
		Print p = new PrintBanner("hello");
		p.printWeek();
		p.printStrong();
	}
}

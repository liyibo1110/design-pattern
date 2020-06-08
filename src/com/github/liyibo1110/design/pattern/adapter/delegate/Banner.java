package com.github.liyibo1110.design.pattern.adapter.delegate;

public class Banner {

	private String content;
	
	public Banner(String content) {
		this.content = content;
	}
	
	public void showWithParen() {
		System.out.println("(" + content + ")");
	}
	
	public void showWithAster() {
		System.out.println("*" + content + "*");
	}
}

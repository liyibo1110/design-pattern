package com.github.liyibo1110.design.pattern.adapter.inherit;

/**
 * base on inherit
 * @author liyibo
 *
 */
public class PrintBanner extends Banner implements Print {

	public PrintBanner(String content) {
		super(content);
	}
	
	@Override
	public void printWeek() {
		showWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}

}

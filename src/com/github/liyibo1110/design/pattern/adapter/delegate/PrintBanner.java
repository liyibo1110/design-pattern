package com.github.liyibo1110.design.pattern.adapter.delegate;

/**
 * base on delegate
 * @author liyibo
 *
 */
public class PrintBanner extends Print {

	private Banner banner;
	
	public PrintBanner(String content) {
		banner = new Banner(content);
	}
	
	@Override
	public void printWeek() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}

}

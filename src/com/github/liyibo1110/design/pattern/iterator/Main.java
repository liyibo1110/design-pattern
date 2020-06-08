package com.github.liyibo1110.design.pattern.iterator;

public class Main {

	public static void main(String[] args) {
		
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Book A"));
		bookShelf.appendBook(new Book("Book B"));
		bookShelf.appendBook(new Book("Book C"));
		bookShelf.appendBook(new Book("Book D"));
		Iterator<Book> iter = bookShelf.iterator();
		while(iter.hasNext()) {
			Book book = iter.next();
			System.out.println(book.getName());
		}
	}
}

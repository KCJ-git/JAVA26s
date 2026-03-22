//package library;

public class Test {
    
    public static void mainTest() {
		addTest();
        borrowTest();
	}
	
	static void addTest() {
		Library lib= new Library(2);
		
		Book b1 = new Book("정석1", "저자1");
		Book b2 = new Book("정석2", "저자2");
		Book b3 = new Book("정석3", "저자3");
		
		lib.addBook(b1);
		lib.addBook(b2);
		lib.addBook(b3);
	}
	
	static void borrowTest() {
		Library lib= new Library(2);
		
		Book b1 = new Book("정석1", "저자1");
		Book b2 = new Book("정석2", "저자2");
		Book b3 = new Book("정석3", "저자3");
		
		lib.addBook(b1);
		lib.addBook(b2);
		lib.displayInfo();
		
		lib.borrowBook("정석1");
		lib.borrowBook("정석2");
		
		lib.displayInfo();
	}
}

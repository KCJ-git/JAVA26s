package library;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Library lib = new Library(3);
		
		lib.addBook(new Book("자바1", "저자1"));
		lib.addBook(new Book("자바2", "저자2"));
		lib.addBook(new Book("자바3", "저자3"));
		
		Scanner sc= new Scanner(System.in);
		
		
	String msg = """
				1.책 목록보기
				2.대여하기
				3.반납하기
				입력>>""";
	
	
	for(int i=0;i<10;i++) {
		System.out.println("=================");
		System.out.print(msg);
		int choice =sc.nextInt();
		
		if(choice==1) {
			lib.displayInfo();
		}else if(choice==2) {
			System.out.print("대여할 책 제목 입력>>");
			String brbook=sc.next();
			lib.borrowBook(brbook);
		
		}else if(choice==3) {
			System.out.print("반납할 책 제목 입력>>");
			String rtbook=sc.next();
			lib.returnBooks(rtbook);
		}else {
			System.out.println("잘못입력하셨습니다");
			
		}
	}
	return;
	}
}

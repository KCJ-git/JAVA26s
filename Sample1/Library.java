
public class Library {
    Book[] books;
	int bookCount;

    public Library(int capacity) {
		books=new Book[capacity];
	}

    void addBook(Book book) {
		if(bookCount<books.length) {
			books[bookCount]= book;
			bookCount++;
			System.out.println(book.title+"이(가) 등록되었습니다");
		}else {
			System.out.println("등록할 수 있는 최대치를 초과했습니다");
		}
	}

    void borrowBook(String title) {
	   	for(int i=0;i<bookCount;i++) {
			String bookTitle = books[i].title;
			if(bookTitle.equals(title)) {
				if(!books[i].borrowed) {
					books[i].borrowed=true;
					System.out.println(title+"이(가) 대여되었습니다");
				}else {
					System.out.println(title+"은(는) 이미 대여중입니다");
				}return;
			}
		}  System.out.println(title+"은(는) 도서관에 없습니다");
    
	}

    void returnBooks(String title) {
		for(int i=0;i<bookCount;i++) {
			String bookTitle = books[i].title;
			if(bookTitle.equals(title)) {
				if(books[i].borrowed) {
					books[i].borrowed=false;
					System.out.println(title+"이(가)반납되었습니다.");
				}else {
					System.out.println(title+"은(는) 이미 반납었습니다");
				}
			}
            return;
		} 
        System.out.println(title+"은(는) 도서관에 없습니다");
	}

    void displayInfo() {
		System.out.println("=======책 정보======");
		for(Book book : books) {
            System.out.println("책 제목:"+book.title+"대여여부:"+(book.borrowed? "대여중":"대여불가능"));
		}
	}
}
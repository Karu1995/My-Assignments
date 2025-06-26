package week1.Day2;

public class Library {

	public static String addBook(String bookTitle) {
		System.out.println(bookTitle+" Book added successfully");
		return bookTitle;
	}
	public static void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library.addBook("Harry Potter");
		Library.issueBook();

	}

}
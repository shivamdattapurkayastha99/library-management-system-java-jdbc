import java.util.Scanner;

import com.library.manage.BookDao;
import com.library.manage.books;

public class Start {

	public static void main(String[] args) {
		System.out.println("Welcome to Shivam Library Management System");
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter 1 to deposit book");
			System.out.println("Enter 2 to take book");
			System.out.println("Enter 3 to display books");
			System.out.println("Enter 4 to deposit book");
			int c = sc.nextInt();
			if (c == 1) {
				System.out.println("Enter book name");
				String name=sc.next();
				System.out.println("Enter number of copies");
				int copies=sc.nextInt();
				System.out.println("Enter the fine");
				int fine=sc.nextInt();
				books b=new books(name,copies,fine);
				boolean answer=BookDao.insertBookToDB(b);
				if(answer) {
					System.out.println("Book is added");
				}
				else {
					System.out.println("Something went wrong");
				}
				System.out.println(b);
				
				
			} 
			else if (c == 2) {
				System.out.println("Enter book id to delete");
				int bookId=sc.nextInt();
				boolean f=BookDao.deleteBook(bookId);
				if(f) {
					System.out.println("deleted");
				}
				else {
					System.out.println("Something went wrong");
				}
			} 
			else if (c == 3) {
				
				BookDao.showAllBooks();
				

			} 
			else if (c == 4) {
				break;
			} 
			else {

			}
		}
		System.out.println("Thank you for using shivam library");
		

	}

}

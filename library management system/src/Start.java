import java.util.Scanner;
import java.util.logging.Logger;

import com.library.manage.BookDao;
import com.library.manage.books;

public class Start {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Start.class.getName());
		logger.info("Welcome to Shivam Library Management System");
		Scanner sc = new Scanner(System.in);

		while (true) {
			logger.info("Enter 1 to deposit book");
			logger.info("Enter 2 to take book");
			logger.info("Enter 3 to display books");
			logger.info("Enter 4 to exit");
			int c = sc.nextInt();
			if (c == 1) {
				logger.info("Enter book name");
				String name=sc.next();
				logger.info("Enter number of copies");
				int copies=sc.nextInt();
				logger.info("Enter the fine");
				int fine=sc.nextInt();
				books b=new books(name,copies,fine);
				boolean answer=BookDao.insertBookToDB(b);
				if(answer) {
					logger.info("Book is added");
				}
				else {
					logger.info("Something went wrong");
				}
				System.out.println(b);
				
				
			} 
			else if (c == 2) {
				logger.info("Enter book id to delete");
				int bookId=sc.nextInt();
				boolean f=BookDao.deleteBook(bookId);
				if(f) {
					logger.info("deleted");
				}
				else {
					logger.info("Something went wrong");
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
		logger.info("Thank you for using shivam library");
		

	}

}

package metier;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import web.model.Book;

public class BookDAO implements ContratAccesAuDonnee {

	private List<Book> tableOfBooks;
	private static long id=0;
	
	public BookDAO()
	{
		Book book1=new Book(id++, "Title 1", "Auth 1", 10.1f);
		Book book2=new Book(id++, "Title 2", "Auth 2", 20.2f);
		Book book3=new Book(id++, "Title 3", "Auth 3", 30.3f);
		tableOfBooks=new ArrayList <Book>();
		tableOfBooks.add(book1);
		tableOfBooks.add(book2);
		tableOfBooks.add(book3);
		
	}
	@Override
	public Book findById(Long id) {
		for (Book book : tableOfBooks) {
			if(book.getId()==id)
				return book;
		}
		
		return null;
	}

	@Override
	public List<Book> findAll() {
	
		return tableOfBooks;
	}
	public int getlistSize()
	{
		
		return tableOfBooks.size();
	}

	@Override
	public boolean save(Book book) {
		
		tableOfBooks.add(book);
		return false;
	}

	@Override
	public boolean update(Book book) {
	if ( tableOfBooks.set(tableOfBooks.indexOf(book), book)!=null) 
		return true;
		return false;
	}

	@Override
	public boolean delete(Long id) {
	Book book = findById(id);
	if(book!=null)
	{
		return tableOfBooks.remove(book);
		
	}
		return false;
	}
	
 
	

}

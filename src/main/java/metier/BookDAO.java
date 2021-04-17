package metier;

import java.util.List;


import web.model.Book;

public class BookDAO implements ContratAccesAuDonnee {
 
	private static long id=0;
	
	public BookDAO() { 
		
	}
	
	
	
	
	@Override
	public Book findById(Long id) {
	for(Book book)
		return null;
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
	

}

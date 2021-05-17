package metier;
import web.model.Book;
import java.util.List;



public interface ContratAccesAuDonnee {
	
	Book findById(Long id);
	public List<Book> findAll();
	boolean save (Book book);
	boolean update (Book book);
	boolean delete (Long id);
	
}

package web.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.io.IOException;
import java.util.List;
import metier.BookDAO;
import metier.ContratAccesAuDonnee;
import web.model.Book;

@WebServlet(urlPatterns={"/book"})

public class BookServlet extends HttpServlet {

	
	
		public static final String VUE_LIST="BookList.jsp";
		public static final String VUE_FORM="BookForm.jsp";

	
	BookDAO Dao;
	
	@Override
	public void init() throws ServletException {
	 Dao = new BookDAO();
	}
	
	

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String action =request.getParameter("action");
		
		
		
 if(action != null) {
	 
	  if(action.equals("new")) {
		 System.out.println("new");
			System.out.println("Action :: "+action);
			addBook(request,response);
			
		}else if(action.equals("insert")) {
			System.out.println("insert");
			insertBook(request,response);
		}else if(action.equals("delete")) {
			
			deleteBook(request,response);
		}else if(action.equals("edit")) {
			
			editBook(request,response);
		}else if(action.equals("list")) {
			
			listBooks(request,response);
		}
		}else {
			
			System.out.println("else");
			listBooks(request,response);
			
			
			
			
	       }
		}
		
	
	
	
	
	private void addBook(HttpServletRequest request, HttpServletResponse response)
				         throws IOException,ServletException{
				RequestDispatcher dispatcher = request.getRequestDispatcher(VUE_FORM);
				dispatcher.forward(request, response);
	}
	

	
	
	private void editBook(HttpServletRequest request, HttpServletResponse response) 
						 throws IOException,ServletException{
				long id= Long.parseLong(request.getParameter("id"));
				Book book =Dao.findById(id);
				if (book!=null) 
					request.setAttribute("book", book);
				
				
				RequestDispatcher dispatcher = request.getRequestDispatcher(VUE_FORM);
				dispatcher.forward(request, response);
		
	}



	private void deleteBook(HttpServletRequest request, HttpServletResponse response) 
		 throws IOException,ServletException{
		
		long id = Long.parseLong(request.getParameter("id")) ;
		Dao.delete(id);
	
		 response.sendRedirect("book");
	}
	
	



	private void insertBook(HttpServletRequest request, HttpServletResponse response)
			 throws IOException,ServletException{
		 String id =request.getParameter("id");
		 String title =request.getParameter("bookTitle");
		 String author =request.getParameter("bookAuthor");
		 String price =request.getParameter("bookPrice");
		 
		 Book book;
		 if(id != null && id.trim().length() != 0 ) {
			 System.out.println("we are in if");
			 book = new Book(Long.parseLong(id),title,author,Float.parseFloat(price));
			 Dao.update(book);
			 
		 }else {
			 System.out.println("we are in else");
			List <Book> books= Dao.findAll();
			long idc = books.size();
			//long idc = Dao.getlistSize();
			
			 book = new Book(idc,title,author,Float.parseFloat(price));
			 
			 Dao.save(book);
		}
		 
		 response.sendRedirect("book");
		
		 
	}



	



	protected void listBooks(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
				List<Book> books = Dao.findAll();
				request.setAttribute("book_list" , books);
				RequestDispatcher Enveloppe= request.getRequestDispatcher(VUE_LIST);
				Enveloppe.forward(request, response);  
	}
	
	

	
  
 
	
	
	

}

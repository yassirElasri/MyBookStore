package web.model;

public class Book {

	private Long id;
	private String title, Author;
	private Float price;
	

	
	public Book(Long id, String title, String author, Float price) {
		super();
		this.id = id;
		this.title = title;
		Author = author;
		this.price = price;
	}
	
	public Book() {
		
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	
}

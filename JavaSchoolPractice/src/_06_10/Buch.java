package _06_10;


public class Buch{
	private String title;
	private String autor;
	private String isbn;
	public Buch(String title, String autor, String isbn) {
		super();
		this.title = title;
		this.autor = autor;
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Buch [title=" + title + ", autor=" + autor + ", isbn=" + isbn + "]";
	}
	
	
}
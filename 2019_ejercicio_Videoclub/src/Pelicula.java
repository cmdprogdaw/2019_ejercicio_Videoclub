
public class Pelicula {
	
	
	private String titulo;
	private int a�o;
	private String director;
	

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", a�o=" + a�o + ", director=" + director + "]";
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	
}

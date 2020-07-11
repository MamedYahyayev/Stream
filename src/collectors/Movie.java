package collectors;

public class Movie {
	private String title;
	private int like;
	private Genre genre;

	public Movie(String title, int like, Genre genre) {
		this.title = title;
		this.like = like;
		this.genre = genre;
	}

	public int getLike() {
		return like;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", like=" + like + "]";
	}

	public Genre getGenre() {
		return genre;
	}

}

package mapping;

public class Movie {
	private String title;
	private int like;

	public Movie(String title, int like) {
		this.title = title;
		this.like = like;
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

	
	
}

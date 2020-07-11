package reducers;

import java.util.Comparator;

public class Movie implements Comparator<Movie> {
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
	public int compare(Movie arg0, Movie arg1) {
		return 0;
	}

}

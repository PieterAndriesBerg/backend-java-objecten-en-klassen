package BonusOpdrachten;

import java.text.SimpleDateFormat;

public class Film {
    private String title;
    private String director;
    private SimpleDateFormat releaseDate;
    private String genre;

    public Film(String title, String director, SimpleDateFormat releaseDate, String genre) {
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public SimpleDateFormat getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(SimpleDateFormat releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void printFilmInfo() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Release date: " + releaseDate.toPattern());
        System.out.println("Genre: " + genre);
    }




}

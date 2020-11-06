package com.company.book;

public class Book {

    private String author;
    private String name;
    private int year;
    private String genre;


    public Book() {
    }

    public Book(String author, String name, int year, String genre) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.genre = genre;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void setYear(int year) {
        this.year = year;
    }

    public long getYear() {
        return this.year;
    }


    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }


    @Override
    public String toString() {
        String out = "\nAuthor: " + this.author + "\nName: " + this.name + "\nYear: " + this.year
                + "\nGenre: " + this.genre;
        return out;

    }
}
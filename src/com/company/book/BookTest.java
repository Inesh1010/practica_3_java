package com.company.book;

public class BookTest {

    public static void main(String[] args) {


        Book myBook = new Book("Lev Tolstoy", "War and peace", 1867, "novel");
        System.out.println(myBook);


        myBook.setAuthor("Pushkin");
        myBook.setName("Onegin");
        myBook.setYear(1833);
        myBook.setGenre("novel");
        System.out.println("\n" + myBook);

    }

}
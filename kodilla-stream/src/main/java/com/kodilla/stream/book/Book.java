package com.kodilla.stream.book;

public final class Book {
    private final String author;
    private final String tile;
    private final int yearOfPublication;
    private final String signature;

    public Book(final String author, final String tile, final int yearOfPublication, final String signature) {
        this.author = author;
        this.tile = tile;
        this.yearOfPublication = yearOfPublication;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTile() {
        return tile;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", tile='" + tile + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", signature=" + signature +
                '}';
    }
}

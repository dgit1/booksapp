package com.example.booksapp.models;

import java.io.Serializable;

public class NewBookModel implements Serializable {


    private String ID;
    private String bookName;
    private String bookDetails;
    private String bookAuthor;
    private String bookPubDate;
    private String bookCategory;
    private String bookPDFLink;
    private String bookThumbnail;


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDetails() {
        return bookDetails;
    }

    public void setBookDetails(String bookDetails) {
        this.bookDetails = bookDetails;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getBookPDFLink() {
        return bookPDFLink;
    }

    public void setBookPDFLink(String bookPDFLink) {
        this.bookPDFLink = bookPDFLink;
    }

    public String getBookThumbnail() {
        return bookThumbnail;
    }

    public void setBookThumbnail(String bookThumbnail) {
        this.bookThumbnail = bookThumbnail;
    }
}

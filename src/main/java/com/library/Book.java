package com.library;

public class Book extends LibraryItem {
    private String author;

    public Book(String title, String id, String author){
        super(title, id);
        this.author = author;
    }

    public String getAuthor(){ return this.author;}

    @Override
    public void displayDetails(){
        System.out.println("--- Library Item Details ---");
        System.out.println("Title: " + getTitle());
        System.out.println("Item ID: " + getId());
        System.out.println("Author: " + this.author);
        System.out.println("Status: " + (isAvailable() ? "Available" : "Checked Out"));
    }

}

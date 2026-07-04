package com.library;

public class LibraryItem {
    private String title;
    private String id;
    private boolean isAvailable;

    public LibraryItem(String title, String id){
        this.title = title;
        this.id = id;
        isAvailable = true;
    }

    public String getTitle(){ return this.title;}
    public String getId(){ return this.id;}
    public boolean isAvailable(){ return isAvailable;}

    public void checkOut(){
        if (isAvailable == true){
            isAvailable = false;
            System.out.println(title + " has been successfully checked out.");
        }else {
            System.out.println( title + " is already checked out!");
        }
    }

    public void returnItem(){
        if (isAvailable == false){
            isAvailable = true;
            System.out.println(title + " has been returned.");
        }
    }

    public void displayDetails() {
        System.out.println("--- Library Item Details ---");
        System.out.println("Title: " + this.title);
        System.out.println("Item ID: " + this.id);
        System.out.println("Status: " + (isAvailable ? "Available" : "Checked Out"));
    }


}

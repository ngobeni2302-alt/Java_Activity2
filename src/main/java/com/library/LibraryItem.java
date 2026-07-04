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




}

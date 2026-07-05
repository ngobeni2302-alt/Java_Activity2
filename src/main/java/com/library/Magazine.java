package com.library;

public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String id, int issueNumber){
        super(title, id);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber(){ return this.issueNumber;}

    @Override

    public void displayDetails(){
        super.displayDetails();
        System.out.println("IssueNumber: " + this.issueNumber);
    }


}

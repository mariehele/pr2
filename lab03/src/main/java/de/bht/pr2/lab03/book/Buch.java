package de.bht.pr2.lab03.book;

public class Buch {

    private String title;
    private String type;
    private String price;
    private String year;

    public Buch(String title, String type, String price, String year) {

       this.title = title;
       this.type = type;
       this.price = price;
       this.year = year;

    }

    public String getTitle(){
        return title;
    }

    public String getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public String getYear() {
        return year;
    }
}

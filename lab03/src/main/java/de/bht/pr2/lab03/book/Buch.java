package de.bht.pr2.lab03.book;

public class Buch {

    private String title;
    private String type;
    private String price;

    public Buch(String title, String type, String price) {

       this.title = title;
       this.type = type;
       this.price = price;

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
}

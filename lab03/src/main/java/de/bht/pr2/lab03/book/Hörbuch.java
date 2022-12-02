package de.bht.pr2.lab03.book;

public class Hörbuch extends Buch {

    private String title;
    private String type;
    private String price;
    private String stream;
    private String year;

    public Hörbuch(String title, String type, String price, String year, String stream) {
        super(title, type, price, year);
        this.title = title;
        this.type = type;
        this.price = price;
        this.year = year;
        this.stream = stream;
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

    public String getStream(){
        return stream;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }
}

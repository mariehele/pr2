package de.bht.pr2.lab03.book;

public class EBuch extends Buch {

    private String title;

    private String type;
    private String price;
    private String year;
    private String version;

    public EBuch(String title, String type, String price, String year, String version) {
        super(title, type, price, year);
        this.title = title;
        this.type = type;
        this.price = price;
        this.year = year;
        this. version = version;

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
    public String getVersion(){
        return version;
    }

    public void setVersion(String v){
        version = v;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String y){
        year = y;
    }

}

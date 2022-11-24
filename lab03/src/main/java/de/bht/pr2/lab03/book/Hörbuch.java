package de.bht.pr2.lab03.book;

public class Hörbuch extends Buch {

    private String stream;
    public Hörbuch(String title, String type, String price, String stream) {
        super(title, type, price);
        this.stream = stream;
    }

    public String getStream(){
        return stream;
    }

    public void setStream(String s){
        stream = s;
    }

}

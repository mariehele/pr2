package de.bht.pr2.lab03.book;

public class Hörbuch extends Buch {

    private String stream;
    public Hörbuch(String buch, String stream) {
        super(buch);
        this.stream = stream;
    }

    public String getStream(){
        return stream;
    }

    public void setStream(String s){
        stream = s;
    }

}

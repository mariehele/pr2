package de.bht.pr2.lab03.book;

public class EBuch extends Buch {

    private String version;

    public EBuch(String title, String type, String price, String version) {
        super(title, type, price);
        this.version = version;
    }

    public String getVersion(){
        return version;
    }

    public void setVersion(String v){
        version = v;
    }

}

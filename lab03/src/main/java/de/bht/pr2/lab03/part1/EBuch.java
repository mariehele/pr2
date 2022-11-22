package de.bht.pr2.lab03.part1;

public class EBuch extends Buch {

    private String version;

    public EBuch(String buch, String version) {
        super(buch);
        this.version = version;
    }

    public String getVersion(){
        return version;
    }

    public void setVersion(String v){
        version = v;
    }

}

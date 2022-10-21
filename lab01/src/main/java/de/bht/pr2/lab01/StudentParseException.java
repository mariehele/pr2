package de.bht.pr2.lab01;

public class StudentParseException extends Exception{

    public StudentParseException (String zeile){
        super("Die Daten sind nicht vollständig angegeben. Die falsche Zeile ist die folgende: " + zeile);
    }

}

package de.bht.pr2.lab01;

public class RegistrationNumberException extends Exception {

    public RegistrationNumberException (String nummer) {
        super("Die angegebene Matrikelnummer (" + nummer + ") ist ungültig.");
    }

}

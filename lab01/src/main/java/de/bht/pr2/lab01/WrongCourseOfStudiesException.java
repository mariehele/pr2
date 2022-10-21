package de.bht.pr2.lab01;

public class WrongCourseOfStudiesException extends Exception{

    public WrongCourseOfStudiesException(String studiengang){
        super("Der angegebene Studiengang (" + studiengang +") ist ungültig.");
    }

}

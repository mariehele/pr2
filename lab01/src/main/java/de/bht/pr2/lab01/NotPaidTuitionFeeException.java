package de.bht.pr2.lab01;

public class NotPaidTuitionFeeException extends Exception {

    public NotPaidTuitionFeeException(String gebuehr){
        super("Die Semestergebühr ist nicht vollständig gezahlt. Bisher wurden " + gebuehr + " von 312 Euro gezahlt.");
    }

}

package de.bht.pr2.lab03.book;

import de.bht.pr2.lab03.book.Buch;
import de.bht.pr2.lab03.book.EBuch;
import de.bht.pr2.lab03.book.Hörbuch;

import java.util.ArrayList;
import static de.bht.pr2.lab03.store.BookStore.getSoldBooks;

public class Parser {
    public static Buch buch;

    public static Buch parseBook(String b){
        String[] book = new String[5];
        book = b.split(";");
        if (book[1].equals("Buch")){
            buch = new Buch(book[0], book[1], book[2], book[3]);
        }
        else if(book[1].equals("Hoerbuch")){
            buch = new Hörbuch(book[0], book[1], book[2], book[3], book[4]);
        }
        else if(book[1].equals("Ebuch")){
            buch = new EBuch(book[0], book[1], book[2], book[3], book[4]);
        }
        System.out.println(buch.getType());
        return buch;
    }


}

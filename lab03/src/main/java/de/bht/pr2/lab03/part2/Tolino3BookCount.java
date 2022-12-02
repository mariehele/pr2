package de.bht.pr2.lab03.part2;

import de.bht.pr2.lab03.book.Buch;
import de.bht.pr2.lab03.book.EBuch;
import de.bht.pr2.lab03.book.Hörbuch;
import de.bht.pr2.lab03.store.BookStore;

import java.util.ArrayList;

public class Tolino3BookCount {

  public static void main(String[] args) {
    /* Das Ergebnis der Berechnungen sollte sein:

    Anzahl Ebuecher bei Tolino 3: 9

     */


    ArrayList<Buch> books = BookStore.getBooks();
    int anzahl = 0;

    for(int i=0; i<books.size(); i++) {

      if (books.get(i) instanceof EBuch){
        EBuch e = (EBuch)books.get(i);
        if (e.getVersion().equals("3")){
          anzahl = anzahl + 1;
        }

      }

    }

    System.out.println("Anzahl Ebuecher bei Tolino 3: "+anzahl);

  }
}

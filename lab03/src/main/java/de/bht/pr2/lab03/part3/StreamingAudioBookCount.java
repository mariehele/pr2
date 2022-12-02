package de.bht.pr2.lab03.part3;

import de.bht.pr2.lab03.book.Buch;
import de.bht.pr2.lab03.book.EBuch;
import de.bht.pr2.lab03.book.Hörbuch;
import de.bht.pr2.lab03.store.BookStore;

import java.util.ArrayList;

public class StreamingAudioBookCount {

  public static void main(String[] args) {
    /* Das Ergebnis der Berechnungen sollte sein:

    Anzahl Hoerbuecher per Streaming: 5


     */
    ArrayList<Buch> books = BookStore.getBooks();
    int anzahl = 0;

    for(int i=0; i<books.size(); i++) {

      if (books.get(i) instanceof Hörbuch){
        Hörbuch e = (Hörbuch) books.get(i);
        if (e.getStream().equals("Streaming")){
          anzahl = anzahl + 1;
        }

      }

    }
    System.out.println("Anzahl Hörbücher per Streaming: "+anzahl);


  }
}

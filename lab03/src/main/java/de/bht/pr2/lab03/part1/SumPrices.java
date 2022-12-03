package de.bht.pr2.lab03.part1;

import de.bht.pr2.lab03.book.Hörbuch;
import de.bht.pr2.lab03.store.BookStore;
import de.bht.pr2.lab03.book.Buch;

import java.util.ArrayList;
import java.util.List;

public class SumPrices {




    /* Das Ergebnis der Berechnungen sollte sein:

    Summe Buch:     € 381.88
    Summe Ebuch:    € 255.82
    Summe Hoerbuch: € 344.58
    Summe Alle:     € 982.28
   */

  public static void main (String[] args){
    ArrayList<Buch> books = BookStore.getBooks();

    double summeB = 0;
    double summeE = 0;
    double summeH = 0;
    double summeG = 0;
    double s = 0;

    for(int i=0; i<books.size(); i++){
      s = Double.parseDouble(books.get(i).getPrice());
      switch (books.get(i).getType()) {
        case "Buch" -> {
          summeB += s;
          summeG += s;
        }
        case "Hoerbuch" -> {
          summeH += s;
          summeG += s;
        }
        case "Ebuch" -> {
          summeE += s;
          summeG += s;
        }
      }
    }

    double sumB = Math.round(summeB * 100000);
    double sumE = Math.round(summeE * 100000);
    double sumH = Math.round(summeH * 100000);
    double gesamt = Math.round(summeG * 100000);

    System.out.println("Buch:    €" + sumB / 100000);
    System.out.println("EBuch:   €" + sumE / 100000);
    System.out.println("Hörbuch: €" + sumH / 100000);
    System.out.println("Alle:    €" + gesamt / 100000);
  }


}

package de.bht.pr2.lab03.part1;

import de.bht.pr2.lab03.store.BookStore;
import de.bht.pr2.lab03.book.Buch;

import java.util.List;

public class SumPrices {

  public static void main(String[] args) {
    /* Das Ergebnis der Berechnungen sollte sein:

    Summe Buch:     € 381.88
    Summe Ebuch:    € 255.82
    Summe Hoerbuch: € 344.58
    Summe Alle:     € 982.28
   */
    List<String> store = BookStore.getSoldBooks();

    double summeB = 0;
    double summeE = 0;
    double summeH = 0;

    for (int i = 0; i<store.size(); i++){
      String s = store.get(i);
      Buch book = new Buch (s);


      String[] components = s.split(";");

      if (components[1].equals("Buch")){
        summeB = summeB + Double.parseDouble(components[2]);
      }
      else if (components[1].equals("Ebuch")) {
        summeE = summeE + Double.parseDouble(components[2]);
      }
      else if (components[1].equals("Hoerbuch")){
        summeH = summeH + Double.parseDouble(components[2]);
      }


    }
    double sumB = Math.round(summeB * 100000);
    double sumE = Math.round(summeE * 100000);
    double sumH = Math.round(summeH * 100000);
    double gesamt = sumE + sumB + sumH;



    System.out.println("Buch:    €" + sumB / 100000);
    System.out.println("EBuch:   €" + sumE / 100000);
    System.out.println("Hörbuch: €" + sumH / 100000);
    System.out.println("Alle:    €" + gesamt / 100000);
  }
}

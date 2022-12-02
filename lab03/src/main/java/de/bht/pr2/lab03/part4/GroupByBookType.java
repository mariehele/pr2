package de.bht.pr2.lab03.part4;

import de.bht.pr2.lab03.book.Buch;
import de.bht.pr2.lab03.book.EBuch;
import de.bht.pr2.lab03.book.Hörbuch;
import de.bht.pr2.lab03.store.BookStore;

import java.util.ArrayList;
import java.util.List;

public class GroupByBookType {

  public static void main(String[] args) {
    /* Das Ergebnis der Berechnungen sollte sein:

Buecher Anzahl: 6
	Buch: 7 Minuten am Tag (2016)
	Buch: Der Heimweg (2016)
	Buch: Ohne Schuld (2020)
	Buch: Escape Room (2020)
	Buch: Der Heimweg (2020)
	Buch: Ohne Schuld (2016)
Ebuecher Anzahl: 4
	Ebuch: Ohne Schuld (2020)
	Ebuch: Der Heimweg (2020)
	Ebuch: Zwei Handvoll Leben (2020)
	Ebuch: Kingsbridge - Der Morgen einer neuen Zeit (2020)
Hoerbuecher Anzahl: 5
	Hoerbuch: QualityLand 2.0 (2019)
	Hoerbuch: Funken Mord (2018)
	Hoerbuch: QualityLand 2.0 (2018)
	Hoerbuch: Funken Mord (2019)
	Hoerbuch: Harry Potter - alle 7 Baende (2018)

     */

    ArrayList<Buch> books = BookStore.getBooks();
    List<Buch> buecher = new ArrayList<>();
    List<Buch> hbuecher = new ArrayList<>();
    List<Buch> ebuecher = new ArrayList<>();

    for(int i=0; i<books.size(); i++) {
      Buch b = books.get(i);
      String ti = books.get(i).getTitle();
      String t = books.get(i).getType();
      String y = books.get(i).getYear();
      boolean doppelt = false;

      if(t.equals("Buch")){
        for (Buch bu: buecher)
        {
          if(bu.getYear().equals(y) && bu.getTitle().equals(ti)){
            doppelt = true;
          }
        }
        if (doppelt == false){
          buecher.add(b);
        }
        else {doppelt = false;}
      }
      else if (t.equals("Hoerbuch")) {
        for (Buch bu: hbuecher)
        {
          if(bu.getYear().equals(y) && bu.getTitle().equals(ti)){
            doppelt = true;
          }
        }
        if (doppelt == false){
          hbuecher.add(b);
        }
        else {doppelt = false;}
      }
      else {
        for (Buch bu: ebuecher)
        {
          if(bu.getYear().equals(y) && bu.getTitle().equals(ti)){
            doppelt = true;
          }
        }
        if (doppelt == false){
          ebuecher.add(b);
        }
        else {doppelt = false;}
      }
    }

    System.out.println("Buecher Anzahl: "+buecher.size());
    for (Buch b : buecher) {
          System.out.println("  Buch: "+b.getTitle()+" ("+b.getYear()+")");
    }
    System.out.println("Hörbücher Anzahl: "+hbuecher.size());
    for (Buch b : hbuecher) {
      System.out.println("  Hörbuch: "+b.getTitle()+" ("+b.getYear()+")");
    }
    System.out.println("Ebücher Anzahl: "+ebuecher.size());
    for (Buch b : ebuecher) {
      System.out.println("  Ebuch: "+b.getTitle()+" ("+b.getYear()+")");
    }



  }
}

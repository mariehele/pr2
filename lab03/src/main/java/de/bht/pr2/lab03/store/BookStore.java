package de.bht.pr2.lab03.store;

import de.bht.pr2.lab03.book.Buch;
import de.bht.pr2.lab03.book.EBuch;
import de.bht.pr2.lab03.book.Hörbuch;
import de.bht.pr2.lab03.part1.SumPrices;

import java.util.ArrayList;
import java.util.List;

public class BookStore {



  public static List<String> getSoldBooks() {
    List<String> data = new ArrayList<>();
    // Formate:
    // Buch:     Titel ; Typ des Buches ; Preis ; Auflage
    // Ebuch:    Titel ; Typ des Buches ; Preis ; Auflage ; Tolino-Version
    // Hoerbuch: Titel ; Typ des Buches ; Preis ; Auflage ; Abspielmodus

    data.add("Kingsbridge - Der Morgen einer neuen Zeit;Ebuch;19.99;2020;3");
    data.add("Zwei Handvoll Leben;Ebuch;4.99;2020;3");
    data.add("Der Heimweg;Buch;22.99;2016");
    data.add("Zwei Handvoll Leben;Ebuch;4.99;2020;3");
    data.add("Escape Room;Buch;12.99;2020");
    data.add("Escape Room;Buch;12.99;2020");
    data.add("Ohne Schuld;Ebuch;21.99;2020;5");
    data.add("Zwei Handvoll Leben;Ebuch;4.99;2020;5");
    data.add("Harry Potter - alle 7 Baende;Hoerbuch;63.99;2018;Streaming");
    data.add("Kingsbridge - Der Morgen einer neuen Zeit;Ebuch;19.99;2020;3");
    data.add("Funken Mord;Hoerbuch;18.99;2018;Streaming");
    data.add("Escape Room;Buch;12.99;2020");
    data.add("Escape Room;Buch;12.99;2020");
    data.add("Funken Mord;Hoerbuch;18.99;2018;Download");
    data.add("QualityLand 2.0;Hoerbuch;12.89;2018;Streaming");
    data.add("Ohne Schuld;Ebuch;21.99;2020;3");
    data.add("Zwei Handvoll Leben;Ebuch;4.99;2020;3");
    data.add("Der Heimweg;Buch;22.99;2016");
    data.add("7 Minuten am Tag;Buch;20.00;2016");
    data.add("Harry Potter - alle 7 Baende;Hoerbuch;63.99;2018;CD");
    data.add("Der Heimweg;Ebuch;14.99;2020;5");
    data.add("Der Heimweg;Ebuch;14.99;2020;2");
    data.add("7 Minuten am Tag;Buch;20.00;2016");
    data.add("Funken Mord;Hoerbuch;18.99;2018;Download");
    data.add("QualityLand 2.0;Hoerbuch;12.89;2019;Streaming");
    data.add("Der Heimweg;Buch;22.99;2020");
    data.add("Funken Mord;Hoerbuch;18.99;2019;Download");
    data.add("Kingsbridge - Der Morgen einer neuen Zeit;Ebuch;19.99;2020;5");
    data.add("Der Heimweg;Buch;22.99;2016");
    data.add("Der Heimweg;Ebuch;14.99;2020;3");
    data.add("Kingsbridge - Der Morgen einer neuen Zeit;Ebuch;19.99;2020;2");
    data.add("Escape Room;Buch;12.99;2020");
    data.add("Ohne Schuld;Ebuch;21.99;2020;3");
    data.add("Zwei Handvoll Leben;Ebuch;4.99;2020;5");
    data.add("Ohne Schuld;Buch;24.00;2016");
    data.add("Escape Room;Buch;12.99;2020");
    data.add("Funken Mord;Hoerbuch;18.99;2018;CD");
    data.add("Der Heimweg;Buch;22.99;2020");
    data.add("Harry Potter - alle 7 Baende;Hoerbuch;63.99;2018;Download");
    data.add("7 Minuten am Tag;Buch;20.00;2016");
    data.add("Kingsbridge - Der Morgen einer neuen Zeit;Ebuch;19.99;2020;5");
    data.add("Escape Room;Buch;12.99;2020");
    data.add("Ohne Schuld;Buch;24.00;2020");
    data.add("Funken Mord;Hoerbuch;18.99;2019;Download");
    data.add("Zwei Handvoll Leben;Ebuch;4.99;2020;3");
    data.add("Der Heimweg;Ebuch;14.99;2020;5");
    data.add("Ohne Schuld;Buch;24.00;2016");
    data.add("QualityLand 2.0;Hoerbuch;12.89;2019;Streaming");
    data.add("Ohne Schuld;Buch;24.00;2016");
    data.add("7 Minuten am Tag;Buch;20.00;2016");

    return data;
  }

  public static ArrayList<Buch> getBooks(){

    List<String> store = getSoldBooks();
    ArrayList<Buch> books = new ArrayList<>();


    for (int i=0; i<store.size(); i++){

      String[] st = store.get(i).split(";");

      if(st[1].equals("Buch")){
        Buch b = new Buch(st[0], st[1], st[2]);
        books.add(b);
      }
      else if (st[1].equals("Hoerbuch")){
        Hörbuch h = new Hörbuch(st[0], st[1], st[2], st[4]);
        books.add(h);
      }
      else if (st[1].equals("Ebuch")){
        EBuch e = new EBuch(st[0], st[1], st[2], st[4]);
        books.add(e);
      }


    }


    return books;
  }




}

package de.bht.pr2.lab01;

public class Student {

  //-------------------------------------------
  // Attribute
  private String name = "";
  private int matrikelnummer = 0;
  private String studiengang = "";

  public static final int RUECKMELDUNG_GEBUEHR = 312;

  //-------------------------------
  // Konstruktor
  // Passen Sie den Konstruktor an
  //-------------------------------
  public Student(String datenZeile) {
    String[] stu = datenZeile.split(",",4);

    if (stu.length != 4){
      StudentParseException spe = new StudentParseException(datenZeile);
    }

    name = stu[0];
    //studiengang = stu[2];

    if (stu[1].length() == 5){
      matrikelnummer = Integer.parseInt(stu[1]);
    }
    else{
      RegistrationNumberException rne = new RegistrationNumberException(stu[1]);
    }

    if (stu[2] != "Medieninformatik" && stu[2] != "Technische Informatik" && stu[2] != "Druck- und Medientechnik" && stu[2] != "Screen Based Media" ){
      WrongCourseOfStudiesException wcs = new WrongCourseOfStudiesException(stu[2]);
    }
    else {
      studiengang = stu[2];
    }

    if (stu[3] != "312"){
      NotPaidTuitionFeeException nptf = new NotPaidTuitionFeeException(stu[3]);
    }

  }

  //-------------------------------------------
  // Methoden
  public int getMatrikelnummer() {
    return matrikelnummer;
  }

  public String getName() {
    return name;
  }

  public String getStudiengang() {
    return studiengang;
  }

  public void setMatrikelnummer(int matrikelnummer) {
    this.matrikelnummer = matrikelnummer;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setStudiengang(String studiengang) {
    this.studiengang = studiengang;
  }

  public String toString() {
    return "name: " + name
        + ", matrikelnummer: " + matrikelnummer +
        ", studiengang:" + studiengang;
  }
}

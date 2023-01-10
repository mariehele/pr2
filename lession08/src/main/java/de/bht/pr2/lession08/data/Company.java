package de.bht.pr2.lession08.data;

import java.util.LinkedList;
import java.util.List;

public class Company extends AbstractEntity {

  private String name;

  private List<Contact> employees = new LinkedList<>();

  private int employeeCount;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Contact> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Contact> employees) {
    this.employees = employees;
  }

  public int getEmployeeCount() {
    return employeeCount;
  }
}

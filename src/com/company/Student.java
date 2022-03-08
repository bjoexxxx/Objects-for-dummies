package com.company;

import java.util.Arrays;

public class Student {
  private String navn;
  private int studienummer;
  private int telefonnummer;
  private boolean tutor;
  private int[] grades;

  public Student(String navn,int studienummer,int telefonnummer, boolean tutor, int[] grades){
    this.navn = navn;
    this.studienummer = studienummer;
    this.telefonnummer = telefonnummer;
    this.tutor = tutor;
    this.grades = grades;
  }

  @Override
  public String toString() {
    return "Student{" +
        "navn='" + navn + '\'' +
        ", studienummer=" + studienummer +
        ", telefonnummer=" + telefonnummer +
        ", tutor=" + tutor +
        ", grades=" + Arrays.toString(grades) +
        '}';
  }

  public void setGrades(int[] grades){
    this.grades = grades;
  }
  public void addGrade(int grade){
    int[] addGrade = new int[this.grades.length+1];
    for (int i=0; i<addGrade.length; i++) {
      if (i!=addGrade.length-1){
        addGrade[i]=this.grades[i];
      } else {
        addGrade[i]=grade;
      }
    }
    this.grades=addGrade;
  }
  public int[] getGrades(){
    return this.grades;
  }
  public void setName(String navn){
    this.navn = navn;
  }
  public String getNavn(){
    return this.navn;
  }
  public void setNummer(int nummer){
    this.studienummer = nummer;
  }
  public int getNummer(){
    return this.studienummer;
  }
  public void setTelefon(int telefon){
    this.telefonnummer = telefon;
  }
  public int getTelefon(){
    return this.telefonnummer;
  }
  public void setTutor(boolean tutor){
    this.tutor = tutor;
  }
  public boolean getTutor(){
    return this.tutor;
  }
}

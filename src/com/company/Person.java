package com.company;

public class Person {
  private String navn;
  private int alder;

  public Person(String navn,int alder){
    this.navn = navn;
    this.alder = alder;
  }
  public void setNavn(String navn){
    this.navn = navn;
  }
  public String getNavn(){
    return this.navn;
  }
  public void setAlder(int alder){
    this.alder = alder;
  }
  public int getAlder(){
    return this.alder;
  }
  public void harFødselsdag(){
    this.alder++;
  }

  @Override
  public String toString() {
    return "Person:" +
        "navn='" + navn + '\'' +
        ", alder=" + alder;
  }
}

package com.company;


public class Terning {
  int ansigtsVærdi;
  public Terning(int ansigtsVærdi){
    this.ansigtsVærdi = ansigtsVærdi;
  }
  public void setAnsigtsVærdi(int ansigtsVærdi){
    this.ansigtsVærdi = ansigtsVærdi;
  }
  public int getAnsigtsVærdi(int ansigtsVærdi){
    return this.ansigtsVærdi;
  }
  public String toString(){
    return "Ansigtsværdi er:" + this.ansigtsVærdi;
  }
}

package com.company;

public class Lampe {
  boolean state;
  public Lampe(boolean state){
    this.state = state;
  }
  public Lampe(){

  }
  public void kontakt(){
    if (this.state == false){
      this.state = true;
    } else {this.state = false;}
  }
  public boolean getState(){
    return this.state;
  }
}

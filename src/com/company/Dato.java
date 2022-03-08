package com.company;

public class Dato {
  private int dag;
  private int måned;
  private int år;
  public Dato(int dag, int måned, int år){
    this.dag = dag;
    this.måned = måned;
    this.år = år;
  }
  public void setDag(int dag){
    this.dag = dag;
  }
  public int getDag(){
    return this.dag;
  }
  public String toString(){
    return "i dag er det den "+this.dag+"/"+this.måned+"/"+this.år;
  }
  public void justerDato(){
    this.dag++;
    if (this.dag==32){
      this.dag = 1;
      this.måned++;
      if (this.måned == 13){
        this.måned = 1;
        this.år++;
      }
    }
  }
}

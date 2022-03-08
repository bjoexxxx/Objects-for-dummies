package com.company;

import java.util.Random;

public class Main {
    Random roll = new Random();

    public static void main(String[] args) {
	// write your code here
        Main action = new Main();
        Student Bjørn = new Student("Bjørn", 6702, 41578226, false, new int[]{0,1,2,3,4,5,6});
        Bjørn.addGrade(7);
        Bjørn.addGrade(10);
        //System.out.println(Bjørn);
        Student Rasmus = new Student("Rasmus", 1234, 12345678, true, new int[]{8,9,10,11,12,13,14});
        //System.out.println(Rasmus);
        Person Rasputin = new Person("Rasputin",30);
        Rasputin.harFødselsdag();
        //System.out.println(Rasputin);
        Terning sekser = new Terning(action.roll.nextInt(1,7));
        //System.out.println(sekser);
        Lampe lampe1 = new Lampe(true);
        //System.out.println(lampe1.getState());
        Lampe lampe2 = new Lampe();
        lampe2.kontakt();
        System.out.println(lampe2.getState());
        Dato idag = new Dato(31,12,2022);
        idag.justerDato();
        System.out.println(idag);


    }
}

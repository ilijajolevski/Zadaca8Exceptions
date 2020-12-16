package fikt.edu.mk;

import organizacija.lugje.Student;

public class Main {

    public static void main(String[] args) {

        Covek ilija = null;

        try {
            ilija = new Covek(1000,"ilija", "Jol");
            ilija.setIme("Ilija");
            System.out.println("Obj: " + ilija);
        } catch (NevalidniGodiniException greskata) {
            System.out.println("Ne mozam da napravam covek so tolku godini");
            System.out.println(greskata.toString());
        }

        Student s;
        try {
             s = new Student(20,"ime", "prez", 99);
        } catch (NevalidniGodiniException e) {
            e.printStackTrace();
        }

    }
}

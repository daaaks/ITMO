package lab2;

import ru.ifmo.se.pokemon.*;
import pokemon.*;
import move.*;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Tauros p1 = new Tauros("Таурос", 2);
        Chinchou p2 = new Chinchou("Чинчоу", 2);
        Lanturn p3 = new Lanturn("Лантурн", 2);
        Grubbin p4 = new Grubbin("Граббин", 2);
        Charjabug p5 = new Charjabug("Чарджабаг", 2);
        Vikavolt p6 = new Vikavolt("Викавольт", 2);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }

}

package HerançaMultipla_Interfaces.application;

import HerançaMultipla_Interfaces.devices.ComboDevice;
import HerançaMultipla_Interfaces.devices.ConcretePrinter;
import HerançaMultipla_Interfaces.devices.ConcreteScanner;

public class Program {

    public static void main(String[] args) {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        System.out.println();
        ComboDevice c = new ComboDevice("2023");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}

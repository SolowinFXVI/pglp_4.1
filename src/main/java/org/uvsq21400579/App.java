package org.uvsq21400579;

import org.uvsq21400579.Personnel.PersonnelBuilder;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) {
    Personnel p1 = new PersonnelBuilder("A","B","45").id(1).build();
    Personnel p2 = new PersonnelBuilder("C","D","56").fonction("Senior").id(2).build();
    Personnel p3 = new PersonnelBuilder("E","F", "32").numero_tel("0102030405060").id(3).build();
    Personnel p4 = new PersonnelBuilder("BDQF","SDFG","53").id(4).build();
    Personnel p5 = new PersonnelBuilder("SFG","HTYFH","28").id(5).build();
    Personnel p6 = new PersonnelBuilder("JDFG","SFGDGH","34").id(6).build();
    Personnel p7 = new PersonnelBuilder("SDFG", "SHKKF", "45").id(7).build();

    CompositePersonnels composite1 = new CompositePersonnels();
    CompositePersonnels composite2 = new CompositePersonnels();
    CompositePersonnels composite3 = new CompositePersonnels();

    composite1.add(p1);
    composite1.add(p2);
    composite1.add(p3);
    composite2.add(p3);
    composite2.add(p4);
    composite2.add(p5);
    composite3.add(p6);
    composite2.add(p7);
    composite3.add(composite2);
    composite1.print();
    composite2.print();
    composite3.print();
  }
}

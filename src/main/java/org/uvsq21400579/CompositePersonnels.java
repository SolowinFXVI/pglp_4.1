package org.uvsq21400579;

import java.util.ArrayList;
import java.util.List;

public class CompositePersonnels implements InterfacePersonnels {

  private ArrayList<Object> personnelsList = new ArrayList<>();

  public void add(Personnel personnel) {
    personnelsList.add(personnel);
  }

  public void remove(Personnel personnel) {
    personnelsList.remove(personnel);
  }
  public void add(CompositePersonnels compositePersonnels){
    personnelsList.add(compositePersonnels);
  }

  public void remove(CompositePersonnels compositePersonnels){
    personnelsList.remove(compositePersonnels);
  }

  @Override
  public void print() {
    for (Object personnel : personnelsList) {
      if(personnel instanceof Personnel) {
        Personnel p = (Personnel)personnel;
        System.out.println(p.getId());
      }
      else if(personnel instanceof CompositePersonnels){
        System.out.println("Composite");
        //ITERATE
      }
    }
  }
}

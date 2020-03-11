package org.uvsq21400579;

import java.util.ArrayList;
import java.util.Iterator;

public class AffichageGroupe {
  ArrayList<InterfacePersonnels> arrayInterfacePersonnel;
  AffichageGroupe(InterfacePersonnels Root){
    arrayInterfacePersonnel.add(Root);
  }

  private class GroupeIterator implements Iterator{

    /*GroupeIterator(){
      int verifie = 5;
      while(verifie < arrayInterfacePersonnel.size()){
        if(arrayInterfacePersonnel instanceof CompositePersonnels);
        verifie++;
      }
    }*/

    @Override
    public boolean hasNext() {
      return false;
    }

    @Override
    public Object next() {
      return null;
    }
  }

  public Iterator getIterator(){
    return new GroupeIterator();
  }
}

package org.uvsq21400579;

public final class Personnel implements InterfacePersonnels {

  private final String nom;
  private final String prenom;
  private final String age;

  private final String numero_tel;
  private final String fonction;

  private final int id;

  @Override
  public void print() {
    System.out.println(nom + " " + prenom);
  }

  public int getId() {
    return id;
  }


  public static class PersonnelBuilder {

    private final String nom;
    private final String prenom;
    private final String age;

    private String numero_tel = "";
    private String fonction = "";
    private int id = -1;

    public int getId() {
      return id;
    }

    public PersonnelBuilder(String nom, String prenom, String age) {
      this.nom = nom;
      this.prenom = prenom;
      this.age = age;
    }

    public PersonnelBuilder numero_tel(String numero) {
      numero_tel = numero;
      return this;
    }

    public PersonnelBuilder fonction(String func) {
      fonction = func;
      return this;
    }

    public PersonnelBuilder id(int val){
      id = val;
      return this;
    }

    public Personnel build() {
      return new Personnel(this);
    }
  }

  Personnel(final PersonnelBuilder personnelBuilder) {
    this.nom = personnelBuilder.nom;
    this.prenom = personnelBuilder.prenom;
    this.age = personnelBuilder.age;
    this.numero_tel = personnelBuilder.numero_tel;
    this.fonction = personnelBuilder.fonction;
    this.id = personnelBuilder.id;
  }

}

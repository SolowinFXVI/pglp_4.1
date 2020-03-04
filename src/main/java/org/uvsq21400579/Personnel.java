package org.uvsq21400579;

public final class Personnel implements InterfacePersonnels{
    private final String nom;
    private final String prenom;
    private final String age;

    private final  String numero_tel;
    private final String fonction;

    @Override
    public void print() {
        System.out.println(nom + " " + prenom);
    }


    public static class PersonnelBuilder{
        private final String nom;
        private final String prenom;
        private final String age;

        private String numero_tel = "";
        private String fonction = "";

        public PersonnelBuilder(String nom, String prenom, String age) {
            this.nom = nom;
            this.prenom = prenom;
            this.age = age;
        }

        public PersonnelBuilder numero_tel(String numero){
            numero_tel=numero;
            return this;
        }

        public PersonnelBuilder fonction(String func){
            fonction = func;
            return this;
        }

        public Personnel build(){
            return new Personnel(this);
        }
    }

    Personnel(PersonnelBuilder personnelBuilder){
        this.nom = personnelBuilder.nom;
        this.prenom = personnelBuilder.prenom;
        this.age = personnelBuilder.age;
        this.numero_tel = personnelBuilder.numero_tel;
        this.fonction = personnelBuilder.fonction;
    }
}

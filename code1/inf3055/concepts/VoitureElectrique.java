package inf3055.concepts;

class VoitureElectrique extends Voiture {
    private String typeChargeur;

    public VoitureElectrique(String nom, int puissance, boolean estDemarre, double vitesse, String typeChargeur) {
        super(nom, puissance, estDemarre, vitesse);
        this.typeChargeur = typeChargeur;
    }
}

class Voiture {
    private String nom;
    private int puissance;
    private boolean estDemarre;
    private double vitesse;

    public Voiture(String nom, int puissance, boolean estDemarre, double vitesse) {
        this.nom = nom;
        this.puissance = puissance;
        this.estDemarre = estDemarre;
        this.vitesse = vitesse;
    }

    public void afficher() {
        System.out.println("Nom: " + nom + ", Puissance: " + puissance + ", Demarré: " + estDemarre + ", Vitesse: " + vitesse);
    }
}

class TestVoitureElectrique {
    public static void main(String[] args) {
        VoitureElectrique maVoitureElectrique;
        maVoitureElectrique = new VoitureElectrique("VoitureElect", 5, false, 1, "Chargeur20");
        maVoitureElectrique.afficher();
    }
}
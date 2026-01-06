package inf3055.concepts;

class VoitureElectrique extends Voiture {
    private String typeChargeur;
    
    public void afficher() {
        super.afficher();
        System.out.println("Type : Electrique");
        System.out.println("Chargeur : " + typeChargeur);
    }
}
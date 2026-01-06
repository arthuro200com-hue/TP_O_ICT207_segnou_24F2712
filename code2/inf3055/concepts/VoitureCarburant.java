package inf3055.concepts;

class VoitureCarburant extends Voiture {
    private String typeCarburant;
    
    public void afficher() {
        super.afficher();
        System.out.println("Type : Carburant");
        System.out.println("Carburant : " + typeCarburant);
    }
}
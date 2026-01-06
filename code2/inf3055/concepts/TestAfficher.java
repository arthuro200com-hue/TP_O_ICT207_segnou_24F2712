package inf3055.concepts;

class TestAfficher {
    public static void main(String[] args) {
        VoitureElectrique voitureElectrique = new VoitureElectrique();
        voitureElectrique.demarre();
        voitureElectrique.accelere(120.5f);
        voitureElectrique.afficher();
        
        VoitureCarburant voitureCarburant = new VoitureCarburant();
        voitureCarburant.demarre();
        voitureCarburant.accelere(100.0f);
        voitureCarburant.afficher();
    }
}
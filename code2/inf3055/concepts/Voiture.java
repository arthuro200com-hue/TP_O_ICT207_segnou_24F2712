package inf3055.concepts;

class Voiture {
    private int puissance;
    private boolean estDemarree;
    private float vitesse;
    
    public int deQuellePuissance() {
        return puissance;
    }
    
    public void demarre() {
        estDemarree = true;
    }
    
    public void accelere(float p1) {
        vitesse = p1;
    }
    
    public void afficher() {
        System.out.println("Puissance: " + puissance + ", Demarree: " + estDemarree + ", Vitesse: " + vitesse);
    }
}
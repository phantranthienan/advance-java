import java.util.ArrayList;
import java.util.List;

public class Caisse {
    private int numeroCaisse;
    private int departement;
    private List<Allocataire> allocataires;

    public Caisse(int numeroCaisse, int departement) {
        this.numeroCaisse = numeroCaisse;
        this.departement = departement;
        this.allocataires = new ArrayList<>();
    }

    public void addAllocataire(Allocataire allocataire) {
        allocataires.add(allocataire);
    }

    //Getters
    public List<Allocataire> getAllocataires() {
        return allocataires;
    }

    public int getNumeroCaisse() {
        return numeroCaisse;
    }

    public int getDepartement() {
        return departement;
    }
}

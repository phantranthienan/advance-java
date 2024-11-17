import java.util.Date;

public class Allocataire extends Personne{
    private double allocMensuelle;

    public Allocataire(String numeroSecu, Date dateDeNaissance, String nom, String prenom, Genre genre, double allocMensuelle) {
        super(numeroSecu, dateDeNaissance, nom, prenom, genre);
        this.allocMensuelle = allocMensuelle;
    }

    public String toString() {
        return super.toString() + ", Allocation mensuelle: " + allocMensuelle + " €";
    }

    //Getters and Setters
    public double getAllocMensuelle() {
        return allocMensuelle;
    }

    public void setAllocMensuelle(double allocMensuelle) {
        this.allocMensuelle = allocMensuelle;
    }
}

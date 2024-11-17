import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Personne {
    private static Map<String, Personne> existingPersons = new HashMap<>();

    public enum Genre {
        FEMME, HOMME;
    }
    private String numeroSecu;
    private Date dateDeNaissance;
    private String nom;
    private String prenom;
    private Genre genre;
    private Personne parent1;
    private Personne parent2;
    private Personne[] enfants;

    public Personne() {
    }

    public Personne(String numeroSecu, Date dateDeNaissance, String nom, String prenom, Genre genre) {
        if (existingPersons.containsKey(numeroSecu)) {
            throw new IllegalArgumentException("Le numeroSecu " + numeroSecu + " est déjà utilisé.");
        }

        this.numeroSecu = numeroSecu;
        this.dateDeNaissance = dateDeNaissance;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;

        existingPersons.put(numeroSecu, this);
    }

    public Personne(String numeroSecu, Date dateDeNaissance, String nom, String prenom, Genre genre,
                    Personne parent1, Personne parent2) {
        this(numeroSecu, dateDeNaissance, nom, prenom, genre);
        this.parent1 = parent1;
        this.parent2 = parent2;
    }

    public Personne(String numeroSecu, Date dateDeNaissance, String nom, String prenom, Genre genre,
                    Personne parent1, Personne parent2, Personne[] enfants) {
        this(numeroSecu, dateDeNaissance, nom, prenom, genre, parent1, parent2);
        this.enfants = enfants;
    }

    public String getNomPrenom() {
        return nom + " " + prenom;
    }

    public int getAge(Date dateDuJour) {
        long ageInMillis = dateDuJour.getTime() - dateDeNaissance.getTime();
        int ageInYears = (int) (ageInMillis / (1000L * 60 * 60 * 24 * 365));
        return ageInYears;
    }

    public void afficherFamille() {
        System.out.println("Person: " + getNomPrenom());
        System.out.println("Parents:");
        if (parent1 != null) {
            System.out.println("- Parent 1: " + parent1.getNomPrenom());
        } else {
            System.out.println("- Parent 1: Unknown");
        }
        if (parent2 != null) {
            System.out.println("- Parent 2: " + parent2.getNomPrenom());
        } else {
            System.out.println("- Parent 2: Unknown");
        }

        // Display children
        System.out.println("Children:");
        if (enfants != null && enfants.length > 0) {
            for (Personne enfant : enfants) {
                System.out.println("- " + enfant.getPrenom());
            }
        } else {
            System.out.println("No children.");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Nom: " + nom + " " + prenom + ", Âge: " + getAge(new Date()) + " ans";
    }

    //Getters and setters
    public String getNumeroSecu() {
        return numeroSecu;
    }

    public void setNumeroSecu(String numeroSecu) {
        this.numeroSecu = numeroSecu;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Personne getParent1() {
        return parent1;
    }

    public void setParent1(Personne parent1) {
        this.parent1 = parent1;
    }

    public Personne getParent2() {
        return parent2;
    }

    public void setParent2(Personne parent2) {
        this.parent2 = parent2;
    }

    public Personne[] getEnfants() {
        return enfants;
    }

    public void setEnfants(Personne[] enfants) {
        this.enfants = enfants;
    }
}

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*------------------------- TEST 1 -------------------------*/
//        Personne father = new Personne("12345", new Date(1975 - 1900, 6, 15), "Doe", "John", Personne.Genre.HOMME);
//        Personne mother = new Personne("67890", new Date(1980 - 1900, 9, 20), "Doe", "Jane", Personne.Genre.FEMME);
//
//        Personne child1 = new Personne("11223", new Date(2005 - 1900, 3, 10), "Doe", "Emily", Personne.Genre.FEMME, father, mother);
//        Personne child2 = new Personne("44556", new Date(2010 - 1900, 7, 25), "Doe", "James", Personne.Genre.HOMME, father, mother);
//
//        father.setEnfants(new Personne[]{child1, child2});
//        mother.setEnfants(new Personne[]{child1, child2});
//
//        System.out.println("Father's Family:");
//        father.afficherFamille();
//
//        System.out.println("Mother's Family:");
//        mother.afficherFamille();
//
//        System.out.println("Child 1's Family:");
//        child1.afficherFamille();
//
//        System.out.println("Child 2's Family:");
//        child2.afficherFamille();

        /*------------------------- TEST 2 -------------------------*/
//        Caisse caisse = new Caisse(1, 75); // Fund 1 in department 75 (Paris)
//
//        Allocataire allocataire1 = new Allocataire("12345", new Date(1980 - 1900, 5, 15), "Doe", "John", Personne.Genre.HOMME, 1200.50);
//        Allocataire allocataire2 = new Allocataire("67890", new Date(1985 - 1900, 7, 20), "Smith", "Jane", Personne.Genre.FEMME, 950.00);
//
//        caisse.addAllocataire(allocataire1);
//        caisse.addAllocataire(allocataire2);
//
//        System.out.println("Caisse Information:");
//        System.out.println("Fund Number: " + caisse.getNumeroCaisse());
//        System.out.println("Department: " + caisse.getDepartement());
//
//        System.out.println("\nAllocataires in the Fund:");
//        for (Allocataire allocataire : caisse.getAllocataires()) {
//            System.out.println("- " + allocataire.getNomPrenom() + " | Allocation: " + allocataire.getAllocMensuelle());
//        }

        /*------------------------- TEST 3 -------------------------*/
//        Personne personne = new Personne("12345", new Date(1985 - 1900, 4, 15), "Doe", "John", Personne.Genre.HOMME);
//        System.out.println(personne);
//
//        Allocataire allocataire = new Allocataire("67890", new Date(1990 - 1900, 6, 20), "Smith", "Jane", Personne.Genre.FEMME, 1200.50);
//        System.out.println(allocataire);

        /*------------------------- TEST 4 -------------------------*/
        try {
            Personne person1 = new Personne("12345", new Date(1985 - 1900, 4, 15), "Doe", "John", Personne.Genre.HOMME);
            System.out.println(person1);

            Personne person2 = new Personne("12345", new Date(1990 - 1900, 7, 10), "Smith", "Jane", Personne.Genre.FEMME);
            System.out.println(person2); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}

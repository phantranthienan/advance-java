public class Employee {
    private int numeroEmp;
    private static int nombreEmp = 0;
    private String nom;
    private String prenom;
    private double salaireMensuel;
    private double primeAnnuelle;

    public static void resetCounter() {
        nombreEmp = 0;
    }

    public Employee(String nom, String prenom, double salaireMensuel, double primeAnnuelle) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaireMensuel = salaireMensuel;
        this.primeAnnuelle = primeAnnuelle;
        this.numeroEmp = nombreEmp;
        nombreEmp++;
    }

    //Getters

    public int getNumeroEmp() {
        return numeroEmp;
    }

    public String getNomPrenom() {
        return nom + ", " + prenom;
    }

    public double getSalaireAnnuel() {
        return 12 * salaireMensuel + primeAnnuelle;
    }

    public static int getNombreEmployes() {
        return nombreEmp;
    }
}
